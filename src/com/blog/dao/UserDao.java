package com.blog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.blog.dao.conn.DataManager;
import com.blog.dao.conn.ParamSet;
import com.blog.dao.conn.RowDatas;
import com.blog.pojo.User;

/**
 * 用户dao
 * @author cier
 *
 */
public class UserDao extends DataManager{
	private RowDatas<User> user;
	private RowDatas<Integer> inte;
	public UserDao() {
		user = new UserDatas();
		inte = new InteDatas();
	}
	/**
	 * 检查用户是否存在
	 * @param username
	 * @return
	 */
	public int checkUserName(String username) {
		String sql = "select count(1) from user where name = ?";
		return query(sql, new ParamSet(username), inte);
	}
	/**
	 * 检查用户账号密码是否存在
	 * @param name
	 * @param password
	 * @return
	 */
	public int checkUserPassword(String name,String password) {
		String sql = "select count(1) from user where name = ? and password = ?";
		return query(sql, new ParamSet(name,password),inte);
	}
	public class UserDatas implements RowDatas<User> {

		@Override
		public User getRowData(ResultSet rs) throws SQLException {
			User user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPhone(rs.getString(3));
			user.setEmail(rs.getString(4));
			user.setDescription(rs.getString(5));
			user.setStatus(rs.getShort(6));
			return user;
		}
	}
	public class InteDatas implements RowDatas<Integer> {

		@Override
		public Integer getRowData(ResultSet rs) throws SQLException {
			return rs.getInt(1);
		}
		
	}
}
