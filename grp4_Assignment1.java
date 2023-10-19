// Dónal Reynolds - 23378344
// Francis Adebowale - 23374268
// Rayan Blaq - 23367849



public class grp4_Assignment1 {
    public static void main(String[] args) {
        long midMins = (System.currentTimeMillis() % (24*60*60*1000) / 1000) / 60; // Minutes since midnight last night
        long midSecs = (System.currentTimeMillis() % (24*60*60*1000) / 1000); // Seconds since midnight last night
        long curHour = (midMins/60); // Current hour of the day
        long curMin = (midMins)-(curHour*60); // Minutes since last hour
        long curSec = (midSecs)-((curHour*60*60)+(curMin*60)); // Seconds since last minute
        
        String msg, poster; // Defining variables for the content of the message and the poster
        poster = System.getProperty("user.name");
        msg = "Cats are banned from this WhatsApp group";
        
        System.out.println("Posted by: " + poster);
        System.out.println(msg);
        System.out.printf("Posted at: %02d:%02d:%02d%n%n", (curHour+1), curMin, curSec); // Time output with formatting to add zero if needed
    }
}
/*
When we changed the value of the "msg" variable we got the same results as seen below
Posted by: francis
Hey there!  Just wanted to let you know that we're meeting up at the park tomorrow at 3 PM.
Don't forget to bring your soccer ball! It's going to be a fun game. See you then!
Posted at: 19:31:46
*/

/* 
We also tested the output at different times on different machines to demonstrate the results remain valid
Posted by: rayan
Cats are banned from this WhatsApp group
Posted at: 22:13:00
*/
