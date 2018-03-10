package com.blog.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.blog.dao.conn.DataManager;
import com.blog.dao.conn.RowDatas;
import com.blog.pojo.Categories;

public class ArticleDao extends DataManager {
	private RowDatas<Categories> cate;
	
	public ArticleDao() {
		cate = new ArticleRows();
	}
	/**
	 * 获取所有分类
	 * @return
	 */
	public List<Categories> getAllCategories(){
		String sql = "select id,name from categories";
		return queryList(sql, cate);
	}
	private class ArticleRows implements RowDatas<Categories>{

		@Override
		public Categories getRowData(ResultSet rs) throws SQLException {
			Categories cate = new Categories();
			cate.setId(rs.getInt(1));
			cate.setName(rs.getString(2));
			return cate;
		}
		
	}
}
