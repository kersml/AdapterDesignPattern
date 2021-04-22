package csce247.assignments.adapter;
/**
 * digital album interface
 * @author miller
 */
public interface DigitalAlbum {
	public String playFromBeginning();
	public String playSong(int num);
	public String prevSong();
	public String nextSong();
	public String stop();
	public String pause();
}
