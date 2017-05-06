package com.vdong;

public class ColorIterator implements Iterator {
	private String[] colors;
	private int position = 0;
	
	public ColorIterator() {
	}
	
	public ColorIterator(String[] colors) {
		this.colors = colors;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= colors.length || colors[position] == null)
			return false;
		return true;
	}

	@Override
	public Object getNext() {
		String color = colors[position];
        position++;
        return color;
	}

}
