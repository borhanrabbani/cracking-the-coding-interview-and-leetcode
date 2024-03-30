package ds.algo;

import java.util.LinkedList;

public class MyHashSet {
	private static final int SIZE=1000;
	private LinkedList<Integer>[] buckets;

	public MyHashSet() {
		buckets = new LinkedList[SIZE];
		for(int i=0; i<SIZE; i++) {
			buckets[i]=new LinkedList<Integer>();
		}
	}
	
	public void add(int key) {
		int hash = key % SIZE;
		if(!contains(key)) {
			buckets[hash].add(key);
		}
	}

	public void remove(int key) {
		int hash = key % SIZE;
		buckets[hash].removeFirstOccurrence(key);
	}

	public boolean contains(int key) {
		int hash = key % SIZE;
		return buckets[hash].contains(key);
	}

	public static void main(String[] args) {

	}

}
