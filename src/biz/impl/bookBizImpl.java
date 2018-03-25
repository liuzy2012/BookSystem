package biz.impl;

import java.util.ArrayList;

import biz.bookBiz;
import dao.bookDao;
import dao.impl.bookDaoImpl;
import pojo.PageBean;
import pojo.book;

public class bookBizImpl implements bookBiz{
	private bookDao bookdao=new bookDaoImpl();;
	private ArrayList<book> books;
	@Override
	public ArrayList<book> searchAllBook(PageBean<book> pb) {
		books=bookdao.searchAllBook(pb);
		return books;
	}
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return bookdao.getTotalCount();
	}
	@Override
	public boolean editBook(int bookid,String bookintro,int bookbor) {
		return bookdao.editBook(bookid,bookintro,bookbor);
	}
	@Override
	public book getBookById(int bookid) {
		// TODO Auto-generated method stub
		book bk=bookdao.getBookById(bookid);
		return bk;
	}

}
