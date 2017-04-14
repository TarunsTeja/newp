package testproject.testproject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;

import org.json.simple.parser.JSONParser;

public class jsondemo {
	private static int count = 0;
    public static void main(String[] args) {
    	 String csvFile = "D:/softwares/clusterop.csv";
    	 BufferedReader br = null;
         String line = "";
         String cvsSplitBy = ",";
         String str = "";
         
        // JSONArray Output = new  JSONArray();
         try {

             br = new BufferedReader(new FileReader(csvFile));
             while ((line = br.readLine()) != null) {

               
                 String[] country = line.split(cvsSplitBy);
                 JSONObject obj = new JSONObject();
                 JSONArray arr = new JSONArray();
   
    	 obj.put("ClusterName",country[0]);
    	 obj.put("Cluster id",++count);
    	 for(int i=0 ; i<country.length ;i++){
    		 arr.add(country[i]);
    	 }
    	 obj.put("clusterValues",arr);
    	 System.out.println(obj.toJSONString());
    	 //Output.add( obj);
    	 
    	 
    	 }
            //System.out.println(Output.toJSONString());
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
    	  
   

