// Dónal Reynolds - 23378344
// Francis Adebowale - 23374268
// Rayan Blaq - 23367849
// Philip Roche - 23379707


public class grp4_Assignment2 {
    public static void main(String[] args) {
        long curDayNum,midMins, midSecs, curHour, curMin, curSec;
        curDayNum = (System.currentTimeMillis() / (24*60*60*1000)) % 7;
        midMins = (System.currentTimeMillis() % (24*60*60*1000) / 1000) / 60; // Minutes since midnight last night
        midSecs = (System.currentTimeMillis() % (24*60*60*1000) / 1000); // Seconds since midnight last night
        curHour = (midMins/60); // Current hour of the day
        curMin = (midMins)-(curHour*60); // Minutes since last hour
        curSec = (midSecs)-((curHour*60*60)+(curMin*60)); // Seconds since last minute
        
        // Checking for daylight savings
        double currentYear, dayOfYear;
        int leapYears, i;
        leapYears = 0;
        i = 1970;
        currentYear = ((System.currentTimeMillis() / (24*60*60*1000)) / 365) + 1970;
        while (i <= currentYear) {
            if (i % 4 == 0) {
                leapYears +=1;
            }
            i+=1;
        }
        leapYears -= 1;
        dayOfYear = (int) ((System.currentTimeMillis() / (24*60*60*1000)) % 365);
        dayOfYear -= leapYears;
        if (dayOfYear < 84 && dayOfYear > 303) {curHour += 1;} // Adding hour if daylight savings is in effect
        
        String msg, poster, msgDayName, dayNameDisplay, msgPart1 , msgPart2, curUser; // Defining variables for future usage
        int msgDayNum, trailSpaceCount;
        Boolean overSevenDays;
        overSevenDays = false; // This boolean can be toggled if the msg was from over 7 days ago
        msgDayName = "Tuesday";
        // Assigning numbers to the days of the week for use in day name display
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
            if (curDayNum == msgDayNum) {
                dayNameDisplay = "";
            }
            else if ((curDayNum - msgDayNum) == 1) {
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
        
        msg = "This is a message that no one will have any issues with";
        
        msgPart1 = msg.substring(0, (msg.length()/2)); // Splits up message into 2 parts
        msgPart2 = msg.substring(msg.length()/2);
        msg = ""; //Making the message empty so the modified one can be added
        poster = "rayan"; // Poster can be set to anyone for testing purposes
        curUser = "" + System.getProperty("user.name");
        System.out.println(curUser);
        if (poster == curUser) {
            for (i = 0; i < msgPart1.length(); i++) {
                char character = msgPart1.charAt(i);
                msg += Character.toUpperCase(character);
            }
            for (i = 0; i < msgPart2.length(); i++) {
                char character = msgPart2.charAt(i);
                msg += Character.toLowerCase(character);
            }
        }
        else {
            for (i = 0; i < msgPart1.length(); i++) {
                char character = msgPart1.charAt(i);
                msg += Character.toLowerCase(character);
            }
            for (i = 0; i < msgPart2.length(); i++) {
                char character = msgPart2.charAt(i);
                msg += Character.toUpperCase(character);
            }
        }
        
        System.out.println("Posted by: " + poster);
        System.out.println(dayNameDisplay);
        if (msg.length() < 40) {
            // Right-align the message
            System.out.printf("%40s%n", msg);
        } else {
            // Left-align the message
            System.out.println(msg);
        }
        System.out.printf("Posted at: %02d:%02d:%02d%n%n", (curHour), curMin, curSec); // Time output with formatting to add zero if needed
    // Day Name Display testing
    // when testing the post for today there was no day output, only the time it was posted at

    // when testing the post for yesterday the word "Yesterday" was printed centered in a 40-character width.
        
    // when testing the post for within the last 7 days the specific day was printed and it was centered in a 40-character width.  
        
    // when testing the post over 7 days ago the text "Some time ago..." was printed and centered in a 40-character width.
        Message Alignment test
        // when the amount of characters in a text was over 40 it is displayed left-aligned
        
        // when the amount of characters in a text was less than 40 it is displayed right-aligned in a 40-character wide portion of the display line
        
        // we tested this by using different texts some being more than 40 characters and some less than

    }
}
