package pl.technical.editor.Service.CustomComponents;

public enum MatchLineTypes {

    RSS_CHANNEL_ITEM_STANDARD_LINE_MATCH("<xsl:template match=\"rss/channel/item\"/>"),

    ROOT_ITEM_STANDARD_LINE_MATCH("<xsl:template match=\"root/item\"/>"),

    PRODUCTS_PRODUCTS_STANDARD_LINE_MATCH("<xsl:template match=\"products/product\"/>");

    private final String descMatchLineType;

    MatchLineTypes(String descMatchLineType) {
        this.descMatchLineType = descMatchLineType;
    }

    public String getDescMatchLineType() {
        return descMatchLineType;
    }
}
