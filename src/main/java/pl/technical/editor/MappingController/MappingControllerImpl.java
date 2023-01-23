package pl.technical.editor.MappingController;

import org.springframework.stereotype.Service;

@Service("Mapping")
public class MappingControllerImpl implements MappingAction {

    private String mapping;

    public String getMapping() {
        return mapping;
    }

    @Override
    public boolean checkMapping(String mapping) {
        switch (mapping.toLowerCase()){
            case "rrs/channel/item","root/item","product/products" ->{
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
