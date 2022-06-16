package com.ty;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeApp {

	@RequestMapping("/load")
	public ModelAndView loadme() {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		modelAndView.addObject("myMsg", "Welcome to Our Website");
		return modelAndView;

	}

	@RequestMapping("/student")
	public ModelAndView getStudent() {
		ModelAndView modelAndView = new ModelAndView("student.jsp");
		Student student = new Student();
		student.setId(1);
		student.setName("Karthi");
		student.setEmail("karthi@mail.com");
		modelAndView.addObject("student", student);
		return modelAndView;

	}

	@RequestMapping("/createUser")
	public ModelAndView createUser() {
		ModelAndView modelAndView = new ModelAndView("createUser.jsp");
		modelAndView.addObject("myUser", new User());
		return modelAndView;

	}

	@RequestMapping("/saveUser")
	public ModelAndView saveUser(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		modelAndView.addObject("myMsg", user.getName() + " Registered Successfully");
		return modelAndView;

	}

	@RequestMapping("/createStudent")
	public ModelAndView createStudent() {
		ModelAndView modelAndView = new ModelAndView("createUser.jsp");
		modelAndView.addObject("myUser", new User());
		return modelAndView;

	}

	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		modelAndView.addObject("myMsg", student.getName() + " Registered Successfully");
		return modelAndView;

	}

	@RequestMapping("/showNames")
	public ModelAndView showNames() {
		ModelAndView modelAndView = new ModelAndView("showNames.jsp");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Karthi");
		arrayList.add("Peter");
		arrayList.add("Nishanth");

		modelAndView.addObject("myNames", arrayList);
		return modelAndView;

	}

	@RequestMapping("/showUsers")
	public ModelAndView showUser() {
		ModelAndView modelAndView = new ModelAndView("showUser.jsp");
		ArrayList<User> arrayList = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("Karthi");
		user.setEmail("karthi@mail.com");
		User user1 = new User();
		user1.setId(2);
		user1.setName("Peter");
		user1.setEmail("peter@mail.com");
		User user2 = new User();
		user2.setId(3);
		user2.setName("Nishanth");
		user2.setEmail("nishanth@mail.com");

		arrayList.add(user);
		arrayList.add(user1);
		arrayList.add(user2);

		modelAndView.addObject("users", arrayList);
		return modelAndView;

	}

	@RequestMapping("/editUser")
	public ModelAndView editUser(@RequestParam(name = "id") int id) {
		ModelAndView modelAndView = new ModelAndView("home.jsp");

		modelAndView.addObject("userMsg", "Update successfull for Id " + id);

		return modelAndView;

	}

	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		int id = Integer.parseInt(request.getParameter("id"));
		modelAndView.addObject("deleteMsg", "Id " + id + "Deleted");
		return modelAndView;

	}

}
