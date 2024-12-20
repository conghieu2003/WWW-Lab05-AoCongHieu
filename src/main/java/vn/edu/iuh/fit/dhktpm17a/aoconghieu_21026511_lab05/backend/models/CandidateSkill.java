package vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.enums.SkillLevel;
import vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.ids.CandidateSkillID;

@Entity
@Table(name = "candidate_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CandidateSkillID.class)
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", length = 1000)
    private String moreInfo;

//    public CandidateSkill(Skill skill, Candidate candidate, SkillLevel skillLevel, String moreInfo) {
//        this.skill = skill;
//        this.candidate = candidate;
//        this.skillLevel = skillLevel;
//        this.moreInfo = moreInfo;
//    }
}