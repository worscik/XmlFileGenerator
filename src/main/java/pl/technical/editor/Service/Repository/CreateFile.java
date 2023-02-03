package pl.technical.editor.Service.Repository;

import pl.technical.editor.FileStructure.XmlDto;

public interface CreateFile {

    String createCustomFile(XmlDto xmlDto);

    String createStandardFile(XmlDto xmlDto);

}
