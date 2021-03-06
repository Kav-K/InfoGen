package kaveen.fakeinfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONParse {
	public static JSONObject json;
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

	  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      return json;
	    } finally {
	      is.close();
	    }
	  }

	  public static void init() throws IOException, JSONException {
	    try {  json = readJsonFromUrl("http://api.namefake.com/"); 
	    //calls here
	    
	    } catch (Exception e) {
	    	System.out.println("Failed");
	    	System.exit(0);
	    }
	    
	    
	  }
	  public static String getProperty(String i) throws IOException, JSONException {
		  String b;
		  try {
			  b = json.getString(i);
			  return b;
		  } catch (Exception e) {
			  e.printStackTrace();
			  //TODO better error handling
			  return null;
		  }
		  
		  
		  
		  
	  }
}
