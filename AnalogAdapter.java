package csce247.assignments.adapter;
/**
 * analog adapter class
 * @author miller
 * converts cassett actions to compact disk actions
 */
public class AnalogAdapter implements AnalogAlbum{
	DigitalAlbum album;
	//constructor
	public AnalogAdapter(DigitalAlbum Album) {
		this.album = Album;
	}
	
	@Override
	public String play() {
		return this.album.nextSong();
	}

	@Override
	public String rewind() {
		return this.album.prevSong();
	}

	@Override
	public String ffwd() {
		return this.album.nextSong();
	}

	@Override
	public String pause() {
		return this.album.pause();
	}

	@Override
	public String stopEject() {
		return this.album.stop();
	}
}
