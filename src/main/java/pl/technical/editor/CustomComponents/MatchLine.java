package pl.technical.editor.CustomComponents;

import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.MappingController.MappingControllerImpl;

public interface MatchLine {
    String customMatchFields();

    String standerdMatchFields(String mapping);

}
