import java.util.Scanner;
import moviepackage.Movie;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie mov = new Movie();
		
		String yesNo = "y";
		
		do {
			System.out.println("Enter the name of the movie");
			String title = sc.nextLine();
			mov.setTitle(title);
		
			System.out.println("Enter the rating of the movie");
			String rating = sc.nextLine();
			mov.setRating(rating);
		
			System.out.println("Enter the number of tickets sold for this movie");
			int tickets = sc.nextInt();
			mov.setSoldTickets(tickets);
		
			System.out.println(mov.toString());
			sc.nextLine();

			System.out.println("Do you want to enter another? (y or n)");
			yesNo = sc.nextLine();
		} while(yesNo.equals("y"));
		
		sc.close();
	}

}