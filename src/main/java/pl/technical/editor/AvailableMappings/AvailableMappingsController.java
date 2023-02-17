package pl.technical.editor.AvailableMappings;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.technical.editor.Repository.AvailableMapping;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
public class AvailableMappingsController {

    private final AvailableMapping availableMappings;

    public AvailableMappingsController(AvailableMapping availableMappings) {
        this.availableMappings = availableMappings;
    }

    @GetMapping("/getAvailableMappings")
    public ArrayList<String> getAvailableMappings(){
        ArrayList<String> availableMappingsArray = new ArrayList<>();
        return availableMappings.getAvailableMappings(availableMappingsArray);
    }

}
