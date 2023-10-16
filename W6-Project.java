public class WhatsappPost {
    public static void main(String[] args) {
        long midMins = (System.currentTimeMillis() % (24*60*60*1000) / 1000) / 60; // Minutes since midnight last night
        long midSecs = (System.currentTimeMillis() % (24*60*60*1000) / 1000); // Secs since midnight last night
        long curHour = (midMins/60); // Current hour of the day
        long curMin = (midMins)-(curHour*60); // Minutes since last hour
        long curSec = (midSecs)-((curHour*60*60)+(curMin*60)); // Seconds since last minute
        String curTime, curSec2, curMin2;
        // Series of if/else statements to add a zero if needed
        if ((curMin<10) && (curSec<10))  {
            curMin2 = "0" + curMin;
            curSec2 = "0" + curSec;
            curTime = ("" + (curHour+1) + ":" + curMin2 + ":" + curSec2);
        }
        else if (curSec<10) {
            curSec2 = "0" + curSec;
            curTime = ("" + (curHour+1) + ":" + curMin + ":" + curSec2);
        }
        else if (curMin<10) {
            curMin2 = "0" + curMin;
            curTime = ("" + (curHour+1) + ":" + curMin2 + ":" + curSec);
        }
        else {
            curTime = ("" + (curHour+1) + ":" + curMin + ":" + curSec);
        }
        
        String msg, poster;
        poster = System.getProperty("user.name");
        msg = "Cats are banned from this WhatsApp group \uD83D\uDEAB \uD83D\uDE3C";
        
        System.out.println("Posted by: " + poster);
        System.out.println("\n" + msg + "\n");
        System.out.println("Posted at: " + curTime);
    }
}
