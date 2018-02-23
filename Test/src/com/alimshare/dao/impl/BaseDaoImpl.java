package com.alimshare.dao.impl;

import java.util.List;

import com.alimshare.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {

	@Override
	public T save(T object) {
		System.out.println("Save "+object.getClass().getSimpleName().toString());
		return object;
	}

	@Override
	public Boolean delete(Long id) {
		T object = this.get(id);
		System.out.println("Delete "+object.getClass().getSimpleName().toString());
		return true;
	}

	@Override
	public T get(Long id) {
		T object = (T) new Object();
		System.out.println("Get "+object.getClass().getSimpleName().toString());
		return object;
	}

	@Override
	public List<T> all() {
		System.out.println("List Data "+this.getClass().getSimpleName().toString());
		return null;
	}
	
}
