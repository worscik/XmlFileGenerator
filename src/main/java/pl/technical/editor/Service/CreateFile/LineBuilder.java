package pl.technical.editor.Service.CreateFile;

public class LineBuilder {

    public final static String NEWLINE = "\n";
    public final static String CHOOSE= "<xsl:choose>";
    public final static String STRINGPATH = "</xsl:when>\n" +
            "<xsl:otherwise>\n" +
            "<xsl:text>\\N</xsl:text>\n" +
            "</xsl:otherwise>\n" +
            "</xsl:choose>\n" +
            "<xsl:value-of select=\"$sep\"/>";

    public static final String NUMERICPATH = "<xsl:value-of select=\"1\"/>\n" +
            "</xsl:when>\n" +
            "<xsl:otherwise>\n" +
            "<xsl:value-of select=\"0\"/>\n" +
            "</xsl:otherwise>\n" +
            "</xsl:choose>\n" +
            "<xsl:value-of select=\"$sep\"/>";

    public final static String VARIABLE =  "<xsl:output method=\"text\"/>" + NEWLINE +
            "<xsl:strip-space elements=\"node\"/>" + NEWLINE +
            "<xsl:strip-space elements=\"*\" />" + NEWLINE +
            "<xsl:variable name=\"newline\"><xsl:text>&#x0a;</xsl:text></xsl:variable>" + NEWLINE +
            "<xsl:variable name=\"sep\"><xsl:text>&#x7f;</xsl:text></xsl:variable>" + NEWLINE;


    public static final String LASTLINE = "<!--INT_DETAIL1-->" + NEWLINE +
            "<xsl:text>\\N</xsl:text>" + NEWLINE +
            "<xsl:value-of select=\"$sep\"/>" + NEWLINE +
            "<!--INT_DETAIL2-->" + NEWLINE +
            "<xsl:text>\\N</xsl:text>" + NEWLINE +
            "<xsl:value-of select=\"$sep\"/>" + NEWLINE +
            "<!--DEC_DETAIL1-->" + NEWLINE +
            "<xsl:text>\\N</xsl:text>" + NEWLINE +
            "<xsl:value-of select=\"$sep\"/>" + NEWLINE +
            "<!--array-->" + NEWLINE +
            " <xsl:text>\\N</xsl:text>" + NEWLINE +
            "<!-- koniec -->" + NEWLINE +
            "<xsl:value-of select=\"$newline\"/>" + NEWLINE +
            "</xsl:template>" + NEWLINE +
            "</xsl:stylesheet>" + NEWLINE;


}
