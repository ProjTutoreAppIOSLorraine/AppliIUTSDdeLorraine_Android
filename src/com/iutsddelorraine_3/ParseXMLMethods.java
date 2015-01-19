package com.iutsddelorraine_3;
 
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
 
 
public class ParseXMLMethods {
 
    public final static Document XMLfromString(String xml){
 
        Document doc = null;
 
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
 
            DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource();
            is.setEncoding ("UTF-8");
            is.setCharacterStream(new StringReader(xml));
            doc = db.parse(is);
 
        } catch (ParserConfigurationException e) {
            System.out.println("XML parse error: " + e.getMessage());
            return null;
        } catch (SAXException e) {
            System.out.println("Wrong XML file structure: " + e.getMessage());
            return null;
        } catch (IOException e) {
            System.out.println("I/O exeption: " + e.getMessage());
            return null;
        }
        return doc;
    }
 
     public final static String getElementValue( Node elem ) {
         Node kid;
         if( elem != null){
             if (elem.hasChildNodes()){
                 for( kid = elem.getFirstChild(); kid != null; kid = kid.getNextSibling() ){
                     if( kid.getNodeType() == Node.TEXT_NODE  ){
                         return kid.getNodeValue();
                     }
                 }
             }
         }
         return "";
     }
 
     public static String getXML(){
            String line = null;
 
            try {
 
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost("http://courtil-antoine.fr/PT/news_android.xml");
 
                HttpResponse httpResponse = httpClient.execute(httpPost);
                HttpEntity httpEntity = httpResponse.getEntity();
                line = EntityUtils.toString(httpEntity);
 
            } catch (Exception e) {
                line = "Internet Connection Error >> " + e.getMessage();
            }
            return line;
    }
 
    public static int numResults(Document doc){
        Node results = doc.getDocumentElement();
        int res = -1;
        try{
            res = Integer.valueOf(results.getAttributes().getNamedItem("count").getNodeValue());
        }catch(Exception e ){
            res = -1;
        }
        return res;
    }
 
    public static String getValue(Element item, String str) {
        NodeList n = item.getElementsByTagName(str);
        return ParseXMLMethods.getElementValue(n.item(0));
    }
}