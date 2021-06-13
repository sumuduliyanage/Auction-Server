/*
Authors:E/16/200
		E/16/203
		E/16/217
This class contains the items in the stock and its collection
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random; 

public class StockDB {
	
    private static	HashMap<String,StockInfo> item_stock; //getting a hashmap to store the features of items in the stock market
    private String csvFile = "stocks.csv"; //file where the details are in
    private FileReader file_rd=null; //Filereader
    private BufferedReader reader=null; //BufferedReader
   
    
    public StockDB(){
       
       item_stock = new HashMap<String,StockInfo>();
        
        try {
            file_rd = new FileReader(csvFile); 
            reader = new BufferedReader(file_rd);
            String [] values;//current line
            reader.readLine();
            Random rand = new Random(); 
            
            for(String line = reader.readLine(); line != null; line = reader.readLine()) { 
				
                values = line.split(",");//this string array consists of the fields in the stock.csv file
                
                //String price = values[values.length-1];//price is at the end of the column
                int price = rand.nextInt(500); 
		        StockInfo item = new StockInfo(values[0],values[1],(double)price);//symbol,name,price
		        item_stock.put(values[0],item); //the details about each comany are stored in the hashmap 
	         }
	    
	      
	       
        } catch (FileNotFoundException ex) {//if the file is not found
			ex.printStackTrace();
            System.exit(-1);
        } catch (IOException ex){//Input Output Exception
			ex.printStackTrace();
            System.exit(-1);
        }
        finally {
          
           if ( file_rd != null ) {//they should be closed either they are errors or not
                try {
                    file_rd.close();
                }catch (IOException exx) {
                    exx.printStackTrace();
                }
            }
           	       
	       if ( reader != null ) {
                try {
                    reader.close();
                }catch (IOException exxx) {
                    exxx.printStackTrace();
                }
            }
        }
    }
    
    
     public static StockInfo getStockInfo(String symbol){
        return item_stock.get(symbol);
    }
    
    public static void setPrice(String symbol,double price){
       StockInfo item = item_stock.get(symbol);
       item.setPrice(price);
       item_stock.put(symbol, item);
    }
    
    public static boolean isExist(String symbol){
        return item_stock.containsKey(symbol);
    }
    
    public static Collection<StockInfo> getValues(){
        return item_stock.values();
    }
    
     
}



class StockInfo {//this class contains symbol, name and price

    private String symbol;
    private String security_name;
    private double price;
    

    public StockInfo(String symbol, String security_name, double price) {
        this.symbol = symbol;
        this.security_name = security_name;
        this.price = price;
    }

    public String getSymbol() {//to get the symbol
        return symbol;
    }

    public String getSecurity_name() {//to get the name
        return security_name;
    }
    
    public double getPrice() {//to get the price
        return price;
    }

    public void setPrice(double price) {//to set the price
        this.price = price;
    }
      
}

