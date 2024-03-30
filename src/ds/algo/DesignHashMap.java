package ds.algo;

import java.util.LinkedList;

public class DesignHashMap {

	private final LinkedList<Integer>[] keys;
	private final LinkedList<Integer>[] values;
	private static final int NUM_BUCKETS = 1000;

	public DesignHashMap() {
		keys = new LinkedList[NUM_BUCKETS];
		values = new LinkedList[NUM_BUCKETS];
	}

	public void put(int key, int value) {
		int hash = key % NUM_BUCKETS;
		if (keys[hash] == null) {
			keys[hash] = new LinkedList<Integer>();
			values[hash] = new LinkedList<Integer>();
		}
		for(int i=0; i<keys[hash].size(); i++) {
			if(keys[hash].get(i)==key) {
				values[hash].set(i, value);
				return;
			}
		}
		keys[hash].add(key);
		values[hash].add(value);
	}
	
	public int get(int key) {
		int index = key % NUM_BUCKETS;
		if(keys[index] != null) {
			for(int i=0; i<keys[index].size(); i++	) {
				if(keys[index].get(i)==key) {
					return values[index].get(i);
				}
			}
		}
		return -1;
	}
	
	public void remove(int key) {
		int index = key % NUM_BUCKETS;
		if(keys[index]!=null) {
			for(int i=0; i<keys[index].size(); i++) {
				if(keys[index].get(i)==key) {
					keys[index].remove(i);
					values[index].remove(i);
					return;
				}
			}
		}
	}

}
