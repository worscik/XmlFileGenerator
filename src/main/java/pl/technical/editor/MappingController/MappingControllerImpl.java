package pl.technical.editor.MappingController;

import org.springframework.stereotype.Service;

@Service("Mapping")
public class MappingControllerImpl implements MappingAction {

    private String mapping;

    public String getMapping() {
        return mapping;
    }

    @Override
    public String checkMapping() {
        return mapping;
    }

    @Override
    public String toString() {
        return "MappingControllerImpl{" + "\n" +
                "mapping='" + mapping + '\'' + "\n" +
                '}';
    }
}
