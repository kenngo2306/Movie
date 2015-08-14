package main;


import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieTitleGen
{
	public static void main(String[] args) throws Exception
	{


			DB db = new DB();
			
			
			Scanner sc = new Scanner(System.in);
			String generateMovie = "y";
			
			while(generateMovie.equals("y"))
			{
				MovieTitle movie  = db.getRandomMovieTitle();
				System.out.println( "Your movie title is: " + movie.getMovieTitle() );
				
				System.out.println("Please input your movie description");
				String desc = sc.nextLine();
				
				movie.setDescription(desc);
				db.saveMovie(movie);
				
				System.out.println("Want more? y/n");
				generateMovie = sc.next();
				sc.nextLine();
			}
			
			ArrayList<MovieTitle> movies = db.getAllMovies();
			System.out.println(movies.size());
			for(MovieTitle movie:movies)
			{
				System.out.println(movie.getMovieTitle()+ "\n \t" + movie.getDescription() +"\n--------------------------------\n");
			}
		
	}



}
