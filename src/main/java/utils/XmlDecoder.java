package utils;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Peng on 2016/6/5.
 * 解析xml文件。
 */
public class XmlDecoder {
    public static Document dom(File xmlFile) throws ParserConfigurationException, IOException, SAXException {
        // 获取documentBuilderFactory实例
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        // 获取DocumentBuilder实例
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        // 加载xml file得到document（org.w3c）
        return documentBuilder.parse(xmlFile);
    }

    public static void sax(File xmlFile) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        saxParser.parse(xmlFile, new SaxHandler());
    }
}
