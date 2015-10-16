package com.akelius.propertyapp.dao;

import java.util.Collection;

public interface AbstractDAO<T,K> {

	public Collection<T> getAll();
	public T getOne(K key);
	public void updateOne(K key);
	public void deleteOne(K key);
	public void deleteAll();
}
