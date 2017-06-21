package io.egen.movie.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class actual {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager em = emf.createEntityManager();

		Movies Movie1 = new Movies();
		Movie1.setTitle("Avengers: Age of Ultron");
		Movie1.setYear(2015);
		Movie1.setRated("PG-13");
		Movie1.setReleased("2015-05-01");
		Movie1.setRuntime("141 min");
		Movie1.setGenre("Action, Adventure, Sci-Fi");
		Movie1.setDirector("Joss Whedon");
		Movie1.setWriter("Joss Whedon, Stan Lee (Marvel comics), Jack Kirby (Marvel comics)");
		Movie1.setActors("Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans");
		Movie1.setPlot(
				"When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's Mightiest Heroes to stop the villainous Ultron from enacting his terrible plans.");
		Movie1.setLanguage("English");
		Movie1.setCountry("USA");
		Movie1.setAwards("1 win & 12 nominations.");
		Movie1.setPoster(
				"http://ia.media-imdb.com/images/M/MV5BMTU4MDU3NDQ5Ml5BMl5BanBnXkFtZTgwOTU5MDUxNTE@._V1_SX300.jpg");
		Movie1.setMetascore(66);
		Movie1.setImdbRating(7.6);
		Movie1.setImdbVotes(370909);
		Movie1.setImdbId("tt2395427");
		Movie1.setType("movie");

		Movies Movie2 = new Movies();
		Movie2.setTitle("Homeland");
		Movie2.setYear(2015);
		Movie2.setRated("TV-MA");
		Movie2.setReleased("2011-10-02");
		Movie2.setRuntime("55 min");
		Movie2.setGenre("Drama, Mystery, Thriller");
		Movie2.setDirector(null);
		Movie2.setWriter("Alex Gansa, Howard Gordon");
		Movie2.setActors("Claire Danes, Mandy Patinkin, Rupert Friend, Damian Lewis");
		Movie2.setPlot(
				"When Marine Nicolas Brody is hailed as a hero after he returns home from eight years of captivity in Iraq, intelligence officer Carrie Mathison is the only one who suspects that he may have been turned.");
		Movie2.setLanguage("English");
		Movie2.setCountry("USA");
		Movie2.setAwards("Won 5 Golden Globes. Another 45 wins & 134 nominations.");
		Movie2.setPoster(
				"http://ia.media-imdb.com/images/M/MV5BMjE0NTc2MzM1OV5BMl5BanBnXkFtZTgwMDk2NjA2NjE@._V1_SX300.jpg");
		Movie2.setMetascore(0);
		Movie2.setImdbRating(8.4);
		Movie2.setImdbVotes(214463);
		Movie2.setImdbId("tt1796960");
		Movie2.setType("series");

		em.getTransaction().begin();
		em.persist(Movie1);
		em.persist(Movie2);
		em.getTransaction().commit();
		em.close();
	}
}
