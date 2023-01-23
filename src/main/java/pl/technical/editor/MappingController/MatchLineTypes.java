package pl.technical.editor.MappingController;

public enum MatchLineTypes {

    //TODO DO ZROBIENIA WYCINANIE STANDARDOWYCH POL
    RRS_CHANNEL_ITEM_STANDARD_LINE("<xsl:template match=\"rss/channel/title | rss/channel/link | rss/channel/description\"/>"),

    ROOT_ITEM_STANDARD_LINE("root/item"),

    PRODUCTS_PRODUCTS_STANDARD_LINE("product/products");

    private String descMatchLineType;

    MatchLineTypes(String descMatchLineType) {
        this.descMatchLineType = descMatchLineType;
    }

    public String getDescMatchLineType() {
        return descMatchLineType;
    }
}
