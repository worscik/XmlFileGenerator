package pl.technical.editor.WebController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainTheme {

    @GetMapping("/")
    public String mainPage(){
        return "Welcome in support xml creator";
    }


}
