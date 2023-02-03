package pl.technical.editor.PrepareFile;

import org.springframework.stereotype.Service;
import pl.technical.editor.Repository.CreateFile;
import pl.technical.editor.Repository.CutLine;
import pl.technical.editor.Repository.MappingAction;
import pl.technical.editor.Repository.MatchLine;
import pl.technical.editor.FileStructure.FieldsDto;
import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.Repository.FileAction;

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

        if(xmlDto.getCutLineService().getCustomCutLine().length() != 0 ||  xmlDto.getMatchLineService().getCustomMatchLine().length() != 0) {
            return createFile.createCustomFile(xmlDto);
        }

        boolean isMappingCorrect = mappingAction.checkMapping(xmlDto.getMappingController().getMapping());
        if(!isMappingCorrect){
            return "Mapping is not correct";
        }
        return createFile.createStandardFile(xmlDto);
    }
}
