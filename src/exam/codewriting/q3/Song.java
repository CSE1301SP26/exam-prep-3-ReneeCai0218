package exam.codewriting.q3;

/*
 * We wish to create a Song class. A song has-a(n):
	name
	artist
	duration (in seconds)
 */
public class Song {
	private String name;
	private String artist;
	private int duration;

	public Song(String name, String artist, int duration){
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}
	
	public String getName () {
		return name;
	}
	
	public String toString () {
		return name + " " + artist + " " + duration;
	}
	
	/**
	* When two songs are mashed up, a new Song should be created and returned.
	* The name and artist of the new song should contain both names and both
	* artists from the original songs, and the duration should be the average
	* of the durations of the original songs.
	*/
	public Song mashUp ( Song other ) {
		String newName = this.name+"-"+other.name;
		String newArtist = this.artist+"-"+other.artist;
		int newDuration = (this.duration+other.duration)/2;
		Song newSong = new Song(newName, newArtist, newDuration);
		return newSong;
	}
}
