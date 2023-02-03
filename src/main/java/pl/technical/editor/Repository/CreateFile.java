package pl.technical.editor.Repository;

import pl.technical.editor.FileStructure.XmlDto;

public interface CreateFile {

    String createCustomFile(XmlDto xmlDto);

    String createStandardFile(XmlDto xmlDto);

}
