import java.io.*;
import java.util.*;

public class Time {

public static void main(String[] args){
  int hour = 23;
  int minute = 23;
  int second = 03;
  System.out.print("Number of seconds since midnight: ");
  System.out.println(hour * 60 * 60 + minute * 60 + second);
  System.out.print("Number of seconds left until midnight: ");
  System.out.println(24 * 60 * 60 + 60 * 60 + 60 - hour * 60 * 60 + minute * 60 + second);
  }
}