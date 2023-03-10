package pl.technical.editor.Service.CustomComponents;

import org.springframework.stereotype.Component;
import pl.technical.editor.Service.Repository.MatchLine;

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
        switch (mapping.toLowerCase()){
            case "rss/channel/item" -> {
                return standardMatchLine = "<xsl:template match=\"rss/channel/item\">";
            }
            case "products/product" -> {
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
