//package ua.edu.ucu.OOPMiddle.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.servlet.ModelAndView;
//import ua.edu.ucu.OOPMiddle.Company.Company;
//import ua.edu.ucu.OOPMiddle.DataAccess.CompanyRepository;
//import ua.edu.ucu.OOPMiddle.Parsers.GooglePlaces;
//import ua.edu.ucu.OOPMiddle.Parsers.PDLReader;
//import ua.edu.ucu.OOPMiddle.Parsers.Parser;
//import ua.edu.ucu.OOPMiddle.Parsers.ParserInterface;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PageService {
//    @Autowired
//    CompanyRepository companyRepository;
//    public Company searchCompany(ModelAndView modelAndView, String domain) {
//        Optional<Company> domainOptional = companyRepository
//                .findDomenByName(domain);
//        if (domainOptional.isEmpty()){
//            Company company = parseCompany(domain);
//            companyRepository.save(company);
//            return company;
//        }
//        //return companyRepository.getByDomain(domain);
//        return new Company();
//
//
//        //modelAndView.addObject("domain", domain);
//
//    }
//
//    private Company parseCompany(String domain){
//        List<Class> parsersList = new ArrayList<Class>();
//        parsersList.add(PDLReader.class);
//        parsersList.add(GooglePlaces.class);
//        parsersList.add(Parser.class);
//        for (Class parserClass : parsersList) {
//            //Parser parser = parserClass.invo;
//        }
//        Parser parser = new Parser();
//        GooglePlaces googlePlaces = new GooglePlaces();
//        PDLReader pdlReader = new PDLReader();
//        Company company = new Company();
//        //parser.parseCompany(company);
//        return company;
//    }
////    @Autowired
////    private CompanyRepository companyRepository;
////    public Company processDomain(String domain) {
////        boolean inDatabase = companyRepository.existsByCompanyName(domain);
////        if (inDatabase){
////            return companyRepository.getCompany(domain);
////        }
////
////    }
//
//
//}
