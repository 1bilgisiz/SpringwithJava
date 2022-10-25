package kodlamaio.rentAcar.dateAcces.concretcs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.rentAcar.dateAcces.abstracts.BrandRepostory;
import kodlamaio.rentAcar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepostory  implements BrandRepostory {

	List<Brand> brands;
	
	
	
	public InMemoryBrandRepostory() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Audi"));
		brands.add(new Brand(3,"Fiat"));
		brands.add(new Brand(4,"Mercedes"));
		brands.add(new Brand(5,"Renaoult"));

	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}
	

}
