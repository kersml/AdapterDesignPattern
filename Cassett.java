package csce247.assignments.adapter;
import java.util.ArrayList;
/**
 * cassett class
 * @author miller
 * contains methods to navigate cassett tape
 */
public class Cassett implements AnalogAlbum{
	ArrayList<String> songs = new ArrayList<String>();
	int currentIndex = 0;
	//constructor
	public Cassett(String song1, String song2, String song3, String song4, String song5) {
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		songs.add(song5);
	}
	
	@Override
	public String play() {
		String songNumber = String.valueOf(currentIndex + 1);
		if(currentIndex > 4) {
			return "At the end of the cassett you need to rewind";
		}
		currentIndex++;
		return "Playing song " + songNumber + ": " + songs.get(currentIndex-1);
	}

	@Override
	public String rewind() {
		if (currentIndex == 0){
			return "Fully Re-Wound";
		}
		else{
			currentIndex--;
			return "Rewinding to song " + String.valueOf(currentIndex + 1);
		}
	}

	@Override
	public String ffwd() {
		if (currentIndex == 4){
			return "At the end of the cassett you need to rewind";
		}
		currentIndex++;
		if(currentIndex == 4) {
			return "Forwarded to the end of the cassett";
		}
		else{
			return "Forwarded to song " + String.valueOf(currentIndex + 1);
		}
	}

	@Override
	public String pause() {
		return "Pausing...";
	}

	@Override
	public String stopEject() {
		return "Stopping cassett and ejecting";
	}
}
