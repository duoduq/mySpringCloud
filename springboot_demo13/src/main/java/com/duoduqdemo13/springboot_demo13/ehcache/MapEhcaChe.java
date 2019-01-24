package com.duoduqdemo13.springboot_demo13.ehcache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

/**
 * duoduq
 */
@Component
public class MapEhcaChe<K, V> {
	private Map<K, V> ehcaCheMap = new ConcurrentHashMap<K, V>();

	public void put(K k, V value) {
		ehcaCheMap.put(k, value);
	}

	public V get(K k) {
		return ehcaCheMap.get(k);
	}

	public void remove(K k) {
		ehcaCheMap.remove(k);
	}
}
