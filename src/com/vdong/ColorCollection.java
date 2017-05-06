package com.vdong;

public class ColorCollection implements AbstractCollection {
	private String[] colors;
	
	public ColorCollection() {
		colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";
	}
	
	@Override
	public Iterator createIterator() {
		return new ColorIterator(colors);
	}

}
