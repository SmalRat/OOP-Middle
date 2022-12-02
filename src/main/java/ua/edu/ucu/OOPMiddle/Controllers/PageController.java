package ua.edu.ucu.OOPMiddle.Controllers;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.ucu.OOPMiddle.Service.PageService;

import java.io.IOException;

@Controller
@RequestMapping("/Finder")
public class PageController {
    @Autowired
    private PageService pageService;

    @GetMapping("/")
    public ModelAndView viewDefaultPage() {
        return new ModelAndView("form");
    }

    //@ModelAttribute("company") Company company
    @PostMapping("/")
    public ModelAndView viewFoundInfo(@RequestParam String domain) throws UnirestException, JSONException, IOException {
        ModelAndView modelAndView = new ModelAndView("company");
        pageService.searchCompany(modelAndView, domain);

        return modelAndView;
    }
}
