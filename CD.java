package csce247.assignments.adapter;
import java.util.ArrayList;
/**
 * cd class
 * @author miller
 * contains methods to navigate compact disk
 */
public class CD implements DigitalAlbum{
	ArrayList<String> songs = new ArrayList<String>();
	int currentIndex = 0;
	//constructor
	public CD(String song1, String song2, String song3, String song4, String song5) {
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}
	
	@Override
	public String playFromBeginning() {
		currentIndex++;
		return "Playing song 1: " + songs.get(currentIndex-1);
	}

	@Override
	public String playSong(int num) {
		if (num < 1 || num > 5) {
			return "Not a valid song number";
		}
		currentIndex++;
		return "Playing " + num + ": " + songs.get(num-1);
	}

	@Override
	public String prevSong() {
		if (currentIndex < 0) {
			return "Skipping back and playing 1: " + songs.get(currentIndex);
		}
		currentIndex--;
		return "Skipping back and playing " + String.valueOf(currentIndex) + ": " + songs.get(currentIndex-1);
	}

	@Override
	public String nextSong() {
		if (currentIndex > 4) {
			currentIndex = 0;
			return "Playing 1: " + songs.get(currentIndex);
		}
		currentIndex++;
		return "Playing " + String.valueOf(currentIndex) + ": " + songs.get(currentIndex-1);
	}

	@Override
	public String stop() {
		currentIndex = 0;
		return "Stopping CD and ejecting";
	}

	@Override
	public String pause() {
		return "Pausing...";
	}
}
