package pl.technical.editor.MappingController;

public enum MatchLineTypes {

    RRS_CHANNEL_ITEM_STANDARD_LINE("rrs/channel/item"),
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
