package com.wdh;

public class Player {

	double[] pos;
	double longLook, latLook;
	
	public Player (double[] pos) {
		this.pos = pos;
		longLook = 0;
		latLook = 0;
	}
	
	public double[] getPos() {
		return pos;
	}
	
}
