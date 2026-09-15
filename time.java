import java.time.LocalTime;
public class time{
    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        int rHour=time.getHour();
        int rMinute=time.getMinute();
        int rSecond=time.getSecond();
        int rSecondsLeft=(rHour*60+rMinute)*60+rSecond;
        int hour=13;
        int minute=23;
        int second=43;
        int secondsLeft=(hour*60+minute)*60+second;
        System.out.println("The time is "+hour+":"+minute+":"+second);
        System.out.print("Seconds since midnight: ");
        System.out.println(secondsLeft);
        System.out.print("Seconds left: ");
        System.out.println((24*3600)-secondsLeft);
        System.out.println(secondsLeft*100/(24*3600)+"% of the day has passed");
        
        System.out.println();
        System.out.println("The real time is "+rHour+":"+rMinute+":"+rSecond);
        System.out.print("Real seconds since midnight: ");
        System.out.println(rSecondsLeft);
        System.out.print("Real seconds left: ");
        System.out.println((24*3600)-rSecondsLeft);
        System.out.println(rSecondsLeft*100/(24*3600)+"% of the day has actually passed");
        
    }
}
