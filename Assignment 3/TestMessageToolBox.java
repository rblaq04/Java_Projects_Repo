public class TestMessageToolBox {
     public static void main(String[] args) {
         // initialise timeNow to the current time on the system clock
         long timeNow = System.currentTimeMillis();
         String currentTime = grp04_MessageToolBox.timeOfDayFormatted(timeNow);
         System.out.println("Current Time: " + currentTime);
    }
}

