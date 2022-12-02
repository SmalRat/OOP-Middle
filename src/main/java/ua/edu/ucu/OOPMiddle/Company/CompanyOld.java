//package ua.edu.ucu.OOPMiddle.Company;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import org.hibernate.annotations.NaturalId;
//
//
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Table
//@Entity
//public class CompanyOld {
//    @Id
//    @GeneratedValue
//    private int id;
//    @NaturalId
//    private String companyDomain;
//    private String companyName;
//    private String twitterUrl;
//    private String facebookUrl;
//    private String companyLogo;
//    private String companyIcon;
//    private String numberEmployees;
//    private String companyAddress;
//
//
//    public String toString() {
//        return "Company(companyName: " + this.companyName +
//                ", twitterUrl: " + this.twitterUrl +
//                ", facebookUrl: " + this.facebookUrl +
//                ", companyLogo: " + this.companyLogo +
//                ", companyIcon: " + this.companyIcon +
//                ", numberEmployees: " + this.numberEmployees +
//                ", companyAddress: " + this.companyAddress +
//                ", companyDomain: " + this.companyDomain + ")";
//    }
//}