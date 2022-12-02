package ua.edu.ucu.OOPMiddle.domens;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Domen {
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
    private String name;
    private String twitter;
    private String facebook;
    private String logo;
    private String icon;
    private String employees;
    private String address;

    public Domen(String name, String twitter, String facebook, String logo, String icon, String employees, String address) {
        this.name = name;
        this.twitter = twitter;
        this.facebook = facebook;
        this.logo = logo;
        this.icon = icon;
        this.employees = employees;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Domen{" +
                "Id=" + Id +
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
