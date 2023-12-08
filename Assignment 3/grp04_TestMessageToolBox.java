public class Testgrp04_MessageToolBox {
 public static void main(String[] args) {
     long timeNow = System.currentTimeMillis();
     
     System.out.println("Posted at " + grp04_MessageToolBox.timeOfDayFormatted(timeNow));
     // The timeOfDayFormatted method displays the formatted time
     
     for(int i = 0; i < 7; i++) {
         long dayOffset = i * (24*60*60*1000);
         String currentTime = grp04_MessageToolBox.dayName(timeNow + dayOffset);
         System.out.println("Day name = " + currentTime);
     }
     // When  the input for dayOffset changes we get different days.
     
     String best = "this is the greatest string of all time";
     System.out.println(grp04_MessageToolBox.centre(best,95));
     System.out.println(grp04_MessageToolBox.centre(best,10));
     System.out.println(grp04_MessageToolBox.centre("",95));
     System.out.println(grp04_MessageToolBox.centre("World Cup 2022",-22));
     // When the input for the centre method is changed, the center of the message changes.
     
     final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
     for(int i = 1; i < 10; i++) {
         // set the value of postTime to the system time
         // adjusted by ‘i' days earlier
         long adjustment = i * MILLISECONDS_IN_A_DAY ;
         long postTime = System.currentTimeMillis() - adjustment;
         int postAge = grp04_MessageToolBox.ageOfPost(postTime);
         // This iterates through different time adjustments to test each case. 
         System.out.printf("Age of post is %2d\n",postAge);
     }
     grp04_MessageToolBox.display("This message is being split up into multiple lines", 4);
     // Any message inputted in the display method gets split into the given width
 
 
 }
}
