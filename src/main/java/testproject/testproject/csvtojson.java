package testproject.testproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class csvtojson {
	public static void main(String[] args) {

        String csvFile = "D:/softwares/sample.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        String code = "";
        String  name = "";
        
        //"1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia"
        //"1.0.1.0","1.0.3.255","16777472","16778239","CN","China"
        //

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

               code= country[4] ; 
               name= country[5];

            }
            Detail det = new Detail(code,name); 
            ObjectMapper mapper = new ObjectMapper();
            try
    		{ 
    			//System.out.println("Default JSON String:" + mapper.writeValueAsString(cricketer));
    			System.out.println("formatted JSON Stri" +mapper.writerWithDefaultPrettyPrinter().writeValueAsString(det.toString())); 
    			} 
    		catch (JsonGenerationException e)
    		{
    			e.printStackTrace();
    			} 
    		catch (JsonMappingException e)
    		{ 
    			e.printStackTrace(); 
    			} 
    		catch (IOException e)
    		{ e.printStackTrace(); 
    		}
	} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    if (br != null) {
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}	
	}
	//Detail det = new Detail(code,name);
	
class Detail
{
	//"1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia"
        //"1.0.1.0","1.0.3.255","16777472","16778239","CN","China"
		
	private String code;
	//private String sport;
	//private int age;
	private String country; 
	//private int[] Clustervalues;
	public Detail(String code,String country)//int[] Cvalues) 
	{ 
		this.code = code;
		//this.sport = sport; 
		//this.age = age; 
		this.country = country;
		//Clustervalues = Cvalues;
		} 
	public final String getName()
	{ 
		return code;
		} 
		
	public final String getId()
	{
		return country;
	} 
	
	public final void setName(String code) 
	{
		this.code = code;
		}
	
	public final void setId(String country)
	{
		this.country = country; 
	} 
	/*public final void setclustervalues(int[] Clustervalues)
	{
		this.Clustervalues = Clustervalues;
		}*/
	@Override
	public String toString() 
	{
		return "Detail [Clustername=" +code+", Clusterid="+country +  "]"; 
		} 
	} 

