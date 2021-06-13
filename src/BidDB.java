/*
Authors:E/16/200
		E/16/203
		E/16/217
This class contains the details about the bids
 */


import java.util.Date;
import java.util.ArrayList;

public class BidDB {
    private static ArrayList<Bid> BidList;
    
    public BidDB() {
        BidList =new ArrayList<Bid>(); 
    }
    
    public static void addBid(Bid bid){
        BidList.add(bid);
        ServerGuiController.FillTable(bid);
    }

    public static ArrayList<Bid> getBidList() {
        return BidList;
    }
    
}

class Bid {
	
    private String client_name;//who placed the bid
    private String symbol; //symol of the stock item
    private Date date; //date when the bid was placed
    private double newprice;//new price 

    public Bid(String client_name, String symbol, Date date, double price) {
        this.client_name = client_name;
        this.symbol = symbol;
        this.date = date;
        this.newprice = price;
    }

    public String getClientName() {//to get the name of the person who bid
        return client_name;
    }

    public String getSymbol() {//the stock item he placed the bid
        return symbol;
    }

    public Date getDate() {//date he did it
        return date;
    }

    public double getPrice() {//what was the price of the new bid
        return newprice;
    }
    
    
}




