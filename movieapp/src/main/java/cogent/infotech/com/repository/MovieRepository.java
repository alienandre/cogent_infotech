package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.entity.Movie;
@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
