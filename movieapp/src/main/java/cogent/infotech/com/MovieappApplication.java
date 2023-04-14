package cogent.infotech.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Movie;
import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.MovieRepository;
import cogent.infotech.com.repository.UserRepository;
import cogent.infotech.com.service.MovieService;

@SpringBootApplication
public class MovieappApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository repository;
	@Autowired
	MovieService movieService;
	@PostConstruct
	 public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "Admin", "password", "admin@gmail.com"),
                new User(102, "allen", "password", "user1@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieappApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//Inserting movies into database for testing
		Movie m1=new Movie("Percy Jackson", "Fantasy");
		Movie m2=new Movie("Harry Potter", "Fantasy");
		Movie m3=new Movie("Inception", "Thriller");
		movieService.create(m1);
		movieService.create(m2);
		movieService.create(m3);
		//Updating movie based on user input 
		movieService.update(2);
		//Deleting movie
		movieService.delete(1);
		
	}

}
