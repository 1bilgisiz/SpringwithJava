package kodlamaio.rentAcar.business.abstracts;

import java.util.List;

import kodlamaio.rentAcar.business.request.CreateBrandsRequest;
import kodlamaio.rentAcar.business.responses.GetAllBrandsResponse;

public interface BrandService {

	List< GetAllBrandsResponse > getAll();
	void add(CreateBrandsRequest createbrandsRequest);
	
	
}
