package pl.technical.editor.Service.AvailableMappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.technical.editor.Service.Repository.AvailableMapping;

import java.util.ArrayList;

@RestController
public class AvailableMappingsController {

    private final AvailableMapping availableMappings;

    public AvailableMappingsController(AvailableMapping availableMappings) {
        this.availableMappings = availableMappings;
    }

    @GetMapping("/getAvailableMappings")
    public ArrayList<String> getAvailableMappings(){
        return availableMappings.getAvailableMappings();
    }

}
