package co.amzon.selenium.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDBdata{	
	public void selectDBdata(String product_name, String productprice) throws InterruptedException, SQLException, ClassNotFoundException{
		Connection connectionToDB=DBConnection.getConnection();
		
		String selectDBdata="select * from productinfo";
		PreparedStatement selectQuerryStmt=connectionToDB.prepareStatement(selectDBdata);
		ResultSet excuteselectQuerry=selectQuerryStmt.executeQuery();
		boolean status=false;
		while(excuteselectQuerry.next()) {
			String DBproductName=excuteselectQuerry.getString("product_name");
			String BDproductPrice=excuteselectQuerry.getString("productprice");
			System.out.println("product name :  "+DBproductName);
			System.out.println("product price : "+BDproductPrice);
			if(DBproductName.equals(product_name)&&BDproductPrice.equals(productprice))
			{
				System.out.println("test case passed");
				status=true;
				break;
			}
		}
		
		if(status==false) {
			System.out.println("testcase failed");
		}
	}
}

