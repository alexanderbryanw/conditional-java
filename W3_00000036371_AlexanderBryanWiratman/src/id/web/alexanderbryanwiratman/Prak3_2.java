package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Prak3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan tahun	: ");
		int tahun = scan.nextInt();
		if (tahun % 4 == 0 || tahun % 100 == 0 && tahun % 400 == 0) {
			System.out.print("Tahun ini tahun kabisat.\n");
			if (tahun % 15 == 0 && tahun % 55 == 0) {
				System.out.print("Rayakan festival Huluculu!\n");
				System.out.print("Rayakan festival Bulukulu!");
			} else if (tahun % 55 == 0) {
				System.out.print("Rayakan festival Bulukulu!");
			} else if (tahun % 15 == 0)
				System.out.print("Rayakan festival Huluculu!");
		} else {
			System.out.print("Hanya tahun biasa.");
		}
	}

}
