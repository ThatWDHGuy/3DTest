package com.wdh;

import java.io.File;
import java.util.ArrayList;

public class Environment {
	
	ArrayList<Prop> objects;
	
	public Environment() {
		objects = new ArrayList<Prop>();
	}
	
	public void addProp(ArrayList<double[]> mesh, double x, double y, double z, double longRot, double latRot) {
		try {
			objects.add(new Prop(mesh, x, y, z, longRot, latRot));
		} catch (Exception e) {
			System.out.println("Error Loading Prop");
		}
	}

}
