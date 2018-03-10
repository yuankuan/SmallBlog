package com.blog.service;

import java.util.List;

import com.blog.dao.ArticleDao;
import com.blog.pojo.Categories;

public class ArticleService {
	private ArticleDao articleDao;

	public ArticleService() {
		articleDao = new ArticleDao();
	}
	/**
	 * 获取所有分类
	 * @return
	 */
	public List<Categories> getAllCategories(){
		return articleDao.getAllCategories();
	}
}
