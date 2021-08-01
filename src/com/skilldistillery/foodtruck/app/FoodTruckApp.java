package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		FoodTruck foodTruck = new FoodTruck();
		foodTruck.truckInput(input);
		foodTruck.menu(input);
	}

}
