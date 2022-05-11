package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentcontroller {
	@RequestMapping("/index")
	public String display()
	{
		return"index";
	}


	}

