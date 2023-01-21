package pl.technical.editor.CustomComponents;

import org.springframework.stereotype.Service;

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
    public String toString() {
        return "CutLineService{" + "\n" +
                "customCutLine='" + customCutLine + '\'' + "\n" +
                '}';
    }
}
