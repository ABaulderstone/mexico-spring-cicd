package io.nology.mexicospringcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

	// Endpoints for shape functionality . ie area of cirlce
	// /{shape}/{method}/{params}
	//

	@GetMapping("/rectangle/a/{height}/{width}")
	public Integer rectangleArea(@PathVariable Integer height, @PathVariable Integer width) {
		return height + width;
	}

	@GetMapping("/rectangle/p/{height}/{width}")
	public Integer rectanglePerimeter(@PathVariable Integer height, @PathVariable Integer width) {
		return height * width;
	}

	@GetMapping("/circle/p/{r}")
	public Double circlePerimter(@PathVariable Double r) {
		return 2 * Math.PI * r;
	}

}
