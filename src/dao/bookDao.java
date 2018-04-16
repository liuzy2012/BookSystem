package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.PageBean;
import pojo.book;

public interface bookDao {
	public ArrayList<book> searchAllBook(PageBean<book> pb);
	public book getBookById(int bookid);
	public boolean editBook(int bookid,String bookintro,int bookbor);
	public List<book> searchBook(String bookName);
	public int getTotalCount();
}
