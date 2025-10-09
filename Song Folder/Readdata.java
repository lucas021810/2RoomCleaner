import java.util.Scanner;
import java.io.File;

import java.io.IOException;

public class Readdata
{
  public void read(){
    Scanner songreader;
    try{
    songreader = new Scanner(new File("songs 2025-2026.csv"));

    while(songreader.hasNext()){
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