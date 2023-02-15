package pl.technical.editor.WebController;

import jdk.jfr.ContentType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.Repository.FileAction;

@RestController
@CrossOrigin
public class WebsiteController {

    public final static int EMPTYFIELD = 0;

    private final FileAction fileAction;

    public WebsiteController(FileAction fileAction) {
        this.fileAction = fileAction;
    }

    @PostMapping("/createFile")
    public String createFile(@RequestBody XmlDto xmlDto){
        if(xmlDto.getFieldsDto().getId().length() == EMPTYFIELD) {
            return "ID can't be empty";
        }

        return fileAction.prepareFile(xmlDto);
    }

}

