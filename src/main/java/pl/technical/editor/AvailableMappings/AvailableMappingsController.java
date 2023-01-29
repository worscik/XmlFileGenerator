package pl.technical.editor.AvailableMappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
