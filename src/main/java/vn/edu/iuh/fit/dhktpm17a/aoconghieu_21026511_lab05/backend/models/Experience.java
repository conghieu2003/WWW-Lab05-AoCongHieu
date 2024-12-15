package vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Table(name = "experience")
public class Experience implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;
    @Column(name = "company",nullable = false, length = 120)
    private String companyName;
    @Column(name = "from_date",nullable = false)
    private LocalDate fromDate;
    @Column(name = "to_date",nullable = false)
    private LocalDate toDate;
    @Column(name = "role",nullable = false, length = 100)
    private String role;
    @Column(name = "work_desc",nullable = false, length = 400)
    private String workDescription;

    //=============================RELATIONSHIPS====================
    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;

//    public Experience(long id, String companyName, LocalDate fromDate, LocalDate toDate, String role, String workDescription, Candidate candidate) {
//        this.id = id;
//        this.companyName = companyName;
//        this.fromDate = fromDate;
//        this.toDate = toDate;
//        this.role = role;
//        this.workDescription = workDescription;
//        this.candidate = candidate;
//    }
}