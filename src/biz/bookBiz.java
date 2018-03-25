package biz;

import java.util.ArrayList;

import pojo.PageBean;
import pojo.book;

public interface bookBiz {
	public ArrayList<book> searchAllBook(PageBean<book> pb);
	public book getBookById(int bookid);
	public boolean editBook(int bookid,String bookintro,int bookbor);
	public int getTotalCount();
}
