//package ua.edu.ucu.OOPMiddle.Controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import ua.edu.ucu.OOPMiddle.Company.Company;
//import ua.edu.ucu.OOPMiddle.Service.DomenService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api/v1/domen")
//public class TestController {
//
//    private final DomenService domenService;
//
//    @Autowired
//    public TestController(DomenService domenService) {
//        this.domenService = domenService;
//    }
//
//    @GetMapping
//    public List<Company> getDomens() {
//        return domenService.getDomens();
//    }
//
//    @PostMapping
//    public void registerNewDomen(@RequestBody Company company) {
//        domenService.addNewDomen(company);
//    }
//
//    @DeleteMapping (path = "{domenId}")
//    public void deleteDomen (@PathVariable("domenId") Long domenId) {
//        domenService.deleteDomen(domenId);
//    }
//}
