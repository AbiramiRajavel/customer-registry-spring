package com.example.Customercarereport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CustomerController {
	@Autowired
	CustomerRepo repo;
@RequestMapping(value="/")
public String reg() {
	return "index";
}
@RequestMapping(value="/endpage")
public ModelAndView term(CustomerHelper helper) {
	ModelAndView md=new ModelAndView();
	if(helper.getGender().contains("female")) {
		String gen="Ms "+helper.getFirstname();
	md.addObject("gender",gen );
	}else {
		String mal="Mr "+helper.getFirstname();
		md.addObject("gender", mal);
	}
	repo.save(helper);
	return md;
}
}

