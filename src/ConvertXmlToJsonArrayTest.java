import org.json.*;
public class ConvertXmlToJsonArrayTest {
    public static String xmlString= "<?xml version=\"1.0\" ?><root><test attrib=\"jsontext1\">tutorialspoint</test><test attrib=\"jsontext2\">tutorix</test></root>";
    public static void main(String[] args) {
        try {
            JSONObject json = XML.toJSONObject(xmlString); // converts xml to json
            String jsonPrettyPrintString = json.toString(4); // json pretty print
            System.out.println(jsonPrettyPrintString);
        } catch(JSONException je) {
            System.out.println(je.toString());
        }
    }
}