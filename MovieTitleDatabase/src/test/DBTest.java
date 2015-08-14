package test;

import static org.junit.Assert.*;
import main.Adjective;
import main.DB;
import main.MovieTitle;
import main.Noun;

import org.junit.Test;

public class DBTest
{

	@Test
	public void test()
	{
		DB db = new DB();
		MovieTitle movie = db.getRandomMovieTitle();
		System.out.println(movie.getMovieTitle());
		movie.setDescription("Testing    lka");
		db.saveMovie(movie);
	}

}
