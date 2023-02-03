package pl.technical.editor.Service.AvailableMappings;

import org.springframework.stereotype.Service;
import pl.technical.editor.Service.Repository.AvailableMapping;

import java.util.ArrayList;

@Service("AvailableMappings")
public class AvailableMappingsService implements AvailableMapping {

    ArrayList<String> availableMappings = new ArrayList<>();

    private ArrayList<String> addMappings(){
        availableMappings.add("rss/channel/item");
        availableMappings.add("root/item");
        availableMappings.add("products/product");
        return availableMappings;
    }

    @Override
    public ArrayList<String> getAvailableMappings() {
        return addMappings();
    }
}
