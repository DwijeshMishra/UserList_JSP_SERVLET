
package dao;
import connection.MyCon;
import java.sql.*;
import model.UserModel;
import java.util.List;
import java.util.ArrayList;
       
public class UserDao 
{
    public int autoIncr() throws SQLException
    {
        String sql;
        Connection con=null;
        sql="select max(id) from user";
        int max=0;
        PreparedStatement ps=null;
        con=MyCon.getConnection();
        ps=con.prepareStatement(sql);
        ResultSet rs=null;
        rs=ps.executeQuery();
        if(rs.next())
        {     
            max=rs.getInt(1);
            max=max+1;
        }    
      return max;
    }
    public int insertUser(UserModel S) throws SQLException
    {
        String sql;
        Connection con=null;
       
        sql="insert into user values(?,?,?,?)";
        PreparedStatement ps=null;
         con=MyCon.getConnection();
         ps=con.prepareStatement(sql);
         ps.setInt(1, S.getId());
         ps.setString(2, S.getName());
         ps.setString(3, S.getEmail());
         ps.setString(4, S.getCountry());
         int n=0; 
         n=ps.executeUpdate();
         return(n);   
        
      }
    
    
    public boolean updateUser(UserModel S)throws SQLException
    {
        String sql;
        Connection con=null;
        sql="update user set name=?,email=?,country=? where id=?";
         PreparedStatement ps=null;
         con=MyCon.getConnection();
         ps=con.prepareStatement(sql);
        
         ps.setString(1, S.getName());
         ps.setString(2, S.getEmail());
         ps.setString(3, S.getCountry());
          ps.setInt(4, S.getId());
         if(ps.executeUpdate()>0)
             return true;
       return false;  
    }        

    public int deleteById( int id)throws SQLException
    {
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement ps=null;
       con=MyCon.getConnection();
       String sql;
       sql="delete from user where id=?";
       ps=con.prepareStatement(sql);
       ps.setInt(1,id);
       int n=0;
       n=ps.executeUpdate();
       return n;
           
    }
    
   public UserModel searchById(int id) throws SQLException
   {
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement ps=null;
       con=MyCon.getConnection();
       String sql;
       sql="select * from user where id=?";
       ps=con.prepareStatement(sql);
       ps.setInt(1, id);
       rs=ps.executeQuery();
       UserModel UM=new UserModel();
       if(rs.next())
       {
                UM.setId(rs.getInt(1));
                UM.setName(rs.getString(2));
                UM.setEmail(rs.getString(3));
                UM.setCountry(rs.getString(4));
       }
       else
       {
           UM=null;
       }    
       
      return UM;   
   }
    public List<UserModel> searchAll()throws SQLException
    {
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement ps=null;
       con=MyCon.getConnection();
       String sql;
       sql="select * from user";
       ps=con.prepareStatement(sql);
       rs=ps.executeQuery();
       List<UserModel>mylist=new ArrayList<UserModel>();
       while(rs.next())
       {
                UserModel S=new UserModel();
                System.out.println(rs.getInt(1));
                S.setId(rs.getInt(1));
                S.setName(rs.getString(2));
                S.setEmail(rs.getString(3));
                S.setCountry(rs.getString(4));
                
                mylist.add(S);
                S=null;
       }    
       return mylist;
       
    }
}
