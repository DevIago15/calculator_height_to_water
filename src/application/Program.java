package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Entities entitie = new Entities(0);
		
		// enter data
		System.out.print("Welcome to Converter K2W!\n");
		System.out.print("Write your height: ");
		entitie.height = sc.nextDouble();
		
		// do converter
		double water = 35.0;
		water = water * entitie.height;
		
		double bottleWater = 500.0;
		bottleWater = bottleWater / entitie.height;
		
		double cupWater = 310.0;
		cupWater = cupWater / entitie.height;
		
		
		// out data
		System.out.printf("\nWith %.2f kilogram you have to drink %.1f liters of water a day. I.e %.2f 310ml water cup glasses or %.2f 500ml water bottles. ", entitie.height, water, cupWater, bottleWater);
		
		
	sc.close();
	}

}
