package kodlamaio.rentAcar.business.concrets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.rentAcar.business.abstracts.BrandService;
import kodlamaio.rentAcar.business.request.CreateBrandsRequest;
import kodlamaio.rentAcar.business.responses.GetAllBrandsResponse;
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
	public List<GetAllBrandsResponse> getAll() {
		
		
		List<Brand> brands =  brandRepostory.findAll();
		List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();
		
		
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new  GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponses.add(responseItem);
		}
		//iş kuralları
		
		return brandsResponses;
	}



	@Override
	public void add(CreateBrandsRequest createbrandsRequest) {

		Brand brand = new Brand();
		brand.setName(createbrandsRequest.getName());
		this.brandRepostory.save(brand);
	}

}	
