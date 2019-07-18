import java.util.Scanner;

public class Main {
    
    /**
     * Einstieg in ein Javaprogramm.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		System.out.println("Wer bist Du?");
		String eingabe = scanner.nextLine(); 
		System.out.println("Hallo, " + eingabe);
    }
    
}
