package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.service.MovieService;

@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	//Post operation
	@PostMapping("/movies")
	public Movie saveMovie(@Validated @RequestBody Movie movie) {
		return movieService.create(movie);
	}
	
	//Get operation
	@GetMapping("/movies")
	public List<Movie> fetchMovieList(){
		return movieService.getAll();
	}
	
	//Delete operation
	@DeleteMapping("/movies/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		movieService.delete(id);
	}
	
	//Put operation
	@PutMapping("/books/{id}")
	public void updateBook(@PathVariable("id") int id) {
		
	}
}
