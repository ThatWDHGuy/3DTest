package com.wdh;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Environment env = new Environment();
		Player p = new Player(new double[] {0,0,0});
		Window w = new Window("3D view test", p, env);
		ArrayList<double[]> mesh = new ArrayList<double[]>();
		mesh.add(new double[] {-10, 0, -10, 0, 10, 0, 10, 0, 10});
		env.addProp(mesh, 0, 0, 0, 0, 0);
		while (true) {
			w.update();
		}
		

	}

}
