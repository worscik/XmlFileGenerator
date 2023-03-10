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
    public String standerdMatchFields(String mapping) {
        switch (mapping){
            case "rrs/channel/item" -> {
                return standardMatchLine = "<xsl:template match=\"rss/channel/item\">";
            }
            case "product/products" -> {
                return standardMatchLine = "<xsl:template match=\"product/products\">";
            }
            case "root/item" -> {
                return standardMatchLine = "<xsl:template match=\"root/item\">";
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
