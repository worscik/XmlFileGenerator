package pl.technical.editor.CustomComponents;

import org.springframework.stereotype.Service;
import pl.technical.editor.PrepareFile.CutLineTypes;

@Service("CutService")
public class CutLineService implements CutLine {

    String customCutLine;

    public String getCustomCutLine() {
        return customCutLine;
    }

    @Override
    public String customCutFields() {
        return null;
    }

    @Override
    public String standardCutFields(String mapping) {
       switch (mapping){
           case "rss/channel/item" -> {
               return CutLineTypes.RSS_CHANNEL_ITEM_STANDARD_LINE.getDescMatchLineType();
           } case "root/item" -> {
               return CutLineTypes.ROOT_ITEM_STANDARD_LINE.getDescMatchLineType();
           }  case "products/product" -> {
               return CutLineTypes.PRODUCTS_PRODUCTS_STANDARD_LINE.getDescMatchLineType();
           }
       }
       return "Its problem with match fields. Try again";
    }


    @Override
    public String toString() {
        return "CutLineService{" + "\n" +
                "customCutLine='" + customCutLine + '\'' + "\n" +
                '}';
    }
}
