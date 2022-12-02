package ua.edu.ucu.OOPMiddle.domens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/domen")
public class DomenController {

    private final DomenService domenService;

    @Autowired
    public DomenController(DomenService domenService) {
        this.domenService = domenService;
    }

    @GetMapping
    public List<Domen> getDomens() {
        return domenService.getDomens();
    }

    @PostMapping
    public void registerNewDomen(@RequestBody Domen domen) {
        domenService.addNewDomen(domen);
    }

    @DeleteMapping (path = "{domenId}")
    public void deleteDomen (@PathVariable("domenId") Long domenId) {
        domenService.deleteDomen(domenId);
    }
}
