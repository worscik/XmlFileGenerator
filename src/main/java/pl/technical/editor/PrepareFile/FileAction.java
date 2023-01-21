package pl.technical.editor.PrepareFile;

import pl.technical.editor.CustomComponents.CutLineService;
import pl.technical.editor.CustomComponents.MatchLineService;
import pl.technical.editor.FileStructure.FieldsDto;
import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.MappingController.MappingControllerImpl;

public interface FileAction {

    String prepareFile(XmlDto xmlDto);

}
