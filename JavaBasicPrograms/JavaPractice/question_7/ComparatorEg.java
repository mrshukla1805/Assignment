

//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

//A class 'Movie2' that implements Comparable
class Movie2 implements Comparable<Movie2>
{
  private double rating;
  private String name;
  private int year;

  // Used to sort movies by year
  public int compareTo(Movie2 m)
  {
      return this.year - m.year;
  }

  // Constructor
  public Movie2(String nm, double rt, int yr)
  {
      this.name = nm;
      this.rating = rt;
      this.year = yr;
  }

  // Getter methods for accessing private data
  public double getRating() { return rating; }
  public String getName()   {  return name; }
  public int getYear()      {  return year;  }
}

//Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie2>
{
  public int compare(Movie2 m1, Movie2 m2)
  {
      if (m1.getRating() < m2.getRating()) return -1;
      if (m1.getRating() > m2.getRating()) return 1;
      else return 0;
  }
}

//Class to compare Movies by name
class NameCompare implements Comparator<Movie2>
{
  public int compare(Movie2 m1, Movie2 m2)
  {
      return m1.getName().compareTo(m2.getName());
  }
}

//Driver class
public class ComparatorEg
{
  public static void main(String[] args)
  {
      ArrayList<Movie2> list = new ArrayList<Movie2>();
      list.add(new Movie2("Movie1", 8.3, 2015));
      list.add(new Movie2("Movie2", 8.7, 1977));
      list.add(new Movie2("Movie3", 8.8, 1980));
      list.add(new Movie2("Movie4", 8.4, 1983));

      System.out.println("Sorted by rating");
      RatingCompare ratingCompare = new RatingCompare();
      Collections.sort(list, ratingCompare);
      for (Movie2 Movie2: list)
          System.out.println(Movie2.getRating() + " " +
                             Movie2.getName() + " " +
                             Movie2.getYear());


  
      System.out.println("\nSorted by name");
      NameCompare nameCompare = new NameCompare();
      Collections.sort(list, nameCompare);
      for (Movie2 Movie2: list)
          System.out.println(Movie2.getName() + " " +
                             Movie2.getRating() + " " +
                             Movie2.getYear());

      // Uses Comparable to sort by year
      System.out.println("\nSorted by year");
      Collections.sort(list);
      for (Movie2 Movie2: list)
          System.out.println(Movie2.getYear() + " " +
                             Movie2.getRating() + " " +
                             Movie2.getName()+" ");
  }
} 