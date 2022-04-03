package id.web.alexanderbryanwiratman;

import java.util.Scanner;

public class Prak3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nama Anda					= ");
		String nama = scan.nextLine();
		System.out.print("Jenis Kelamin (Pria/Wanita)		= ");
		String jeniskelamin = scan.next();
		System.out.print("Berat Badan (kg)				= ");
		int berat = scan.nextInt();
		System.out.print("Tinggi Badan (cm)				= ");
		float tinggi = scan.nextInt();
		tinggi /= 100;
		String gender = null;
		if (jeniskelamin.toLowerCase().equals("pria")) {
			gender = "Tuan";
		} else if (jeniskelamin.toLowerCase().equals("wanita")) {
			gender = "Nona";
		}
		float bmi = (float) (berat / (tinggi * tinggi));
		String kategori = null;
		if (bmi < 18) {
			kategori = "Kurus";
		} else if (bmi >= 18 && bmi <= 25) {
			kategori = "Normal";
		} else if (bmi > 25 && bmi <= 27) {
			kategori = "Kegemukan";
		} else if (bmi > 27) {
			kategori = "Obesitas";
		}
		System.out.printf("%s %s, Anda tergolong %s.", gender, nama, kategori);
	}

}
