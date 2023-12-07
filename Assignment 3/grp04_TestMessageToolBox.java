public class Testgrp04_MessageToolBox {
 public static void main(String[] args) {
 // initialise timeNow to the current time on the system clock
 long timeNow = System.currentTimeMillis();
 // Display the formatted time
 System.out.println("Posted at " + grp04_MessageToolBox.timeOfDayFormatted(timeNow));
 long dayOffset = 6 * (24*60*60*1000);
 String currentTime = grp04_MessageToolBox.dayName(timeNow + dayOffset);
 System.out.println("Day name =" + currentTime);
 // When  the input for dayOffset changes we get different days.
 String COPon = "#COP27 Unite Behind The Science @ThePlanet";
 System.out.println(grp04_MessageToolBox.centre(COPon,95));
 System.out.println(grp04_MessageToolBox.centre("",95));
 System.out.println(grp04_MessageToolBox.centre("World Cup 2022",-22));
 // When the input for MessageToolBox.centre is changed the center of the message changes.
 final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
 int i = 0;
 for(i = 1; i < 10; i++) {
 // set the value of postTime to the system time
 // adjusted by ‘i' days earlier
 long adjustment = i * MILLISECONDS_IN_A_DAY ;
 long postTime = System.currentTimeMillis() - adjustment;
 int postAge = grp04_MessageToolBox.ageOfPost(postTime);
 // This iterates through different time adjustments to test each case. 
 System.out.printf("Age of post is %2d\n",postAge);
 }
 grp04_MessageToolBox.display("Donal Reynolds", 4);
 
 
 }
}
