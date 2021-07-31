package com.skilldistillery.foodtruck.app;

import java.util.Random;
import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		String truckName;
		int uniqueId;
		int rating;
		String foodType;
		final int MAX = 99;

		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		uniqueId = rand.nextInt(MAX);

		System.out.println("Enter the name of the food truck");
		truckName = keyboard.nextLine();

		System.out.println("Enter food type");
		foodType = keyboard.nextLine();

		System.out.println("Enter your rating using numbers 1 through 5");
		rating = keyboard.nextInt();

		FoodTruck foodTruck1 = new FoodTruck(truckName, uniqueId, foodType, rating);
		System.out.println(foodTruck1.toString());

	}

}
