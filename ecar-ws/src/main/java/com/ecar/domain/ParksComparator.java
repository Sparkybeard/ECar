package com.ecar.domain;

import java.util.Comparator;

import com.ecar.ws.CoordinatesView;
import com.ecar.ws.ParkView;

public class ParksComparator implements Comparator<ParkView> {
	private CoordinatesView userCoords;
	
	public ParksComparator(CoordinatesView userCoords) {
		this.userCoords = userCoords;
	}

	@Override
	public int compare(ParkView o1, ParkView o2) {
		CoordinatesView coords1 = o1.getCoords();
		CoordinatesView coords2 = o2.getCoords();
		double dist1 = Math.sqrt(Math.pow(coords1.getY() - this.userCoords.getY(), 2) +
								  Math.pow(coords1.getX() - this.userCoords.getX(), 2));
		double dist2 = Math.sqrt(Math.pow(coords2.getY() - this.userCoords.getY(), 2) +
				  				  Math.pow(coords2.getX() - this.userCoords.getX(), 2));
		return Double.compare(dist1, dist2);
	}

}
