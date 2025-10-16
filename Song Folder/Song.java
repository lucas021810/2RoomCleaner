public class Song {

  private String artist;
  private String title;
  private String genre;
  private String topic;

  private int year;
  private int length;

  private double danceability;
  private double obscene;
  private double loudness;
  private double shakeability;

  public Song(String artist, String title, int year, String genre, int length, double shakeability,
   double obscene, double danceability, double loudness, String topic)
  {
    this.artist = artist;
    this.title = title;
    this.year = year;
    this.genre = genre;
    this.length = length;
    this.shakeability = shakeability;
    this.obscene = obscene;
    this.danceability = danceability;
    this.loudness = loudness;
    this.topic = topic;
  }

  public String getArtist()
  {
    return artist;
  }

  public String getTitle()
  {
    return title;
  }

  public int getYear()
  {
    return year;
  }

  public String getGenre()
  {
    return genre;
  }

  public int getLength()
  {
    return length;
  }

  public double getShakeability()
  {
    return shakeability;
  }

  public double getObscene()
  {
    return obscene;
  }
  
  public double getDanceability()
  {
    return danceability;
  }

  public double getLoudness()
  {
    return loudness;
  }

  public String getTopic()
  {
    return topic;
  }


}
