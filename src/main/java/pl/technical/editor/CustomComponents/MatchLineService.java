package pl.technical.editor.CustomComponents;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pl.technical.editor.MappingController.MappingControllerImpl;

@Component("MatchService")
public class MatchLineService implements MatchLine {

    private String customMatchLine;

    private String standardMatchLine;

    public String getCustomMatchLine() {
        return customMatchLine;
    }

    @Override
    public String customMatchFields() {
        return null;
    }

    @Override
    public String standerdMatchFields(MappingControllerImpl mappingController) {
        switch (mappingController.getMapping()){
            case "rrs/channel/item" -> {
                return standardMatchLine = "rrs";
            }
            case "product/products" -> {
                return standardMatchLine = "product";
            }
            case "root/item" -> {
                return standardMatchLine = "root/item";
            }
        }
        return "Can't find selected line to match";
    }

    @Override
    public String toString() {
        return "MatchLineService{" + "\n" +
                "customMatchLine='" + customMatchLine + '\'' + "\n" +
                '}';
    }
}
