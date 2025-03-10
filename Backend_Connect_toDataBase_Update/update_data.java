package java_bck;
import java.sql.*;
import java.io.*;

public class update_data {


	public static void main(String[] args)  {
	
		try {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll:");
		int r =Integer.parseInt(br.readLine());
		System.out.println("Enter New_Email:");
		String em=br.readLine();
		// register the driver or provider
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create connect
		Connection con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/tmsl_data","root", "");
		String s="update info set email= ?where roll=?"; //student name deoya ache sql data badse a , akhane ja name deoya thakbe sql data base ar table a tai dite hobe 
		PreparedStatement ps =con.prepareStatement(s);
   		ps.setString(1,em);
   		ps.setInt(2, r);
   		int i=ps.executeUpdate();
   		if(i>0) {
   		System.out.println("Data updated");
   		}
   		else {
   			System.out.println("Data not updated");
   		}
	}catch(Exception e) {
		System.out.println(e);
	}
	}


		

	}
