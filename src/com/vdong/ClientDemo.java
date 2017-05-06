package com.vdong;

/*Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation
 * 
 * 
 */
public class ClientDemo {

	public static void main(String[] args) {
		AbstractCollection colorCollection = new ColorCollection();
		Iterator iter = colorCollection.createIterator();
        
        while(iter.hasNext()){
            System.out.println(iter.getNext());
        }
	}

}
