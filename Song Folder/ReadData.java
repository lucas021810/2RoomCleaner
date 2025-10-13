import java.util.Scanner;
import java.io.File;

import java.io.IOException;

public class ReadData
{
  
  public static void read(){
    int count = 0;
    Scanner songreader;
    try{
    songreader = new Scanner(new File("songs 2025-2026 ANSI.csv"));

    while(songreader.hasNext())
    System.out.println(count + "" + songreader.split(","));
    count++;
    {
      System.out.println(songreader.nextLine());
    } 
    songreader.close();


    }
    catch(Exception e)
    {
    System.out.println (e);
    } 
   
  }
}