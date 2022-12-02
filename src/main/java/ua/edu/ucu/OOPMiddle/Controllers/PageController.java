package ua.edu.ucu.OOPMiddle.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.OOPMiddle.Company.Company;
import ua.edu.ucu.OOPMiddle.Service.PageService;

@Controller
@RequestMapping("/Finder")
public class PageController {
    @Autowired
    private PageService pageService;

    @GetMapping("/")
    public String viewDefaultPage(Model model) {
        Company company = new Company();
        model.addAttribute("company", company);
        return "company";
    }

    @PostMapping("/submit")
    public String viewFoundInfo(@ModelAttribute("company") Company company) {
        return "results";
    }
}
