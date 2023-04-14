package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cogent.infotech.com.entity.Movie;

import cogent.infotech.com.repository.MovieRepository;

@Service
public class MovieService {
	Scanner in=new Scanner(System.in);
	@Autowired
	MovieRepository mr;
	
	//Single movie get
	public Optional<Movie> get(int id){
		return mr.findById(id);
	}
	
	//Get all movies
	public List<Movie> getAll(){
		return (List<Movie>) mr.findAll();
	}

	//Create movie
	public Movie create(Movie movie) {
		return mr.save(movie);
	}
	
	//Update movie
	public void update(int id) throws Exception {
		boolean found=false;
		List<Movie> movies = (List<Movie>) mr.findAll();
		for(int i=0; i<movies.size(); i++) {
			if(movies.get(i).getMovieId() == id) {
				found=true;
				System.out.println("Updating movie");
				System.out.println("New name: ");
				movies.get(i).setMovieName(in.next());
				System.out.println("New genre: ");
				movies.get(i).setMovieGenre(in.next());
				mr.save(movies.get(i));
			}
		}
		if(!found) {
			throw new MovieNotFoundException("Movie not in database");
		}
		
	}
	//Delete movie
	public void delete(int id) {
		mr.deleteById(id);
	}
	
	//Delete all movies
	public void deleteAll() {
		mr.deleteAll();
	}
}
