package arrays;
import java.util.*;
import java.util.Timer;

public class MovieTimeRemainder {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the movie name");
		String movie = sc.next();
		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt();
		int hrs = sc.nextInt();
		int min = sc.nextInt();
		// creating timer task, timer  
		Timer t = new Timer();  
		TimerTask tt = new TimerTask() {  
		    @Override  
		    public void run() {  
		        System.out.println("It's Movie Time, watch your fav movie in Amazon "+ movie);  
		    };  
		};  
		t.schedule(tt, new Date(year-1900,month-1,date,hrs-1,min-1));       
}
}


