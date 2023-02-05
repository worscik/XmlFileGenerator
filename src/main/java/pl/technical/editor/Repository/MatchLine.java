package pl.technical.editor.Repository;

import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.MappingController.MappingControllerImpl;

public interface MatchLine {
    String customMatchFields();

    String standerdMatchFields(String mapping);

    String customMatchField(String mapping,String customFields);
}
