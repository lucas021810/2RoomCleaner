import java.util.Scanner;
import java.io.File;

import java.io.IOException;

public class ReadData
{
  
  public static void read(){
    int count = 1;
    Scanner songreader;
    try{
    songreader = new Scanner(new File("songs 2025-2026 ANSI.csv"));

    while(songreader.hasNext()){
    String line = songreader.nextLine();
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