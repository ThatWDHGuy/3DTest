package com.wdh;

import java.io.File;
import java.util.ArrayList;

public class Prop {
	
	double x,y,z,longRot, latRot;
	Mesh m;

	public Prop (ArrayList<double[]> mesh, double x, double y, double z, double longRot, double latRot) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.longRot = longRot;
		this.latRot = latRot;
		
		m = new Mesh(mesh);
	}
	
}
