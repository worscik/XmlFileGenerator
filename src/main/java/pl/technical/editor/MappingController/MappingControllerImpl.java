package pl.technical.editor.MappingController;

import org.springframework.stereotype.Service;
import pl.technical.editor.Repository.MappingAction;

@Service("Mapping")
public class MappingControllerImpl implements MappingAction {

    private String mapping;

    public String getMapping() {
        return mapping;
    }

    @Override
    public boolean checkMapping(String mapping) {
        switch (mapping.toLowerCase()){
            case "rss/channel/item","root/item","products/product" ->{
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MappingControllerImpl{" + "\n" +
                "mapping='" + mapping + '\'' + "\n" +
                '}';
    }
}
