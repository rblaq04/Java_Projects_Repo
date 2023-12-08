public class grp04_MessageToolBox {
    
    // METHOD 1
    public static String timeOfDayFormatted(long timeInMillis) {
        long curDayNum,midMins, midSecs, curHour, curMin, curSec;
        midMins = (timeInMillis % (24*60*60*1000) / 1000) / 60; // Minutes since midnight last night
        midSecs = (timeInMillis % (24*60*60*1000) / 1000); // Seconds since midnight last night
        curHour = (midMins/60); // Current hour of the day
        curMin = (midMins)-(curHour*60); // Minutes since last hour
        curSec = (midSecs)-((curHour*60*60)+(curMin*60)); // Seconds since last minute
        double currentYear, dayOfYear;
        int leapYears, i;
        leapYears = 0;
        i = 1970;
        currentYear = ((timeInMillis / (24*60*60*1000)) / 365) + 1970;
        while (i <= currentYear) {
            if (i % 4 == 0) {
                leapYears +=1;
            }
            i+=1;
        }
        leapYears -= 1;
        dayOfYear = (int) ((timeInMillis / (24*60*60*1000)) % 365);
        dayOfYear -= leapYears;
        if (dayOfYear < 84 && dayOfYear > 303) {curHour += 1;} // Adding hour if daylight savings is in effect
        String curTime = String.format("%02d:%02d:%02d%n%n", curHour, curMin, curSec); // Formatting time to add zero if needed
        return curTime;
    }
    
    //METHOD 2
    public static String dayName(long timeInMillis) {
        long dayOfWeek = (timeInMillis / (24*60*60*1000)) % 7;
        String nameOfDay;
        if (dayOfWeek == 0) {nameOfDay = "Thursday";}
        else if (dayOfWeek == 1) {nameOfDay = "Friday";}
        else if (dayOfWeek == 2) {nameOfDay = "Saturday";}
        else if (dayOfWeek == 3) {nameOfDay = "Sunday";}
        else if (dayOfWeek == 4) {nameOfDay = "Monday";}
        else if (dayOfWeek == 5) {nameOfDay = "Tuesday";}
        else {nameOfDay = "Wednesday";}
        return nameOfDay;
    }
    
    // METHOD 3
    public static int ageOfPost(long timeInMillis) {
        // Calculate the time difference between the current time and the post time
        long timeDifference = System.currentTimeMillis() - timeInMillis;
        
        // Constants for milliseconds in a day
        long MILLIS_ONE_DAY = 24 * 60 * 60 * 1000;
        
        // Calculate the days difference
        int daysDifference = (int) timeDifference / (int) MILLIS_ONE_DAY;
        
        return daysDifference;
    }
    
    // METHOD 4
    public static String centre(String messageText, int width) {
        String msg = "";
        if (width <= 0 || width < messageText.length()) {
            msg = "";
        }
        else if (messageText == "") {
            // Producing spaces equal to a given width if message is empty
            for(int i=0; i<width; i++) {
                msg += "-";
            }
        }
        else {
            // Centering the message in a given width
            int spaces = (width - messageText.length())/2; 
            for(int i=0; i<spaces; i++) {
                msg += " ";
            }
            msg += messageText;
            for(int i=0; i<spaces; i++) {
                msg += " ";
            }
        }
        
        return msg;
    }
    
    // METHOD 5
    public static void display(String messageText, int width) {
        int textLength = messageText.length();
        int required = 0;
        if (textLength < 10) {
            width = 10;
            System.out.println(messageText);
        }
        else if (textLength > 80) {
            width = 80;
            required = textLength / width;
            if (textLength % width != 0) {
                required++;
            }
            for (int i = 0; i < required; i++) {
                int startPos = i*width;
                int endPos = (i+1)*width;
                if (endPos > textLength) {endPos = textLength;}
                System.out.println(messageText.substring(startPos, endPos));
            }
        }
        else {
            required = textLength / width;
            if (textLength % width != 0) {
                required++;
            }
            for (int i = 0; i < required; i++) {
                int startPos = i*width;
                int endPos = (i+1)*width;
                if (endPos > textLength) {endPos = textLength;}
                System.out.println(messageText.substring(startPos, endPos));
            }
        }
    }
    
}
