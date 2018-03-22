package utils;
import java.sql.*;
public class myDB {
	private static String driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/booksys";
	private static String user="root";
	private static String password="123zxc";
	public myDB() {
	}
	static {
		try {
			Class.forName(driver);
		} catch (Exception e) {
		}
	}
	//获取connection
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
	}
	//释放资源
	public static void closeResource(Connection conn,Statement st,ResultSet rs) {
		closeConnection(conn);
		closeStatement(st);
		closeResultSet(rs);
	}
	//释放连接
	public static void closeConnection(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			conn=null;
		}
	}
	//释放statement
	public static void closeStatement(Statement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		st=null;
	}
	//释放resultset
	public static void closeResultSet(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			rs=null;
		}
	}
}
