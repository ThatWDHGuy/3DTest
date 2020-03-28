package com.wdh;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;

public class Screen extends JPanel {

	private static final long serialVersionUID = 1L;
	Player player;
	Environment env;
	
	
	public Screen(Player player, Environment env) {
		this.player = player;
		this.env = env;
	}

	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.translate(getWidth()/2, getHeight()/2);
        
        g.setColor(Color.RED);
        for (Prop p : env.objects) {
        	for (double[] tri : p.m.triangles) {
        		ArrayList<Integer> xPoints = new ArrayList<Integer>();
        		ArrayList<Integer> yPoints = new ArrayList<Integer>();
        		for (int i = 0; i < 9; i += 3) {
        			xPoints.add(getPointPos(distFromP(tri), tri[i], tri[i+2]));
        			yPoints.add(getPointPos(distFromP(tri), tri[i+1], tri[i+2]));
        		}
        		Object[] oX = xPoints.toArray();
        		Object[] oY = yPoints.toArray();
        		int[] xPs = new int[3];
        		int[] yPs = new int[3];
        		for(int i = 0; i < oX.length; i++) {
        			xPs[i] = (int) oX[i];
        			yPs[i] = (int) oY[i];
        		}
        		g.fillPolygon(xPs, yPs, 3);
        	}
        }
    }
	
	private double distFromP(double[] ds) {
		return Math.sqrt(Math.pow((ds[0] - player.getPos()[0]), 2) + Math.pow((ds[1] - player.getPos()[1]), 2) + Math.pow((ds[2] - player.getPos()[2]), 2));
	}

	public double dotP(double[] a, double[] b) {
		return a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
	}
	
	public int getPointPos(double dist, double pointXY, double pointZ) {
		double[] playerVec = {0, 0, 10};
		return 0;
	}
	

}
