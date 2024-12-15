package vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;
import org.apache.logging.log4j.util.StringBuilders;

import java.io.Serializable;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;
    @Column(name = "number", length = 20)
    private String number;
    @Column(name = "Street", length = 150)
    private String street;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "zipcode", length = 7)
    private String zipcode;
    @Column(name = "country", length = 30)
    private CountryCode country = CountryCode.VN;


    public Address(String number, String street, String city, String zipcode, CountryCode country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    @Override
    public String toString() {
        return number + ", " + street + ", " + city + ", " + zipcode + ", " + country.getName();
    }
}