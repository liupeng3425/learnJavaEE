package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import utils.XmlDecoder;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Peng on 2016/6/5.
 * test xmlDecoder
 */
public class TestXmlDecoder {
    public static void main(String... args) {
        File people = new File("src/xml/people.xml");
        try {
            Document document = XmlDecoder.dom(people);
            // 用getElementsByTagName()获取所有的node
            NodeList persons = document.getElementsByTagName("person");
            // getLength获取长度
            for (int i = 0; i < persons.getLength(); i++) {
                /*Node person = persons.item(i);
                //获取所有的属性名字
                NamedNodeMap attrs = person.getAttributes();
                for (int j=0;j<attrs.getLength();j++){
                    Node attr = attrs.item(j);
                    System.out.println(attr.getNodeName());
                    System.out.println(attr.getNodeValue());
                }*/
                Element person = (Element) persons.item(i);
                System.out.println(person.getAttribute("name"));
                System.out.println(person.getChildNodes().item(1).getFirstChild().getNodeValue());
                System.out.println(person.getChildNodes().item(1).getTextContent());
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
