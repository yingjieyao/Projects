package db;
import java.sql.*;

import javax.naming.*;
import javax.sql.DataSource;

public class DbPool {
	private Connection conne;
	public Connection getConne(){
		return this.conne;
	}
	public void getConn(){
		try{
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:comp/env");
			DataSource dSource = (DataSource) envContext.lookup("jdbc/dbtom");
			conne = dSource.getConnection();
			String sb ="哈哈";
			System.out.println("success to db "+sb);
		}catch (Exception e){
			System.out.println("error to db");
		}
	}
	
	public ResultSet query(String sql){
		ResultSet rs=null;
		if(conne==null)getConn();
		try{
			Statement statement=this.conne.createStatement();
			rs=statement.executeQuery(sql);
		}
		catch (Exception e){
			System.out.println("!!!");
		}
		return rs;
	}
	
	
}
