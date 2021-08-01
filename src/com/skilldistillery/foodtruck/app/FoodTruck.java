package com.skilldistillery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

public class FoodTruck {
	private String foodTruckName;
	private String foodType;
	private int truckRating;
	private int uniqueId = 0;
	private static int nextId = 1;
	private int counter;

	private FoodTruck foodTruckArr[] = new FoodTruck[5];

// input method for truck input
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

	// menu method
	public void menu(Scanner input) {
		boolean goWhileTrue = true;

		do {
			System.out.println("Press 1 to list existing food trucks");
			System.out.println("Press 2 to see the average ratings of " + "the food trucks");
			System.out.println("Press 3 to display the highest rated food truck");
			System.out.println("Press 4 to quit the program");
			String menuChoice = input.next();

			switch (menuChoice) {

			case "1":
				for (int i = 0; i < foodTruckArr.length; i++) {
					if (foodTruckArr[i] == null) {
						continue;
					} else
						System.out.println(foodTruckArr[i].toString());
				}
				break;
			case "2":
				int product = 0;

				for (int i = 0; i < counter; i++) {
					if (i < counter) {
						product = product + foodTruckArr[i].truckRating;
					}
				}
				double average;
				average = (product / counter);
				System.out.println("Average rating is: " + average);

				break;
			case "3":
				break;

			case "4":
				goWhileTrue = false;
				System.out.println("Come again, soon!");
				break;

			}

		} while (goWhileTrue);

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

// need to fix to show food truck names, currently showing null
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

	@Override
	public String toString() {
		return "FoodTruck [foodTruckName=" + foodTruckName + ", foodType=" + foodType + ", truckRating=" + truckRating
				+ ", uniqueId=" + uniqueId + ", counter=" + counter + ", foodTruckArr=" + Arrays.toString(foodTruckArr)
				+ "]";
	}

}
