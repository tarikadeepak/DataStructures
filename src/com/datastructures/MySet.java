package com.datastructures;

public class MySet {
	private int[] setArray = new int[1];
	private int populatedItems = 0;

	public void add(int i) {
		if(populatedItems == (setArray.length - 1)) {
			int[] newArray = new int[2 * setArray.length];
			for(int j=0; j<setArray.length; j++) {
				newArray[j] = setArray[j];
			}
			setArray = newArray;
		}
		int k=0;
		int j = contains(i);
		if (j == -1) {
			setArray[populatedItems] = i;
			populatedItems++;
			System.out.println("Added i to set: " + i);
		}
	}

	public int contains(int i) {
		for(int j=0; j<populatedItems; j++) {
			if(setArray[j] == i) {
				return j;
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		if(populatedItems == 0) {
			return true;
		}
		return false;
	}

	public void remove(int i) {
		int j = contains(i);
		if (j != -1) {
			for (int k=j;k<populatedItems;k++) {
				setArray[k]=setArray[k+1];
			}
			populatedItems--;
		}
	}

public int length() {

	return populatedItems;
}

}
