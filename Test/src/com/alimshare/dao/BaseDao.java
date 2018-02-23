package com.alimshare.dao;

import java.util.List;

public interface BaseDao<T> {
	
	public T save(T object);
	public Boolean delete(Long id);
	public T get(Long id);
	public List<T> all();
	
}
