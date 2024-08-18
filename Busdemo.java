
import java.util.Scanner;
import java.util.ArrayList;
public class Busdemo implements color{
    public static void main(String args[]){
        SoundPlayer sp=new SoundPlayer("C:\\Users\\Vinushaanth\\Downloads\\drive-breakbeat-173062.wav");
        ArrayList <Bus> Buses=new ArrayList<Bus>();
        ArrayList <Booking> Bookings=new ArrayList<Booking>();
        Buses.add(new Bus(1,true,55));
        Buses.add(new Bus(2,false,2));
        Buses.add(new Bus(3,true,15));
        Buses.add(new Bus(4,false,35));
        Buses.add(new Bus(5,true,40));
        for(Bus i :Buses){
            i.display();
        }
       int userinput=1;
       sp.play();
       while(userinput==1){
        
        System.out.println(ANSI_BLUE+ANSI_BG_GREEN+"Enter 1 to book and 2 to exit"+ANSI_RESET);
        Scanner scanner=new Scanner(System.in);
        userinput=scanner.nextInt();
        if(userinput==1){
            Booking booking=new Booking();
            if(booking.isavailable(Bookings,Buses)){
                System.out.println(ANSI_BLUE+ANSI_BG_YELLOW+ "booking is confirmed"+ANSI_RESET);
                Bookings.add(booking);
            }
            else{
                System.out.println(ANSI_RED+ANSI_BG_BLACK+"try another bus or date"+ANSI_RESET);

            }
         

        }
        else
        sp.stop();
        break;
    }
    
    sp.close();
}
    
}
