import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking   implements color{
    String passengerName;
    int busNo;
    Date date;

    public Booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_GREEN+ANSI_BG_YELLOW+"Booking process start"+ANSI_RESET);
        System.out.println(ANSI_BLUE+ANSI_BG_GREEN+"Enter your name"+ANSI_RESET);
        passengerName = scanner.nextLine();
        System.out.println(ANSI_BLUE+ANSI_BG_GREEN+"Enter bus number"+ANSI_RESET);
        busNo = scanner.nextInt();
        if(6<busNo){
            System.out.println(ANSI_RED+ANSI_BG_BLACK+"This Bus is not available"+ANSI_RESET);

        }
        
        
        
        // Consume the newline character left by nextInt()
        scanner.nextLine(); 

        System.out.println(ANSI_BG_GREEN +ANSI_BLUE+"Enter date dd-MM-yyyy"+ANSI_RESET);
        String dateInput = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public boolean isavailable(ArrayList<Booking> Bookings,ArrayList<Bus> Buses){
        int capacity=0;
        for(Bus i:Buses){
            if(busNo==i.getbusno()){
                capacity=i.getcapacity();

            }
        }
        int booked=0;
        for(Booking b:Bookings){
            if(b.busNo==busNo && b.date.equals(date)){
                booked++;

            }
        }
        return booked<capacity?true:false;

    }
}
