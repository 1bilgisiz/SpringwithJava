package kodlamaio.rentAcar.dateAcces.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.rentAcar.entities.concretes.Brand;


public interface BrandRepostory  extends JpaRepository<Brand, Integer>{
	
}
