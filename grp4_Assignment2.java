// Dónal Reynolds - 23378344
// Francis Adebowale - 23374268
// Rayan Blaq - 23367849
// Philip Roche - 23379707


public class grp4_Assignment1 {
    public static void main(String[] args) {
        long dayOfWeek, midMins, midSecs, curHour, curMin, curSec;
        dayOfWeek = (System.currentTimeMillis() / (24*60*60*1000)) % 7;
        midMins = (System.currentTimeMillis() % (24*60*60*1000) / 1000) / 60; // Minutes since midnight last night
        midSecs = (System.currentTimeMillis() % (24*60*60*1000) / 1000); // Seconds since midnight last night
        curHour = (midMins/60); // Current hour of the day
        curMin = (midMins)-(curHour*60); // Minutes since last hour
        curSec = (midSecs)-((curHour*60*60)+(curMin*60)); // Seconds since last minute
        
        String msg, poster, dayOfWeek; // Defining variables for the content of the message and the poster
        Boolean daylightSavings;
        poster = System.getProperty("user.name");
        msg = "Cats are banned from this WhatsApp group";
        
        System.out.println("Posted by: " + poster);
        System.out.println(msg);
        System.out.printf("Posted at: %02d:%02d:%02d%n%n", (curHour+1), curMin, curSec); // Time output with formatting to add zero if needed

        // Series of if/else statements to output the day of the week
        if (dayOfWeek == 0) {out.println("It's Thursday");}
        else if (dayOfWeek == 1) {out.println("It's Friday");}
        else if (dayOfWeek == 2) {out.println("It's Saturday");}
        else if (dayOfWeek == 3) {out.println("It's Sunday");}
        else if (dayOfWeek == 4) {out.println("It's Monday");}
        else if (dayOfWeek == 5) {out.println("It's Tuesday");}
        else {out.println("Unless I've made a terrible oversight, it's Wednesday");} // I would never make an oversight so this statement is irrelevant
    }
}
