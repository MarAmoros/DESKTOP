package xml;
import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class NodosXML {
	public Node idioma, Tipo, Timeout, Max, Path, CountDown;

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
					idioma = element.getElementsByTagName("Idioma").item(0);
					Tipo = element.getElementsByTagName("Tipo").item(0);
					CountDown = element.getElementsByTagName("CountDown").item(0);
					Timeout = element.getElementsByTagName("Timeout").item(0);
					Max = element.getElementsByTagName("MaxPreguntas").item(0);
					Path = element.getElementsByTagName("Ruta").item(0);
				}
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}