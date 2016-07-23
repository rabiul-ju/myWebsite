package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import model.CreateBlog;



public class DatabaseQuery {
	
	 Connection connection;
     Statement statement;
     ResultSet rs;
     /**********************
      * Here is login System
      **********************/
     public ResultSet login(String username, String password){
     
         initConnection();
         String sql;
         sql="select * from super_user where username='"+username+"' and password='"+password+"'";
         
         try {
			rs=statement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
               
        return rs; 
     }
     /*************************************
      * Here is creating blog into Database
      *************************************/
		public String createBlog(CreateBlog blog) {
			// TODO Auto-generated method stub
	         initConnection();
	         String sql,message,id;
	         id=null;
	         sql="insert into myblog values ('','"+blog.getBlogTitle()+"','"+blog.getBlogSummary()+"','"+blog.getBlog()+"',"
	         		+ "'"+blog.getDate()+"')";
	         try {
				statement.executeUpdate(sql);
				message="inserted succssfully";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				message="something wrong in inserted...."+sql;
				//e.printStackTrace();
			}
	         closeConnection();
			return message;
		}

/*************************************
 * Here is showing blog query		
 ************************************/
		public ResultSet showBlog() {
			// TODO Auto-generated method stub
			initConnection();
			rs=null;
			String sql="select * from myblog";
			try {
				rs=statement.executeQuery(sql);
				System.out.println("result set is sent to servlet");
//				closeConnection();
				return rs;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("result set is sent to servlet");
				e.printStackTrace();
//				closeConnection();
				return rs;
				
			}
			
		}

     private void initConnection(){
    	    

         connection = new DatabaseConnection().getConnection();
         try{
             statement = connection.createStatement();
         }catch(SQLException e){
             e.printStackTrace();
             
         }
         
     }
         
         private void closeConnection(){
         
             try {
                 statement.close();
                 connection.close();
             } catch (SQLException ex) {
                 ex.printStackTrace();
             }
         }
	


}
