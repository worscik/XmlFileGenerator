package pl.technical.editor.Service.CreateFile;

import org.springframework.stereotype.Service;
import pl.technical.editor.Service.Repository.HeadersAction;

@Service("Headers")
public class HeadersService implements HeadersAction {

    @Override
    public String setHeaders(String mapping) {
            switch (mapping) {
                case "rss/channel/item" -> {
                    return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" +
                            "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" version=\"1.0\"" + "\n" +
                            "xmlns:g=\"http://base.google.com/ns/1.0\">" + "\n" ;
                }
                case "products/product", "root/item"  -> {
                    return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" +
                           "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" version=\"1.0\">\n" + "\n" ;
                }
            }
            return null;
        }
    }

