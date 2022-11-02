package kodlamaio.rentAcar.webApi.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.rentAcar.business.abstracts.BrandService;
import kodlamaio.rentAcar.business.request.CreateBrandsRequest;
import kodlamaio.rentAcar.business.responses.GetAllBrandsResponse;

@RestController  
@RequestMapping("/api/brands")
public class BrandsController {

	private BrandService brandService;

	
	@Autowired
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
		
	}
	
	@PostMapping("/add")
	public void add(CreateBrandsRequest createBrandsRequest) {
		this.brandService.add(createBrandsRequest);
	}
	
}
