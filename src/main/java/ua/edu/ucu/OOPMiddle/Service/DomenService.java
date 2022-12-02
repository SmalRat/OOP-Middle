//package ua.edu.ucu.OOPMiddle.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import ua.edu.ucu.OOPMiddle.Company.Company;
//import ua.edu.ucu.OOPMiddle.DataAccess.CompanyRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DomenService {
//
//    private final CompanyRepository companyRepository;
//
//    @Autowired
//    public DomenService(CompanyRepository companyRepository) {
//        this.companyRepository = companyRepository;
//    }
//
//    public List<Company> getDomens() {
//        return companyRepository.findAll();
//    }
//
//    public void addNewDomen(Company company) {
//        Optional<Company> domenOptioanl = companyRepository
//                .findDomenByName(company.getName());
//        if (domenOptioanl.isPresent()) {
//            throw new IllegalStateException("name already exist");
//        }
//        companyRepository.save(company);
////        System.out.println(domen);
//    }
//
//    public void deleteDomen(Long domenId) {
//        boolean exists = companyRepository.existsById(domenId);
//        if (!exists) {
//            throw new IllegalStateException("domen with Id " + domenId + " does not exist");
//        }
//        companyRepository.deleteById(domenId);
//    }
//}
