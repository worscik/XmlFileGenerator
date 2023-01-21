package pl.technical.editor.FileStructure;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Repository;
import pl.technical.editor.CustomComponents.CutLineService;
import pl.technical.editor.MappingController.MappingControllerImpl;
import pl.technical.editor.CustomComponents.MatchLineService;

@Repository
public class XmlDto {

    @JsonProperty("Fields")
    private FieldsDto fieldsDto;
    @JsonProperty("Mapping")
    private MappingControllerImpl mappingController;
    @JsonProperty("CutFields")
    private CutLineService cutLineService;
    @JsonProperty("MatchFields")
    private MatchLineService matchLineService;

    public FieldsDto getFieldsDto() {
        return fieldsDto;
    }

    public MappingControllerImpl getMappingController() {
        return mappingController;
    }

    public CutLineService getCutLineService() {
        return cutLineService;
    }

    public MatchLineService getMatchLineService() {
        return matchLineService;
    }


    @Override
    public String toString() {
        return "XmlDto{" +
                "fieldsDto=" + fieldsDto.toString() +
                ", mappingController=" + mappingController.toString() +
                ", cutLineService=" + cutLineService.toString() +
                ", matchLineService=" + matchLineService.toString() +
                '}';
    }
}
