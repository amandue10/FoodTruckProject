package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruck {
	private String foodTruckName;
	private String foodType;
	private int truckRating;
	private int uniqueId = 0;
	private static int nextId = 1;
	private int counter;

	private FoodTruck foodTruckArr[] = new FoodTruck[5];

	public void truckInput(Scanner input) {
		String truckName, foodType;
		int truckRating, i;

		for (i = 0; i < foodTruckArr.length; i++) {
			System.out.println("Enter name of food truck you would like to rate:");
			truckName = input.next();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			foodTruckArr[i] = new FoodTruck();
			foodTruckArr[i].setTruckName(foodTruckName);

			System.out.println("Enter type of food:");
			foodType = input.next();
			foodTruckArr[i].setFoodType(foodType);

			System.out.println("Enter Truck Star Rating, 1 through 5 ");
			truckRating = input.nextInt();
			foodTruckArr[i].setTruckRating(truckRating);
			if (truckRating > 5) {
				System.out.println("Enter a whole number between 1 and 5");
				truckRating = input.nextInt();
			}
			// set id for each array
			foodTruckArr[i].setId(i);
			counter++;
		}
	}

	// constructor
	public FoodTruck(String truckName, String foodType, int truckRating, FoodTruck[] foodTruckArr) {
		this.foodTruckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
		this.uniqueId = nextId;
	}

	public FoodTruck() {
		// TODO Auto-generated constructor stub
	}

	public void setTruckName(String foodTruckName2) {

	}

//blueprint for ID Number generator
	public void setId(int i) {
		this.uniqueId = nextId;
		nextId++;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		uniqueId = uniqueId;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		FoodTruck.nextId = nextId;
	}

	public FoodTruck[] getFoodTruckArr() {
		return foodTruckArr;
	}

	public void setFoodTruckArr(FoodTruck[] foodTruckArr) {
		this.foodTruckArr = foodTruckArr;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
