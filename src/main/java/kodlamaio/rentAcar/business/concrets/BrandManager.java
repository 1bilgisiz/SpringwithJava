package kodlamaio.rentAcar.business.concrets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.rentAcar.business.abstracts.BrandService;
import kodlamaio.rentAcar.dateAcces.abstracts.BrandRepostory;
import kodlamaio.rentAcar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService{

	private BrandRepostory brandRepostory;
	
	
	@Autowired
	public BrandManager(BrandRepostory brandRepostory) {
		this.brandRepostory = brandRepostory;
	}



	@Override
	public List<Brand> getAll() {
		//iş kuralları
		
		return brandRepostory.getAll();
	}

}
