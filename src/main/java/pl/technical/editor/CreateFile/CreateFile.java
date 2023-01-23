package pl.technical.editor.CreateFile;

import pl.technical.editor.FileStructure.XmlDto;

public interface CreateFile {

    String createCustomFile(XmlDto xmlDto);

    String createStandardFile(XmlDto xmlDto, boolean isMappingOk);

}
