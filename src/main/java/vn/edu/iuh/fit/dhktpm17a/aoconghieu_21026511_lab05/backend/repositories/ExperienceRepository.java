package vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.models.Candidate;
import vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.models.Experience;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
