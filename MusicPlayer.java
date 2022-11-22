package com.jspiders.projectsong.main;

import java.util.Scanner;

import com.jspiders.projectsong.operation.SongOperations;

public class MusicPlayer {

	static boolean loop = true;
	static SongOperations operations = new SongOperations();

	public static void main(String[] args) {
		while (loop) {
			performance();
		}
	}

	public static void performance() {
		System.out.println(
				"select option: \n" + "1.play a Song \n" + "2.add/remove Song\n" + "3.Edit Song\n" + "4.Exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:

			System.out.println("select the option:\n" + "1.choose to play\n" + "2.select all song\n"
					+ "3.play a random song\n" + "4.Back");
			int choose = scanner.nextInt();
			switch (choose) {

			case 1:
				operations.playSpeificSong();
				break;

			case 2:
				//operations.playAllSong();
				operations.show();
				break;

			case 3:
				operations.playRandomSong();
				break;

			case 4:
				return;
				
			default:
				System.out.println("Invalid choice");
				break;

			}

			break;

		case 2:

			System.out.println(
					"choose the option for add or remove the song\n" + "1.Add song\n" + "2.Remove song\n" + "3.Back");
			int choose1 = scanner.nextInt();
			switch (choose1) {
			case 1:
				operations.addSong();
				break;

			case 2:
				operations.removeSong();
				break;

			case 3:
				return;

			default:
				break;
			}

			break;

		case 3:
			operations.editSong();
			break;

		case 4:
			System.out.println("Thank You :)");
			loop = false;
			break;

		default:
			System.out.println("Invalid choice");
			break;
		}
	}

}
