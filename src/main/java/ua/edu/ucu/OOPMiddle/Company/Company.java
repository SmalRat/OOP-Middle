package ua.edu.ucu.OOPMiddle.Company;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Company {
    @Id
    @SequenceGenerator(
            name = "domen_sequence",
            sequenceName = "domen_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "domen_sequence"
    )
    private Long Id;
    //@NaturalId
    private String domain = null;
    private String name = null;
    private String twitter = null;
    private String facebook = null;
    private String logo = null;
    private String icon = null;
    private String employees = null;
    private String address = null;

    public Company(String name, String domain, String twitter, String facebook, String logo, String icon, String employees, String address) {
        this.name = name;
        this.domain = domain;
        this.twitter = twitter;
        this.facebook = facebook;
        this.logo = logo;
        this.icon = icon;
        this.employees = employees;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "Id=" + Id +
                ", domain= " + domain +'\'' +
                ", name='" + name + '\'' +
                ", twitter='" + twitter + '\'' +
                ", facebook='" + facebook + '\'' +
                ", logo='" + logo + '\'' +
                ", icon='" + icon + '\'' +
                ", employees='" + employees + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
