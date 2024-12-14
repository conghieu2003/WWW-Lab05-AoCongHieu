package vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.models.Candidate;
import vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.repositories.CandidateRepository;

import java.util.List;

@Service
public class CandidateService {
@Autowired
private CandidateRepository candidateRepository;

    public Page<Candidate> findAll(int pageNo, int pageSize, String sortBy, String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
//        return candidateRepository.findAll(pageable);
        return candidateRepository.findAllByStatus(1, pageable);
    }
    public Page<Candidate> findPaginated(Pageable pageable) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Candidate> list;
        List<Candidate> candidates = candidateRepository.findAll();

        if (candidates.size() < startItem) {
            list = candidates.subList(0, 0);
        } else {
            int toIndex = Math.min(startItem + pageSize, candidates.size());
            list = candidates.subList(startItem, toIndex);
        }

        Page<Candidate> candidatePage
                = new PageImpl<>(list, PageRequest.of(currentPage, pageSize), candidates.size());

        return candidatePage;
    }

}
