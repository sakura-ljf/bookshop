package com.service.impl;

import java.util.List;

import com.dao.GoodsDao;
import com.dao.impl.GoodsDaoImpl;
import com.po.GoodsBean;
import com.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {

	@Override
	public int add(GoodsBean b) {
		GoodsDao goodsDao = new GoodsDaoImpl();
		int f=goodsDao.addGoodsDao(b);
		return f;
	}

	@Override
	public GoodsBean findbyid(int id) {
		GoodsDao goodsDao = new GoodsDaoImpl();
		GoodsBean f=goodsDao.findbyid(id);
		return f;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updategoods(GoodsBean b) {
		// TODO Auto-generated method stub
		GoodsDao goodsDao = new GoodsDaoImpl();
		int f=goodsDao.updategoods(b);
		return f;
	}

	@Override
	public List<GoodsBean> findAll() {
		// TODO Auto-generated method stub
		GoodsDao goodsDao = new GoodsDaoImpl();
		return goodsDao.findAll();
	}

	@Override
	public int delid(int id) {
		// TODO Auto-generated method stub
		GoodsDao goodsDao = new GoodsDaoImpl();
		return goodsDao.delid(id);
	}

}
