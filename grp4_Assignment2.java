// Dónal Reynolds - 23378344
// Francis Adebowale - 23374268
// Rayan Blaq - 23367849
// Philip Roche - 23379707


public class grp4_Assignment2 {
    public static void main(String[] args) {
        long dayOfWeek,midMins, midSecs, curHour, curMin, curSec;
        dayOfWeek = (System.currentTimeMillis() / (24*60*60*1000)) % 7;
        midMins = (System.currentTimeMillis() % (24*60*60*1000) / 1000) / 60; // Minutes since midnight last night
        midSecs = (System.currentTimeMillis() % (24*60*60*1000) / 1000); // Seconds since midnight last night
        curHour = (midMins/60); // Current hour of the day
        curMin = (midMins)-(curHour*60); // Minutes since last hour
        curSec = (midSecs)-((curHour*60*60)+(curMin*60)); // Seconds since last minute
        
        String msg, poster, curDayName, msgDayName, dayNameDisplay, msgPart1 , msgPart2, curUser; // Defining variables for future usage
        int msgDayNum, trailSpaceCount;
        Boolean daylightSavings, overSevenDays;
        overSevenDays = false;
        msgDayName = "Tuesday";
        // Assigning numbers to the days of the week for later usage
        if (msgDayName == "Thursday") {
            msgDayNum = 0;
        }
        else if (msgDayName == "Friday") {
            msgDayNum = 1;
        }
        else if (msgDayName == "Saturday") {
            msgDayNum = 2;
        }
        else if (msgDayName == "Sunday") {
            msgDayNum = 3;
        }
        else if (msgDayName == "Monday") {
            msgDayNum = 4;
        }
        else if (msgDayName == "Tuesday") {
            msgDayNum = 5;
        }
        else {
            msgDayNum = 6;
        }
        
        // Formatting the Day Name Display
        if (overSevenDays) {
            dayNameDisplay = "                   Some time ago...";
        }
        else {
            if (dayOfWeek == msgDayNum) {
                dayNameDisplay = "";
            }
            else if ((dayOfWeek - msgDayNum) == 1) {
                dayNameDisplay = "                   Yesterday";
            }
            else {
                dayNameDisplay = "                   " + msgDayName;
            }
        }
        
        trailSpaceCount = 40 - dayNameDisplay.length();
        for (int count = trailSpaceCount; count > 0; count -= 1) {
            dayNameDisplay = dayNameDisplay + " ";
        }
        
        
        daylightSavings = false;
        poster = System.getProperty("user.name");
        msg = "This is a message that no one will have any issues with";
        
        // Series of if/else statements to output the day of the week
        if (dayOfWeek == 0) {curDayName = "Thursday";}
        else if (dayOfWeek == 1) {curDayName = "Friday";}
        else if (dayOfWeek == 2) {curDayName = "Saturday";}
        else if (dayOfWeek == 3) {curDayName = "Sunday";}
        else if (dayOfWeek == 4) {curDayName = "Monday";}
        else if (dayOfWeek == 5) {curDayName = "Tuesday";}
        else {curDayName = "Wednesday";}
        
        
        if (daylightSavings) {curHour += 1;} // Adding hour if daylight savings is in effects
        
        msgPart1 = msg.substring(0, (msg.length()/2)); // Splits up message into 2 parts
        msgPart2 = msg.substring(msg.length()/2);
        msg = ""; //Making the message empty so the modified one can be added
        poster = "rayan"; // Poster can be set to anyone for testing purposes
        curUser = System.getProperty("user.name");
        if (poster == curUser) {
            for (int i = 0; i < msgPart1.length(); i++) {
                char character = msgPart1.charAt(i);
                msg += Character.toUpperCase(character);
            }
            for (int i = 0; i < msgPart2.length(); i++) {
                char character = msgPart2.charAt(i);
                msg += Character.toLowerCase(character);
            }
        }
        else {
            for (int i = 0; i < msgPart1.length(); i++) {
                char character = msgPart1.charAt(i);
                msg += Character.toLowerCase(character);
            }
            for (int i = 0; i < msgPart2.length(); i++) {
                char character = msgPart2.charAt(i);
                msg += Character.toUpperCase(character);
            }
        }
        
        System.out.println("Posted by: " + poster);
        System.out.println(dayNameDisplay);
        if (msg.length() < 40) {
            // Right-align the message
            System.out.printf("%115s%n", msg);
        } else {
            // Left-align the message
            System.out.println(msg);
        }
        System.out.printf("Posted at: %02d:%02d:%02d%n%n", (curHour), curMin, curSec); // Time output with formatting to add zero if needed
        

    }
}
