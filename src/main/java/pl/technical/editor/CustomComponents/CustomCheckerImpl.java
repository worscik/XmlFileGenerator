package pl.technical.editor.CustomComponents;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.Repository.CustomChecker;

@Service("CustomLineService")
public class CustomCheckerImpl implements CustomChecker {

    public final static int EMPTYFIELD = 0;

    @Override
    public boolean isCustom(XmlDto xmlDto) {
        if(xmlDto.getCutLineService().getCustomCutLine().length() != EMPTYFIELD || xmlDto.getMatchLineService().getCustomMatchLine().length() != EMPTYFIELD){
            return true;
        }
        return false;
    }
}
