package com.skilldistillery.foodtruck.app;

public class FoodTruck {

	int uniqueID;
	String truckName;
	String foodType;
	int rating;

	// food truck constructor
	public FoodTruck(String foodTruck, int uniqueId2, String typeFood, int stars) {
		// its field is set to the users input
		truckName = foodTruck;
		foodType = typeFood;
		rating = stars;
		uniqueID = uniqueId2;

	}

	@Override
	public String toString() {
		return "FoodTruck [uniqueID=" + uniqueID + ", truckName=" + truckName + "," + " foodType=" + foodType
				+ ", rating=" + rating + "]";
	}

}
