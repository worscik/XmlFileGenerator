package pl.technical.editor.CustomComponents;

import org.springframework.stereotype.Service;
import pl.technical.editor.MappingController.MatchLineTypes;

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
           case "rrs/channel/item" -> {
               return MatchLineTypes.RRS_CHANNEL_ITEM_STANDARD_LINE.getDescMatchLineType();
           } case "root/item" -> {
               return MatchLineTypes.ROOT_ITEM_STANDARD_LINE.getDescMatchLineType();
           }  case "products/product" -> {
               return MatchLineTypes.PRODUCTS_PRODUCTS_STANDARD_LINE.getDescMatchLineType();
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
