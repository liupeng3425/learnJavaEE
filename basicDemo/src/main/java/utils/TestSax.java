package utils;

import org.xml.sax.SAXException;
import utils.XmlDecoder;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Peng on 2016/6/5.
 * test sax
 */
public class TestSax {
    public static void main(String[] args) {
        File people = new File("src/xml/people.xml");
        try {
            XmlDecoder.sax(people);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
