import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal{
	public static void main(String[] args){
		showDateTime();
        Usuarios(2);
	}

    public static void showDateTime(){
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println(fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() + " - " + fecha.getHour() + ":" + fecha.getMinute() + ":" + fecha.getSecond());
    }

    public static void Usuarios(int num){
        Usuario users[] = new Usuario[num];  
        for(int i = 0; i < num; i++){
            users[i] = readUsuario();        
        }

        for(int i = 0; i < num; i++){
            showUsuario(users[i]);       
        }
    }

    public static Usuario readUsuario(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellidos;
        String email;
        System.out.printf("Leer Nuevo Usuario\n Nombre >> ");
        nombre = sc.nextLine();
        System.out.printf("\n Apellidos >> ");
        apellidos = sc.nextLine();
        System.out.printf("\n Email >> ");
        email = sc.nextLine();
        return new Usuario(nombre, apellidos, email);      
    }

    public static void showUsuario(Usuario user){
        System.out.println(user.getNombre() + " " + user.getApellidos() + " | " + user.getEmail());
    }
}
