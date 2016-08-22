package top.joinxiao.dbutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	
	private static String DRIVER = "";
	private static String URL = "";
	private static String USER = "";
	private static String PWD = "";

	private static Properties pp;
	private static FileInputStream fis;

//	类第一次加载时加载连接驱动
	static {
		// String path="db.properties";只适用于j2se
		// String
		// path=Thread.currentThread().getContextClassLoader().getResource("/dbInfo.properties").getPath();
		String path = DBUtil.class.getResource("/dbInfo.properties").getPath();

		try {
			fis = new FileInputStream(path);
			pp = new Properties();
			pp.load(fis);
			DRIVER = pp.getProperty("DRIVER");
			URL = pp.getProperty("URL");
			USER = pp.getProperty("USER");
			PWD = pp.getProperty("PWD");

			Class.forName(DRIVER);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

//	获取数据库连接
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

//	关闭数据库连接
	public static void closeConn(Connection conn, Statement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if(st!=null){
				st.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
