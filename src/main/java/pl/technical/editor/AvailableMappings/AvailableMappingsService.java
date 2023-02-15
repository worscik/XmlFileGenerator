package pl.technical.editor.AvailableMappings;

import org.springframework.stereotype.Service;
import pl.technical.editor.Repository.AvailableMapping;

import java.util.ArrayList;

@Service("AvailableMappings")
public class AvailableMappingsService implements AvailableMapping {



    private ArrayList<String> addMappings(ArrayList<String> availableMappingsArray){
        availableMappingsArray.add("rss/channel/item");
        availableMappingsArray.add("root/item");
        availableMappingsArray.add("products/product");
        return availableMappingsArray;
    }

    @Override
    public ArrayList<String> getAvailableMappings(ArrayList<String> availableMappingsArray) {
        return addMappings(availableMappingsArray);
    }
}
