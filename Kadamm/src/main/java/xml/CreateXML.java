package xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML {

	public static final String xmlFilePath = "";

	public static void main(String argv[]) {

		try {

			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

			Document document = documentBuilder.newDocument();

			// root element
			Element root = document.createElement("videogames");
			document.appendChild(root);

			// employee element
			Element game = document.createElement("game");

			root.appendChild(game);

			// set an attribute to staff element
			Attr attr = document.createAttribute("id");
			attr.setValue("10");
			game.setAttributeNode(attr);

			// you can also use staff.setAttribute("id", "1") for this

			// name element
			Element name = document.createElement("name");
			name.appendChild(document.createTextNode("Hades"));
			game.appendChild(name);

			// platform element
			Element platform = document.createElement("platform");
			platform.appendChild(document.createTextNode("Switch"));
			game.appendChild(platform);

			// publisher element
			Element publisher = document.createElement("publisher");
			publisher.appendChild(document.createTextNode("Supergiant Games"));
			game.appendChild(publisher);

			// price elements
			Element price = document.createElement("price");
			price.appendChild(document.createTextNode("29"));
			game.appendChild(price);

			// create the xml file
			// transform the DOM Object to an XML File
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File(xmlFilePath));

			// If you use
			// StreamResult result = new StreamResult(System.out);
			// the output will be pushed to the standard output ...
			// You can use that for debugging

			transformer.transform(domSource, streamResult);

			System.out.println("Done creating XML File");

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}
}
