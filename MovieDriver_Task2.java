import java.util.*;

public class MovieDriver {

	public static void main(String[] args) 
	{
		// Creating the objects and variables
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		String userInput="";
		
		// Loop to capture user input
		do {
		// Prompting user for the entries
		System.out.println("Enter the name of a movie: ");
		String title = keyboard.nextLine();
        movie.setTitle(title);
		
		System.out.println("Enter the rating of the movie: ");
		String rating = keyboard.nextLine();
        movie.setRating(rating);
		
		System.out.println("Enter the number of tickets this movie sold: ");
		int soldTickets = keyboard.nextInt();
		// clear feed
		keyboard.nextLine();
		
        movie.setSoldTickets(soldTickets);
		// display info
		System.out.println(movie.toString());
		// Ask if user wants to repeat
		System.out.println("Do you want to enter another movie? (y or n)");
		userInput = keyboard.nextLine();
		
		} while (userInput.equalsIgnoreCase("y"));
		System.out.println("Goodbye.");
	}
}
