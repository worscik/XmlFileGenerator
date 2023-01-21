package pl.technical.editor.CreateFile;

import org.springframework.stereotype.Service;
import pl.technical.editor.FileStructure.FieldsDto;
import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.MappingController.MappingControllerImpl;

@Service("CreateFile")
public class CreateFileImpl extends LineBuilder implements CreateFile {

    @Override
    public String createCustomFile(XmlDto xmlDto) {
        return "CUSTOM";
    }

    @Override
    public String createStandardFile(XmlDto xmlDto) {
        return  xmlDto.toString();
    }

    private String createStandard(XmlDto xmlDto, MappingControllerImpl mappingController){

        return "TESt";

//        StringBuilder sb = new StringBuilder();
//
//
//        sb.append(HEADERS);
//
//        sb.append(NEWLINE);
//        sb.append(mappingController.checkMapping()); // WYCINANIE
//        sb.append(xmlDto.normalXmlMatch(fieldsDto)); // MATCH
//
//        sb.append(NEWLINE);
//
//        sb.append("<!-- ustawienie zmiennych -->" + NEWLINE);
//
//        sb.append("<!--EXTERNAL_ID-->" + NEWLINE);
//        sb.append("<xsl:choose>" + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getId() + ")\">" + " " + " " + NEWLINE); // ID
//        sb.append("<xsl:value-of select=\"normalize-space(" + fieldsDto.getId() + ")\"/>" + NEWLINE); // ID
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--NAME-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getName() + ")\">" + NEWLINE); // NAME
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getName() + "),0,100)\"/>" + NEWLINE); // NAME
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--NEW_PRODUCT-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\""+ fieldsDto.getNewProductKey()+"='" + fieldsDto.getNewProductValue() +"'"+ "\">" + NEWLINE);
//        sb.append(NUMERICPATH + NEWLINE) ;
//
//        sb.append("<!--AVAILABLE-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\""+ fieldsDto.getAvailableKey()+"='" + fieldsDto.getAvailableValue() +"'"+ "\">" + NEWLINE);
//        sb.append(NUMERICPATH + NEWLINE) ;
//
//        sb.append("<!--BESTSELLER-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\""+ fieldsDto.getBestsellerValue()+"='" + fieldsDto.getBestsellerKey() +"'"+ "\">" + NEWLINE);
//        sb.append(NUMERICPATH + NEWLINE);
//
//        sb.append("<!--BRAND-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getBrand() + ")\">" + NEWLINE); // BRAND
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getBrand() + "),0,512)\"/>" + NEWLINE); // BRAND
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append(" <!--CATEGORIES-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getCategories() + ")\">" + NEWLINE); // CATEGORIES
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getCategories() + "),0,512)\"/>" + NEWLINE); // CATEGORIES
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--CATEGORY_MAIN-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getCategoryMain() + ")\">" + NEWLINE); // CATEGORY MAIN
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getCategoryMain() + "),0,200)\"/>" + NEWLINE); // CATEGORY MAIN
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--DESCRIPTION-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getDescription() + ")\">" + NEWLINE); // DESCRIPTION
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDescription() + "),0,1024)\"/>" + NEWLINE); // DESCRIPTION
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--DETAIL_1-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail1() + ")\">" + NEWLINE); // DETAIL1
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail1() + "),0,512)\"/>" + NEWLINE); // DETAIL1
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--DETAIL_2-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail2() + ")\">" + NEWLINE); // DETAIL2
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail2() + "),0,512)\"/>" + NEWLINE); // DETAIL2
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--DETAIL_3-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail3() + ")\">" + NEWLINE); // DETAIL3
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail3() + "),0,512)\"/>" + NEWLINE); // DETAIL3
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--DETAIL_4-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail4() + ")\">" + NEWLINE); // DETAIL4
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail4() + "),0,512)\"/>" + NEWLINE); // DETAIL4
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--DETAIL_5-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getDetail5() + ")\">" + NEWLINE); // DETAIL5
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getDetail5() + "),0,512)\"/>" + NEWLINE); // DETAIL5
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--MANUFACTURER-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getManufacturer() + ")\">" + NEWLINE); // MANUFACTURER
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getManufacturer() + "),0,100)\"/>" + NEWLINE); // MANUFACTURER
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--PRICE-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length("+ fieldsDto.getPrice()+")\">" + NEWLINE);
//        sb.append("<xsl:value-of select=\"normalize-space(translate(" + fieldsDto.getPrice() + ",'" + fieldsDto.getCurrency()+"', ''))\"/>" + NEWLINE);
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--PRICE_PROMO-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length("+ fieldsDto.getPricePromo()+")\">" + NEWLINE);
//        sb.append("<xsl:value-of select=\"normalize-space(translate(" + fieldsDto.getPricePromo() + ",'" + fieldsDto.getCurrency()+"', ''))\"/>" + NEWLINE);
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--QUANTITY-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getQuantity() + ")\">" + NEWLINE); // QUANTITY
//        sb.append("<xsl:value-of select=\"normalize-space(" + fieldsDto.getQuantity() + ")\"/>" + NEWLINE); // QUANTITY
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--URL_PRODUCT-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getUrlProduct() + ")\">" + NEWLINE); // QUANTITY
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getUrlProduct() + "),0,512)\"/>" + NEWLINE); // QUANTITY
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--URL_IMG-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getUrlImg() + ")\">" + NEWLINE); // URL_IMG
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getUrlImg() + "),0,512)\"/>" + NEWLINE); // URL_IMG
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--GENDER-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\""+ fieldsDto.getGenderKey()+"='" + fieldsDto.getGenderValue() +"'"+ "\">" + NEWLINE);
//        sb.append(NUMERICPATH + NEWLINE) ;
//
//        sb.append("<!--URL_CATEGORY-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getUrlCategory() + ")\">" + NEWLINE); // URL_CATEGORY
//        sb.append("<xsl:value-of select=\"normalize-space(" + fieldsDto.getUrlCategory() + ")\"/>" + NEWLINE); // URL_CATEGORY
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--URL_CATEGORY_MARK-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getUrlCategoryMark() + ")\">" + NEWLINE); // URL_CATEGORY_MARK
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getUrlCategoryMark() + "),0,512)\"/>" + NEWLINE); // URL_CATEGORY_MARK
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--POPULARITY-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getPopularity() + ")\">" + NEWLINE); // POPULARITY
//        sb.append("<xsl:value-of select=\"normalize-space(" + fieldsDto.getPopularity() + ")\"/>" + NEWLINE); // POPULARITY
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--SEASON-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getSeason() + ")\">" + NEWLINE); // SEASON
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getSeason() + "),0,40)\"/>" + NEWLINE); // SEASON
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--COLOR-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getColor() + ")\">" + NEWLINE); // COLOR
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getColor() + "),0,40)\"/>" + NEWLINE); // COLOR
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append("<!--ADDITIONAL_IMAGE-->" + NEWLINE);
//        sb.append(CHOOSE + NEWLINE);
//        sb.append("<xsl:when test=\"string-length(" + fieldsDto.getAddidtionalImage() + ")\">" + NEWLINE); // ADDITIONAL_IMAGE
//        sb.append("<xsl:value-of select=\"substring(normalize-space(" + fieldsDto.getAddidtionalImage() + "),0,128)\"/>" + NEWLINE); // ADDITIONAL_IMAGE
//        sb.append(STRINGPATH + NEWLINE);
//
//        sb.append(LASTLINE);
//        return sb.toString();
    }



}