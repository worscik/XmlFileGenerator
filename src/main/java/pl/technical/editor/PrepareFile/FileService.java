package pl.technical.editor.PrepareFile;

import org.springframework.stereotype.Service;
import pl.technical.editor.Repository.*;
import pl.technical.editor.FileStructure.FieldsDto;
import pl.technical.editor.FileStructure.XmlDto;

@Service("PrepareFile")
public class FileService implements FileAction {

    private final MappingAction mappingAction;
    private final CutLine cutLine;
    private final MatchLine matchLine;
    private final FieldsDto fieldsDto;
    private final CreateFile createFile;
    private final CustomChecker customChecker;

    public FileService(MappingAction mappingAction, CutLine cutLine, MatchLine matchLine, FieldsDto fieldsDto, CreateFile createFile, CustomChecker customChecker) {
        this.mappingAction = mappingAction;
        this.cutLine = cutLine;
        this.matchLine = matchLine;
        this.fieldsDto = fieldsDto;
        this.createFile = createFile;
        this.customChecker = customChecker;
    }

    @Override
    public String prepareFile(XmlDto xmlDto) {

        boolean isMappingCorrect = mappingAction.checkMapping(xmlDto.getMappingController().getMapping());
        if(!isMappingCorrect){
            return "Mapping is not correct";
        }

       return customChecker.isCustom(xmlDto) ? createFile.createCustomFile(xmlDto) : createFile.createStandardFile(xmlDto);
    }
}
