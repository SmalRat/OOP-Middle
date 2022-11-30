package ua.edu.ucu.OOPMiddle.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.OOPMiddle.Company.Company;
import ua.edu.ucu.OOPMiddle.Service.PageService;

@RestController
@RequestMapping("/Finder")
public class PageController {
    @Autowired
    private PageService pageService;

    @GetMapping
    public String defaultPage() {
        return "default";
    }

    @PostMapping
    public Company findInfo(@RequestBody String domain) {
        return pageService.processDomain(domain);
    }
}
