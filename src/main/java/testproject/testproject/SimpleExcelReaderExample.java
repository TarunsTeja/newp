package testproject.testproject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.lang.ArrayIndexOutOfBoundsException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class SimpleExcelReaderExample 
{
	public static void main(String[] args) 
	{

        String csvFile = "D:/softwares/newsample.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        
        String code = "";
        String  name = "";
        String  name1 = "";
        //String  clustervalues = "";
        
        //"1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia"
        //"1.0.1.0","1.0.3.255","16777472","16778239","CN","China"
        //

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                System.out.println(country.length);
               name = country[0] ; 
               name1 = country[1];
               code = country[2];
               //clustervalues = country[3];
               

            }
            Detail1 det = new Detail1(name,name1,code); 
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
class Detail1
{
	//"1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia"
        //"1.0.1.0","1.0.3.255","16777472","16778239","CN","China"
		
	private String clustername;
	private String clustername2;
	private String id;
	//private String country; 
	//private int[] Clustervalues;
	public Detail1(String clustername,String clustername2 , String id) 
	{ 
		this.clustername = clustername;
		this.clustername2 = clustername2 ; 
		this.id = id; 
		//this.country = country;
		//Clustervalues = Cvalues;
	} 
	public final String getName()
	{ 
		return clustername;
		} 
		
	public final String getName2()
	{ 
		return clustername2;
		} 
	public final String getId()
	{
		return id;
	} 
	
	public final void setName(String clustername) 
	{
		this.clustername = clustername;
	}
	public final void setName2(String clustername2) 
	{
		this.clustername2 = clustername2;
	}
	public final void setId(String id)
	{
		this.id = id; 
	} 
	/*public final void setclustervalues(int[] Clustervalues)
	{
		this.Clustervalues = Clustervalues;
		}*/
	@Override
	public String toString() 
	{
		return "output1: [clustername=" + clustername + ", id=" + id + ", clustername2=" + clustername2 + "]"; 
		} 
	} 