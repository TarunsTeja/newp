package testproject.testproject;
import java.io.IOException; 
import org.codehaus.jackson.JsonGenerationException; 
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/** * Java program to format JSON String using Jackson API. Jackson provides 
 * * nice pretty print feature to print JSON text as formatted output. *
 *  * @author Javin Paul 
 *  */ 
public class JSONPrintDemo
{ 
	public static void main(String args[]) 
{ 
	int[] recentScores = {77, 72, 23, 57, 54, 36, 74, 17};
	//Player cricketer = new Player("Virat", "cricket", 25, 121, recentScores); 
	ObjectMapper mapper = new ObjectMapper(); 
	try {
		System.out.println("hello");
	//	System.out.println("Default JSON String:" + mapper.writeValueAsString(cricketer)); 
	//System.out.println("formatted JSON String \n" + mapper.defaultPrettyPrintingWriter().writeValueAsString(cricketer)); 
	} 
	/*catch (JsonGenerationException e)
	{ 
		e.printStackTrace();
	} 
	catch (JsonMappingException e)
	{ 
		e.printStackTrace(); 
	} 
	catch (IOException e) { e.printStackTrace(); 
	}*/
	catch (Exception e) { e.printStackTrace(); 
	}
 }
}

