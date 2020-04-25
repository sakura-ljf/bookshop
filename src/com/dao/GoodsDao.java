package com.dao;

import java.util.List;

import com.po.GoodsBean;

public interface GoodsDao {

	int addGoodsDao(GoodsBean b);

	GoodsBean findbyid(int id);

	int updategoods(GoodsBean b);

	List<GoodsBean>findAll();

	int delid(int id);

}
