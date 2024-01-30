import java.time.LocalDateTime;

public class Principal{
	public static void main(String[] args){
		showDateTime();
	}

    public static void showDateTime(){
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println(fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() + " - " + fecha.getHour() + ":" + fecha.getMinute() + ":" + fecha.getSecond());
    }
}
