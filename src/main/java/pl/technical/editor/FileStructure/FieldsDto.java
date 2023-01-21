package pl.technical.editor.FileStructure;

import org.springframework.stereotype.Repository;

@Repository
public class FieldsDto {

    private final static String newLine = "\n";

    private String id;
    private String name;
    private String newProductKey;
    private String newProductValue;
    private String availableKey;
    private String availableValue;
    private String bestsellerKey;
    private String bestsellerValue;
    private String brand;
    private String categories;
    private String categoryMain;
    private String description;
    private String detail1;
    private String detail2;
    private String detail3;
    private String detail4;
    private String detail5;
    private String manufacturer;
    private String price;
    private String currency;
    private String pricePromo;
    private String quantity;
    private String urlProduct;
    private String urlImg;
    private String genderKey;
    private String genderValue;
    private String urlCategory;
    private String urlCategoryMark;
    private String popularity;
    private String season;
    private String color;
    private String addidtionalImage;
    private String intDetail1;
    private String intDetail2;
    private String intDetail3;

    public String getId() {
        return id;
    }

    public String getName() {
        return checkIfEmpty(name);
    }

    public String getNewProductKey() {
        return checkIfEmpty(newProductKey);
    }

    public String getNewProductValue() {
        return newProductValue;
    }

    public String getAvailableKey() {
        return availableKey;
    }

    public String getAvailableValue() {
        return availableValue;
    }

    public String getBestsellerKey() {
        return bestsellerKey;
    }

    public String getBestsellerValue() {
        return bestsellerValue;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategories() {
        return categories;
    }

    public String getCategoryMain() {
        return categoryMain;
    }

    public String getDescription() {
        return description;
    }

    public String getDetail1() {
        return detail1;
    }

    public String getDetail2() {
        return detail2;
    }

    public String getDetail3() {
        return detail3;
    }

    public String getDetail4() {
        return detail4;
    }

    public String getDetail5() {
        return detail5;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPricePromo() {
        return pricePromo;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getUrlProduct() {
        return urlProduct;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public String getGenderKey() {
        return genderKey;
    }

    public String getGenderValue() {
        return genderValue;
    }

    public String getUrlCategory() {
        return urlCategory;
    }

    public String getUrlCategoryMark() {
        return urlCategoryMark;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getSeason() {
        return season;
    }

    public String getColor() {
        return color;
    }

    public String getAddidtionalImage() {
        return addidtionalImage;
    }

    public String getIntDetail1() {
        return intDetail1;
    }

    public String getIntDetail2() {
        return intDetail2;
    }

    public String getIntDetail3() {
        return intDetail3;
    }

    public String checkIfEmpty(String value){
        if(value.length() == 0){
            return value = "UNDEFINED";
        }
        return value;
    }


    @Override
    public String toString() {
        return "FieldsDto{" +
                "id='" + id + '\'' + newLine +
                ", name='" + name + '\'' +  newLine +
                ", newProductKey='" + newProductKey + '\'' + newLine +
                ", newProductValue='" + newProductValue + '\'' + newLine +
                ", availableKey='" + availableKey + '\'' + newLine +
                ", availableValue='" + availableValue + '\'' + newLine +
                ", bestsellerKey='" + bestsellerKey + '\'' + newLine +
                ", bestsellerValue='" + bestsellerValue + '\'' + newLine +
                ", brand='" + brand + '\'' + newLine +
                ", categories='" + categories + '\'' + newLine +
                ", categoryMain='" + categoryMain + '\'' + newLine +
                ", description='" + description + '\'' + newLine +
                ", detail1='" + detail1 + '\'' + newLine +
                ", detail2='" + detail2 + '\'' + newLine +
                ", detail3='" + detail3 + '\'' + newLine +
                ", detail4='" + detail4 + '\'' + newLine +
                ", detail5='" + detail5 + '\'' + newLine +
                ", manufacturer='" + manufacturer + '\'' + newLine +
                ", price='" + price + '\'' + newLine +
                ", currency='" + currency + '\'' + newLine +
                ", pricePromo='" + pricePromo + '\'' + newLine +
                ", quantity='" + quantity + '\'' + newLine +
                ", urlProduct='" + urlProduct + '\'' + newLine +
                ", urlImg='" + urlImg + '\'' + newLine +
                ", genderKey='" + genderKey + '\'' + newLine +
                ", genderValue='" + genderValue + '\'' + newLine +
                ", urlCategory='" + urlCategory + '\'' + newLine +
                ", urlCategoryMark='" + urlCategoryMark + '\'' + newLine +
                ", popularity='" + popularity + '\'' + newLine +
                ", season='" + season + '\'' + newLine +
                ", color='" + color + '\'' + newLine +
                ", addidtionalImage='" + addidtionalImage + '\'' + newLine +
                ", intDetail1='" + intDetail1 + '\'' + newLine +
                ", intDetail2='" + intDetail2 + '\'' + newLine +
                ", intDetail3='" + intDetail3 + '\'' + newLine +
                '}';
    }
}
