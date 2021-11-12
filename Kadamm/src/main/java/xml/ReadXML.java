package xml;
import java.io.*;

import javax.xml.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class ReadXML {
	private static final String FILENAME = "config.xml";

	public static void main(String[] args) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document doc = db.parse(new File(FILENAME));
			doc.getDocumentElement().normalize();

			System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
			System.out.println("------");

			NodeList list = doc.getElementsByTagName("Preguntas");

			for (int temp = 0; temp < list.getLength(); temp++) {

				Node node = list.item(temp);

				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;

					String idioma = element.getElementsByTagName("Idioma").item(0).getTextContent();
					String Tipo = element.getElementsByTagName("Tipo").item(0).getTextContent();
					String Timeout = element.getElementsByTagName("Timeout").item(0).getTextContent();
					String Max = element.getElementsByTagName("MaxPreguntas").item(0).getTextContent();
					String Path = element.getElementsByTagName("Ruta").item(0).getTextContent();

					System.out.println("Idioma : " + idioma);
					System.out.println("Tipo : " + Tipo);
					System.out.println("Timeout : " + Timeout);
					System.out.println("Maximo de Preguntas : " + Max);
					System.out.println("Ruta Fichero Creación : " + Path);
				}
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

	}

}