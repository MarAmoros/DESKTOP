package xml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NodosXML {
	public NodosXML(String FILENAME) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document doc = db.parse(new File(FILENAME));
			doc.getDocumentElement().normalize();

			NodeList list = doc.getElementsByTagName("Preguntas");

			for (int temp = 0; temp < list.getLength(); temp++) {

				Node node = list.item(temp);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					Node idioma = element.getElementsByTagName("Idioma").item(0);
					Node Tipo = element.getElementsByTagName("Tipo").item(0);
					Node Countdown = element.getElementsByTagName("Countdown").item(0);
					Node Timeout = element.getElementsByTagName("Timeout").item(0);
					Node Max = element.getElementsByTagName("MaxPreguntas").item(0);
					Node Path = element.getElementsByTagName("Ruta").item(0);
				}
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}