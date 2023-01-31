package pl.technical.editor.CustomComponents;

public enum CutLineTypes {

    //TODO CZY ENUMY SA POTRZEBNE TUTAJ ?
    RSS_CHANNEL_ITEM_STANDARD_LINE("<xsl:template match=\"rss/channel/title | rss/channel/link | rss/channel/description\"/>"),

    ROOT_ITEM_STANDARD_LINE(""),

    PRODUCTS_PRODUCTS_STANDARD_LINE("");

    private final String descCutLineType;

    CutLineTypes(String descCutLineType) {
        this.descCutLineType = descCutLineType;
    }

    public String getDescCutLineType() {
        return descCutLineType;
    }
}
