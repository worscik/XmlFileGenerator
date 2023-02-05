package pl.technical.editor.CreateFile;

import org.springframework.stereotype.Service;
import pl.technical.editor.FileStructure.XmlDto;
import pl.technical.editor.Repository.CreateFile;
import pl.technical.editor.Repository.HeadersAction;

@Service("CreateFile")
public class CreateFileImpl extends LineBuilder implements CreateFile {

    private final HeadersAction headersAction;

    public CreateFileImpl(HeadersAction headersAction) {
                this.headersAction = headersAction;
    }

        @Override
    public String createCustomFile(XmlDto xmlDto) {
        return "Custom XML file is not ready yet";
    }

    @Override
    public String createStandardFile(XmlDto xmlDto) {
      return createStandard(xmlDto);
    }

    private String createStandard(XmlDto xmlDto) {
            StringBuilder sb = new StringBuilder();


            //TODO OPTYMALIZACJA RENDEROWANIA
            sb.append(headersAction.setHeaders(xmlDto.getMappingController().getMapping()))
            .append(VARIABLE).append(NEWLINE)
            .append(xmlDto.getCutLineService().standardCutFields(xmlDto.getMappingController().getMapping()) + NEWLINE)
            //TODO PRZEROBIENIE METODY NA STANDARD  I CUSTOM
            .append(xmlDto.getMatchLineService().standerdMatchFields(xmlDto.getMappingController().getMapping()) + NEWLINE )
            .append(NEWLINE)

            .append("<!-- ustawienie zmiennych -->" + NEWLINE)

            .append("<!--EXTERNAL_ID-->" + NEWLINE)
            .append("<xsl:choose>" + NEWLINE)
            .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getId() + ")\">" + " " + " " + NEWLINE)
            .append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getId() + ")\"/>" + NEWLINE)
            .append(STRINGPATH + NEWLINE)

            .append("<!--NAME-->" + NEWLINE)
            .append(CHOOSE + NEWLINE)
            .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getName() + ")\">" + NEWLINE)
            .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getName() + "),0,100)\"/>" + NEWLINE)

            //TODO OPTYMALIZACJA RENDEROWANIA
            .append(headersAction.setHeaders(xmlDto.getMappingController().getMapping()))
           .append(VARIABLE).append(NEWLINE)

           .append(xmlDto.getCutLineService().standardCutFields(xmlDto.getMappingController().getMapping()) + NEWLINE)

           //TODO PRZEROBIENIE METODY NA STANDARD  I CUSTOM
           .append(xmlDto.getMatchLineService().standerdMatchFields(xmlDto.getMappingController().getMapping()) + NEWLINE )
           .append(NEWLINE)

           .append("<!-- ustawienie zmiennych -->" + NEWLINE)

           .append("<!--EXTERNAL_ID-->" + NEWLINE)
           .append("<xsl:choose>" + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getId() + ")\">" + " " + " " + NEWLINE)
           .append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getId() + ")\"/>" + NEWLINE)
           .append(STRINGPATH + NEWLINE)

           .append("<!--NAME-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getName() + ")\">" + NEWLINE) // NAME
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getName() + "),0,100)\"/>" + NEWLINE) // NAME
           .append(STRINGPATH + NEWLINE)

           .append("<!--NEW_PRODUCT-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\""+ xmlDto.getFieldsDto().getNewProductKey()+"='" + xmlDto.getFieldsDto().getNewProductValue() +"'"+ "\">" + NEWLINE)
           .append(NUMERICPATH + NEWLINE)

           .append("<!--AVAILABLE-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\""+ xmlDto.getFieldsDto().getAvailableKey()+"='" + xmlDto.getFieldsDto().getAvailableValue() +"'"+ "\">" + NEWLINE)
           .append(NUMERICPATH + NEWLINE)

           .append("<!--BESTSELLER-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\""+ xmlDto.getFieldsDto().getBestsellerValue()+"='" + xmlDto.getFieldsDto().getBestsellerKey() +"'"+ "\">" + NEWLINE)
           .append(NUMERICPATH + NEWLINE)

           .append("<!--BRAND-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getBrand() + ")\">" + NEWLINE) // BRAND
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getBrand() + "),0,512)\"/>" + NEWLINE) // BRAND
           .append(STRINGPATH + NEWLINE)

           .append(" <!--CATEGORIES-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getCategories() + ")\">" + NEWLINE) // CATEGORIES
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getCategories() + "),0,512)\"/>" + NEWLINE) // CATEGORIES
           .append(STRINGPATH + NEWLINE)

           .append("<!--CATEGORY_MAIN-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getCategoryMain() + ")\">" + NEWLINE) // CATEGORY MAIN
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getCategoryMain() + "),0,200)\"/>" + NEWLINE) // CATEGORY MAIN
           .append(STRINGPATH + NEWLINE)

           .append("<!--DESCRIPTION-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDescription() + ")\">" + NEWLINE) // DESCRIPTION
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDescription() + "),0,1024)\"/>" + NEWLINE) // DESCRIPTION
           .append(STRINGPATH + NEWLINE)

           .append("<!--DETAIL_1-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail1() + ")\">" + NEWLINE) // DETAIL1
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail1() + "),0,512)\"/>" + NEWLINE) // DETAIL1
           .append(STRINGPATH + NEWLINE)

           .append("<!--DETAIL_2-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail2() + ")\">" + NEWLINE) // DETAIL2
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail2() + "),0,512)\"/>" + NEWLINE) // DETAIL2
           .append(STRINGPATH + NEWLINE)

           .append("<!--DETAIL_3-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail3() + ")\">" + NEWLINE) // DETAIL3
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail3() + "),0,512)\"/>" + NEWLINE) // DETAIL3
           .append(STRINGPATH + NEWLINE)

           .append("<!--DETAIL_4-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail4() + ")\">" + NEWLINE) // DETAIL4
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail4() + "),0,512)\"/>" + NEWLINE) // DETAIL4
           .append(STRINGPATH + NEWLINE)

           .append("<!--DETAIL_5-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getDetail5() + ")\">" + NEWLINE) // DETAIL5
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getDetail5() + "),0,512)\"/>" + NEWLINE) // DETAIL5
           .append(STRINGPATH + NEWLINE)

           .append("<!--MANUFACTURER-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getManufacturer() + ")\">" + NEWLINE) // MANUFACTURER
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getManufacturer() + "),0,100)\"/>" + NEWLINE) // MANUFACTURER
           .append(STRINGPATH + NEWLINE)

           .append("<!--PRICE-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length("+ xmlDto.getFieldsDto().getPrice()+")\">" + NEWLINE)
           .append("<xsl:value-of select=\"normalize-space(translate(" + xmlDto.getFieldsDto().getPrice() + ",'" + xmlDto.getFieldsDto().getCurrency()+"', ''))\"/>" + NEWLINE)
           .append(STRINGPATH + NEWLINE)

           .append("<!--PRICE_PROMO-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length("+ xmlDto.getFieldsDto().getPricePromo()+")\">" + NEWLINE)
           .append("<xsl:value-of select=\"normalize-space(translate(" + xmlDto.getFieldsDto().getPricePromo() + ",'" + xmlDto.getFieldsDto().getCurrency()+"', ''))\"/>" + NEWLINE)
           .append(STRINGPATH + NEWLINE)

           .append("<!--QUANTITY-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getQuantity() + ")\">" + NEWLINE) // QUANTITY
           .append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getQuantity() + ")\"/>" + NEWLINE) // QUANTITY
           .append(STRINGPATH + NEWLINE)

           .append("<!--URL_PRODUCT-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getUrlProduct() + ")\">" + NEWLINE) // QUANTITY
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getUrlProduct() + "),0,512)\"/>" + NEWLINE) // QUANTITY
           .append(STRINGPATH + NEWLINE)

           .append("<!--URL_IMG-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getUrlImg() + ")\">" + NEWLINE) // URL_IMG
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getUrlImg() + "),0,512)\"/>" + NEWLINE) // URL_IMG
           .append(STRINGPATH + NEWLINE)

           .append("<!--GENDER-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\""+ xmlDto.getFieldsDto().getGenderKey()+"='" + xmlDto.getFieldsDto().getGenderValue() +"'"+ "\">" + NEWLINE)
           .append(NUMERICPATH + NEWLINE)

           .append("<!--URL_CATEGORY-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getUrlCategory() + ")\">" + NEWLINE) // URL_CATEGORY
           .append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getUrlCategory() + ")\"/>" + NEWLINE) // URL_CATEGORY
           .append(STRINGPATH + NEWLINE)

           .append("<!--URL_CATEGORY_MARK-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getUrlCategoryMark() + ")\">" + NEWLINE) // URL_CATEGORY_MARK
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getUrlCategoryMark() + "),0,512)\"/>" + NEWLINE) // URL_CATEGORY_MARK
           .append(STRINGPATH + NEWLINE)

           .append("<!--POPULARITY-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getPopularity() + ")\">" + NEWLINE) // POPULARITY
           .append("<xsl:value-of select=\"normalize-space(" + xmlDto.getFieldsDto().getPopularity() + ")\"/>" + NEWLINE) // POPULARITY
           .append(STRINGPATH + NEWLINE)

           .append("<!--SEASON-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getSeason() + ")\">" + NEWLINE) // SEASON
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getSeason() + "),0,40)\"/>" + NEWLINE) // SEASON
           .append(STRINGPATH + NEWLINE)

           .append("<!--COLOR-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getColor() + ")\">" + NEWLINE) // COLOR
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getColor() + "),0,40)\"/>" + NEWLINE) // COLOR
           .append(STRINGPATH + NEWLINE)

           .append("<!--ADDITIONAL_IMAGE-->" + NEWLINE)
           .append(CHOOSE + NEWLINE)
           .append("<xsl:when test=\"string-length(" + xmlDto.getFieldsDto().getAddidtionalImage() + ")\">" + NEWLINE) // ADDITIONAL_IMAGE
           .append("<xsl:value-of select=\"substring(normalize-space(" + xmlDto.getFieldsDto().getAddidtionalImage() + "),0,128)\"/>" + NEWLINE) // ADDITIONAL_IMAGE

           .append(STRINGPATH + NEWLINE)
           .append(LASTLINE);
            return sb.toString();
        }
    }

