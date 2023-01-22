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
        return createStandard(xmlDto);
    }

    private String createStandard(XmlDto xmlDto) {
            StringBuilder sb = new StringBuilder();


            sb.append(HEADERS);

            sb.append(NEWLINE);
          sb.append(xmlDto.getCutLineService().standardCutFields(xmlDto.getMappingController().getMapping()) + NEWLINE); // WYCINANIE
          sb.append(xmlDto.getMatchLineService().standerdMatchFields(xmlDto.getMappingController().getMapping()) + NEWLINE ); // MATCH

            sb.append(NEWLINE);

            sb.append("<!-- ustawienie zmiennych -->" + NEWLINE);

            sb.append("<!--EXTERNAL_ID-->" + NEWLINE);
            sb.append("<xsl:choose>" + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getId() + ")\">" + " " + " " + NEWLINE); // ID
            sb.append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getId() + ")\"/>" + NEWLINE); // ID
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--NAME-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getName() + ")\">" + NEWLINE); // NAME
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getName() + "),0,100)\"/>" + NEWLINE); // NAME
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--NEW_PRODUCT-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\""+ xmlDto.getFieldsDto().getNewProductKey()+"='" + xmlDto.getFieldsDto().getNewProductValue() +"'"+ "\">" + NEWLINE);
            sb.append(NUMERICPATH + NEWLINE) ;

            sb.append("<!--AVAILABLE-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\""+ xmlDto.getFieldsDto().getAvailableKey()+"='" + xmlDto.getFieldsDto().getAvailableValue() +"'"+ "\">" + NEWLINE);
            sb.append(NUMERICPATH + NEWLINE) ;

            sb.append("<!--BESTSELLER-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\""+ xmlDto.getFieldsDto().getBestsellerValue()+"='" + xmlDto.getFieldsDto().getBestsellerKey() +"'"+ "\">" + NEWLINE);
            sb.append(NUMERICPATH + NEWLINE);

            sb.append("<!--BRAND-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getBrand() + ")\">" + NEWLINE); // BRAND
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getBrand() + "),0,512)\"/>" + NEWLINE); // BRAND
            sb.append(STRINGPATH + NEWLINE);

            sb.append(" <!--CATEGORIES-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getCategories() + ")\">" + NEWLINE); // CATEGORIES
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getCategories() + "),0,512)\"/>" + NEWLINE); // CATEGORIES
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--CATEGORY_MAIN-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getCategoryMain() + ")\">" + NEWLINE); // CATEGORY MAIN
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getCategoryMain() + "),0,200)\"/>" + NEWLINE); // CATEGORY MAIN
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--DESCRIPTION-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDescription() + ")\">" + NEWLINE); // DESCRIPTION
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDescription() + "),0,1024)\"/>" + NEWLINE); // DESCRIPTION
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--DETAIL_1-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail1() + ")\">" + NEWLINE); // DETAIL1
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail1() + "),0,512)\"/>" + NEWLINE); // DETAIL1
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--DETAIL_2-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail2() + ")\">" + NEWLINE); // DETAIL2
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail2() + "),0,512)\"/>" + NEWLINE); // DETAIL2
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--DETAIL_3-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail3() + ")\">" + NEWLINE); // DETAIL3
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail3() + "),0,512)\"/>" + NEWLINE); // DETAIL3
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--DETAIL_4-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail4() + ")\">" + NEWLINE); // DETAIL4
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail4() + "),0,512)\"/>" + NEWLINE); // DETAIL4
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--DETAIL_5-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail5() + ")\">" + NEWLINE); // DETAIL5
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail5() + "),0,512)\"/>" + NEWLINE); // DETAIL5
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--MANUFACTURER-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getManufacturer() + ")\">" + NEWLINE); // MANUFACTURER
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getManufacturer() + "),0,100)\"/>" + NEWLINE); // MANUFACTURER
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--PRICE-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length("+ xmlDto.getFieldsDto().getPrice()+")\">" + NEWLINE);
            sb.append("<xsl:value-of select=\"normalize-space(translate(" + xmlDto.getFieldsDto().getPrice() + ",'" + xmlDto.getFieldsDto().getCurrency()+"', ''))\"/>" + NEWLINE);
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--PRICE_PROMO-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length("+ xmlDto.getFieldsDto().getPricePromo()+")\">" + NEWLINE);
            sb.append("<xsl:value-of select=\"normalize-space(translate(" + xmlDto.getFieldsDto().getPricePromo() + ",'" + xmlDto.getFieldsDto().getCurrency()+"', ''))\"/>" + NEWLINE);
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--QUANTITY-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getQuantity() + ")\">" + NEWLINE); // QUANTITY
            sb.append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getQuantity() + ")\"/>" + NEWLINE); // QUANTITY
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--URL_PRODUCT-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getUrlProduct() + ")\">" + NEWLINE); // QUANTITY
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getUrlProduct() + "),0,512)\"/>" + NEWLINE); // QUANTITY
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--URL_IMG-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getUrlImg() + ")\">" + NEWLINE); // URL_IMG
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getUrlImg() + "),0,512)\"/>" + NEWLINE); // URL_IMG
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--GENDER-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\""+ xmlDto.getFieldsDto().getGenderKey()+"='" + xmlDto.getFieldsDto().getGenderValue() +"'"+ "\">" + NEWLINE);
            sb.append(NUMERICPATH + NEWLINE) ;

            sb.append("<!--URL_CATEGORY-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getUrlCategory() + ")\">" + NEWLINE); // URL_CATEGORY
            sb.append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getUrlCategory() + ")\"/>" + NEWLINE); // URL_CATEGORY
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--URL_CATEGORY_MARK-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getUrlCategoryMark() + ")\">" + NEWLINE); // URL_CATEGORY_MARK
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getUrlCategoryMark() + "),0,512)\"/>" + NEWLINE); // URL_CATEGORY_MARK
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--POPULARITY-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getPopularity() + ")\">" + NEWLINE); // POPULARITY
            sb.append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getPopularity() + ")\"/>" + NEWLINE); // POPULARITY
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--SEASON-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getSeason() + ")\">" + NEWLINE); // SEASON
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getSeason() + "),0,40)\"/>" + NEWLINE); // SEASON
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--COLOR-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getColor() + ")\">" + NEWLINE); // COLOR
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getColor() + "),0,40)\"/>" + NEWLINE); // COLOR
            sb.append(STRINGPATH + NEWLINE);

            sb.append("<!--ADDITIONAL_IMAGE-->" + NEWLINE);
            sb.append(CHOOSE + NEWLINE);
            sb.append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getAddidtionalImage() + ")\">" + NEWLINE); // ADDITIONAL_IMAGE
            sb.append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getAddidtionalImage() + "),0,128)\"/>" + NEWLINE); // ADDITIONAL_IMAGE
            sb.append(STRINGPATH + NEWLINE);

            sb.append(LASTLINE);
            return sb.toString();
        }
    }

