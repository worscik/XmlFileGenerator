package pl.technical.editor.PrepareFile;

import org.springframework.stereotype.Service;
import pl.technical.editor.CreateFile.CreateFile;
import pl.technical.editor.CustomComponents.CutLine;
import pl.technical.editor.MappingController.MappingAction;
import pl.technical.editor.CustomComponents.MatchLine;
import pl.technical.editor.FileStructure.FieldsDto;
import pl.technical.editor.FileStructure.XmlDto;

@Service("PrepareFile")
public class FileService implements FileAction {

    private final MappingAction mappingAction;
    private final CutLine cutLine;

    private final MatchLine matchLine;

    private final FieldsDto fieldsDto;

    private final CreateFile createFile;

    public FileService(MappingAction mappingAction, CutLine cutLine, MatchLine matchLine, FieldsDto fieldsDto, CreateFile createFile) {
        this.mappingAction = mappingAction;
        this.cutLine = cutLine;
        this.matchLine = matchLine;
        this.fieldsDto = fieldsDto;
        this.createFile = createFile;
    }

    @Override
    public String prepareFile(XmlDto xmlDto) {
        if(xmlDto.getCutLineService().getCustomCutLine().length() == 0
          ||  xmlDto.getMatchLineService().getCustomMatchLine().length() == 0) {
            return createFile.createStandardFile(xmlDto);
        }
        return createFile.createCustomFile(xmlDto);
    }
}
