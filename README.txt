AUCTION SERVER 
PROJECT 2
CO225-SOFTWARE CONSTRUCTION
_______________________________________________________
GROUP NO-11

GROUP MEMBERS
E/16/200
E/16/203
E/16/217
_______________________________________________________
There are 12 java files , stock.csv file and README.txt file are in the project.
Server.java contains the main method.
________________________________________________________
To compile
javac Server.java

To run
java Server

Then, the server GUI opens

The client can use the terminal to connect to the server.
Connect to the to the server using nc command through port no 2000.
Clients can connect to the server using following command format.

nc <host name> 2000

<host name> is  the host name where server is situated.
If server is remotely situated ,<host name> is the ip address.
If server is in the same PC , <host name> is localhost.
_________________________________________________________
SERVER GUI
*You can change the price of an item using "Change Price Of An Item" button.
*You can view the details(symbol,name,current price) of all the items using "List  Stock Items" button.
*Server GUI displays the current price of following Symbols: FB, VRTU,
 MSFT, GOOGL, YHOO, XLNX, TSLA and TXN.
*Server tracks all the changes done to the stock item and GUI shows how the offers varied with time
 and who made the offers.Those information are showed in another table in the server GUI.

CLIENT GUI
*You have to enter a valid name to place the bid.You can't use a name of a user who has already connected to the system.(it will asks you to give another name)
*After giving the name, you can enter the symbol of the Security you want to place the bid. If it is available, client GUI shows
 the name and the current price , if it is not available GUI will say you , that item is not available and it shows -1.
*After you enter a valid symbol...you are ready to place your bid..Your bid should be greater than the current price.
*Note-Once you give your name, you can't change it.
*So,if you want to bid for another company you can search for the new company and place the bid again without quiting.
*so from one client GUI,you can bid for multiple items.
 
