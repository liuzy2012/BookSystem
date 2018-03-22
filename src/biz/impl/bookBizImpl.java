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

}
