import java.util.Scanner;
import java.io.File;

import java.io.IOException;

public class ReadData
{
  
  public static void read(){
    int count = 1;
    Scanner songreader;
    Song [] songs = new Song[28372];
    try{
    songreader = new Scanner(new File("songs 2025-2026 ANSI.csv"));

    while(songreader.hasNext()){
    String line = songreader.nextLine();
    String artist = line.split(";")[0];
    String title = line.split(";")[1];
    int year = Integer.parseInt(line.split(";")[2]);
    String genre = line.split(";")[3];
    int length = Integer.parseInt(line.split(";")[4]);
    double shakeability = Double.parseDouble(line.split(";")[5]);
    double obscene = Double.parseDouble(line.split(";")[6]);
    double danceability = Double.parseDouble(line.split(";")[7]);
    Double loudness = Double.parseDouble(line.split(";")[8]);
    String topic = line.split(";")[9];

    songs[count] = new Song(artist, title, year, genre, length, shakeability, obscene, danceability, loudness, topic);

    System.out.println(count + " " + line.split(";")[2]);
    count++;
    } 
    songreader.close();


    }
    catch(Exception e)
    {
    System.out.println (e);
    } 
   
  }
}