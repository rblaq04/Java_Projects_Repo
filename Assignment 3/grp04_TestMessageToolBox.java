public class Testgrp04_MessageToolBox {
 public static void main(String[] args) {
 // initialise timeNow to the current time on the system clock
 long timeNow = System.currentTimeMillis();
 // Display the formatted time
 System.out.println("Posted at " + grp04_MessageToolBox.timeOfDayFormatted(timeNow));
 // ^^^^^^^^^^^^^^ NOTE: Class

 String currentTime = grp04_MessageToolBox.dayName(timeNow);
 // ^^^^^^^^^^^^^^ NOTE: Class name included.
 String COPon = "#COP27 Unite Behind The Science @ThePlanet";
 System.out.println(grp04_MessageToolBox.centre(COPon,55));
 // ^^^^^^^^^^^^^^ NOTE: Class name included.
 System.out.println(grp04_MessageToolBox.centre("",55));
 // ^^^^^^^^^^^^^^ NOTE: Class name included.
 System.out.println(grp04_MessageToolBox.centre("World Cup 2022",-22));
 // ^^^^^^^^^^^^^^ NOTE: Class name included.
 final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
 int i = 0;
 for(i = 1; i < 10; i++) {
 // set the value of postTime to the system time
 // adjusted by ‘i' days earlier
 long adjustment = i * MILLISECONDS_IN_A_DAY ;
 long postTime = System.currentTimeMillis() - adjustment;
 int postAge = grp04_MessageToolBox.ageOfPost(postTime);
 // ^^^^^^^^^^^^^^ NOTE: Class name included.
 System.out.printf("Age of post is %2d\n",postAge);
 }
 grp04_MessageToolBox.display("Edsger Dijkstra", 4);
 //^^^^^^^^^^^^ NOTE: Class name included.
 String aMessage = "Bono saves but not in Ireland";
 
 }
}
