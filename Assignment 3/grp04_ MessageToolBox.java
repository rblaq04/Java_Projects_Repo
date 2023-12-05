public class grp04_MessageToolBox {
    
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
        String curTime = String.format("%02d:%02d:%02d%n%n", curHour, curMin, curSec);
        return curTime;
    }
    
    
}
