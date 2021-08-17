package co.amzon.selenium.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

public class InsertOperation extends SelectDBdata{
	
		public void insertDBdata(String product_name,String productprice) throws InterruptedException, SQLException, ClassNotFoundException{
    
		Connection connectionToDB=DBConnection.getConnection();
   
		String insertFristData="insert into productinfo values(?,?)";
		PreparedStatement insertQuerryExcute=connectionToDB.prepareStatement(insertFristData);
		insertQuerryExcute.setString(1, product_name);
		insertQuerryExcute.setString(2, productprice);
		
		int excutequerry=insertQuerryExcute.executeUpdate();
 		    if(excutequerry>0) {
 				System.out.println("insertion is done");
 			}
 			else {
 				System.out.println("insertion is not done");
 			}
 				
 		   insertQuerryExcute.close();	 
     }
}




