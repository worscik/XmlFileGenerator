package pl.technical.editor.WebController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainTheme {

    @GetMapping("/")
    public String mainPage(){
        return "Welcome in support xml creator" +
                "<h4>/createFile</h4>"+
                "tworzy plik przy użyciu jsona" +
                ". Metoda: POST" +
                "<h4>/getAvailableMappings</h4>" +
                "zwraca dozwolone mappingi" +
                ". Metoda: GET" ;

    }


}
