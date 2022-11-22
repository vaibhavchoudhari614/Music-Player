package com.jspiders.projectsong.operation;

import java.util.ArrayList;
import java.util.Scanner;
import com.jspiders.projectsong.song.Song;

public class SongOperations {
	Scanner scanner = new Scanner(System.in);
	Song song = new Song();
	ArrayList<Song> playlist = new ArrayList<Song>();
	static int cnt = 0;

	public void addSong() {
		System.out.println("How many song you want to be add");
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {

			playlist.add(new Song());

			System.out.println("Enter id of song:");
			int id = scanner.nextInt();
			playlist.get(cnt).setId(id);

			System.out.println("Enter the Song name:");
			String name = scanner.next();
			playlist.get(cnt).setName(name);

			System.out.println("Enter the movie name:");
			String movie = scanner.next();
			playlist.get(cnt).setMovie(movie);

			System.out.println("Enter the length of song:");
			double len = scanner.nextDouble();
			playlist.get(cnt).setLength(len);

			System.out.println("Enter the name of singer:");
			String sname = scanner.next();
			playlist.get(cnt).setSinger(sname);

			System.out.println("Enter the name of composer:");
			String cname = scanner.next();
			playlist.get(cnt).setComposer(cname);

			System.out.println("Enter the name of lyricist");
			String lname = scanner.next();
			playlist.get(cnt).setLyricist(lname);

			System.out.println(playlist.size() + " song successfully added ");
			cnt++;
		}
	}

	public void viewAllSong() {
		if (playlist.isEmpty()) {
			System.out.println("There is no song present in playlist.please add the song");
			addSong();
		} else {
			int i = 1;
			for (Song var : playlist) {
				System.out.println(i + ":" + var.getName());
				i++;
			}
		}
	}

	public void show() {
		for (int i = 0; i < playlist.size(); i++) {
			System.out.println(playlist.get(i));
		}
	}

	public void removeSong() {
		if (playlist.isEmpty()) {
			System.out.println("There is no song present in playlist.please add the song");
			addSong();
		}
		System.out.println("Please select a song for remove");
		viewAllSong();
		int remove = scanner.nextInt();
		System.out.println(playlist.get(remove - 1).getName() + " remove song successfully.");
		playlist.remove(remove - 1);
		System.out.println("Remaing song:");
		viewAllSong();
	}

	public void playAllSong() {

		if (playlist.isEmpty()) {
			System.out.println("There is no song present in playlist.please add the song");
			addSong();
		}
		for (Song var1 : playlist) {
			System.out.println(var1.getName() + " Now playing this song.");
		}
	}

	public void playRandomSong() {
		if (playlist.isEmpty()) {
			System.out.println("There is no song present in playlist.please add the song");
			addSong();
		}
		double random = Math.random();
		int random1 = (int) (random * 10) + 1;

		if (random1 > playlist.size()) {
			random1 = 1;
		}
		System.out.println(playlist.get(random1).getName() + " now playing this song...");
	}

	public void playSpeificSong() {
		if (playlist.isEmpty()) {
			System.out.println("There is no song present in playlist.please add the song");
			addSong();
		}
		System.out.println("Select song to play.");
		viewAllSong();
		int play = scanner.nextInt();
		System.out.println(playlist.get(play - 1).getName() + " now playing this song..!!");
	}

	public void editSong() {
		if (playlist.isEmpty()) {
			System.out.println("There is no song present in playlist.please add the song");
			addSong();
		}
		System.out.println("Select song to edit");
		viewAllSong();
		int edit = scanner.nextInt();
		playlist.remove(edit - 1);

		System.out.println("Enter id of song:");
		int id = scanner.nextInt();
		song.setId(id);

		System.out.println("Enter the Song name:");
		String name = scanner.next();
		song.setName(name);

		System.out.println("Enter the movie name:");
		String movie = scanner.next();
		song.setMovie(movie);

		System.out.println("Enter the length of song:");
		double len = scanner.nextDouble();
		song.setLength(len);

		System.out.println("Enter the name of singer:");
		String sname = scanner.next();
		song.setSinger(sname);

		System.out.println("Enter the name of composer:");
		String cname = scanner.next();
		song.setComposer(cname);

		System.out.println("Enter the name of lyricist");
		String lname = scanner.next();
		song.setLyricist(lname);

		playlist.add(edit - 1, song);
		System.out.println(playlist.get(edit - 1).getName() + " Song edit Successfully");
		viewAllSong();
	}
}
