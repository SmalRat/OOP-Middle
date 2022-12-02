package ua.edu.ucu.OOPMiddle.Parsers;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.OOPMiddle.Company.Company;

@Setter
@Getter
public abstract class Parser implements ParserInterface {
    protected String domain = null;
    protected String name = null;
    protected String twitter = null;
    protected String facebook = null;
    protected String logo = "default";
    protected String icon = "default";
    protected String employees = null;
    protected String address = null;

    protected void fillFields(Company company){
        if (company.getDomain() == null && this.domain != null){
            company.setDomain(domain);
        }
        if (company.getName() == null && this.name != null){
            company.setName(name);
        }
        if (company.getTwitter() == null && this.twitter != null){
            company.setTwitter(twitter);
        }
        if (company.getFacebook() == null && this.facebook != null){
            company.setFacebook(facebook);
        }
        if (company.getLogo() == null && this.logo != null){
            company.setLogo(logo);
        }
        if (company.getIcon() == null && this.icon != null){
            company.setIcon(icon);
        }if (company.getEmployees() == null && this.employees != null){
            company.setEmployees(employees);
        }
        if (company.getAddress() == null && this.address != null){
            company.setAddress(address);
        }

    }
}
