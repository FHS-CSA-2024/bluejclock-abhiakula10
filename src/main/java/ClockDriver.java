package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3,45);
        String test2Output = test2.getTime();
        System.out.println(" 2 arg. Con. test " + test2Output);
        
        
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        System.out.println("Your time before tick is: " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println(" Your time after tick is: " + tickTest1.getTime());
        
        ClockDisplay tickTest2 = new ClockDisplay(3,9);
        System.out.println("Your time before tick is: " + tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println(" Your time after tick is: " + tickTest2.getTime());
        
        ClockDisplay tickTest3 = new ClockDisplay(1,59);
        System.out.println("Your time before tick is: " + tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println(" Your time after tick is: " + tickTest3.getTime());
        
        ClockDisplay tickTest4 = new ClockDisplay(9,59);
        System.out.println("Your time before tick is: " + tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println(" Your time after tick is: " + tickTest4.getTime());
        
        ClockDisplay tickTest5 = new ClockDisplay(23,59);
        System.out.println("Your time before tick is: " + tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println(" Your time after tick is: " + tickTest5.getTime());
        
                
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds tickTest1Sec = new ClockDisplaySeconds(3,32,59);
        System.out.println("Your time before tick is: " + tickTest1Sec.getTime());
        tickTest1Sec.timeTick();
        System.out.println(" Your time after tick is: " + tickTest1Sec.getTime());
        
        ClockDisplaySeconds tickTest2Sec = new ClockDisplaySeconds(1,0,59);
        System.out.println("Your time before tick is: " + tickTest2Sec.getTime());
        tickTest2Sec.timeTick();
        System.out.println(" Your time after tick is: " + tickTest2Sec.getTime());
        
        ClockDisplaySeconds tickTest3Sec = new ClockDisplaySeconds(1,59,59);
        System.out.println("Your time before tick is: " + tickTest3Sec.getTime());
        tickTest3Sec.timeTick();
        System.out.println(" Your time after tick is: " + tickTest3Sec.getTime());
        
        ClockDisplaySeconds tickTest4Sec = new ClockDisplaySeconds(23,59,59);
        System.out.println("Your time before tick is: " + tickTest4Sec.getTime());
        tickTest4Sec.timeTick();
        System.out.println(" Your time after tick is: " + tickTest4Sec.getTime());
        
        
        
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
    }
}
