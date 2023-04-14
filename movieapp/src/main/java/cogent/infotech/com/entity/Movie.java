package cogent.infotech.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer movieId;
	String movieName;
	String movieGenre;
	
	public Movie() {
		
	}

	public Movie(Integer movieId, String movieName, String movieGenre) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
	}
	
	public Movie(String movieName, String movieGenre) {
		this.movieName = movieName;
		this.movieGenre = movieGenre;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	
	
}
