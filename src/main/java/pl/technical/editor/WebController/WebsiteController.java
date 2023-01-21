package pl.technical.editor.WebController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.PrepareFile.FileAction;

@RestController
public class WebsiteController {

    private final FileAction fileAction;

    public WebsiteController(FileAction fileAction) {
        this.fileAction = fileAction;
    }

    @PostMapping("/createFile")
    public String createFile(@RequestBody XmlDto xmlDto){

        if(xmlDto.getFieldsDto().getId().length() == 0) {
            return "ID can't be empty";
        }

        return fileAction.prepareFile(xmlDto);
    }

}

