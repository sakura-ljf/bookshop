package com.service;

import java.util.List;

import com.po.GoodsBean;

public interface GoodsService {

	int add(GoodsBean b);

	GoodsBean findbyid(int id);

	int updategoods(GoodsBean b);

	List<GoodsBean>findAll();

	int delid(int id);
}
