package dao;

import java.util.ArrayList;

import pojo.PageBean;
import pojo.book;

public interface bookDao {
	public ArrayList<book> searchAllBook(PageBean<book> pb);
	public int getTotalCount();
}
