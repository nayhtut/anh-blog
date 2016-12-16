package com.anh.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.anh.entity.Blog;
import com.anh.entity.Item;
import com.anh.entity.Role;
import com.anh.entity.User;
import com.anh.repository.BlogRepository;
import com.anh.repository.ItemRepository;
import com.anh.repository.RoleRepository;
import com.anh.repository.UserRepository;

@Transactional
@Service
public class InitDbService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@PostConstruct
	public void init(){
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setEnabled(true);
		userAdmin.setName("admin");
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		userAdmin.setPassword(encoder.encode("admin"));
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		User user1 = new User();
		user1.setEnabled(true);
		user1.setName("user1");
		BCryptPasswordEncoder encoder1 = new BCryptPasswordEncoder();
		user1.setPassword(encoder1.encode("user1"));
		List<Role> roles1 = new ArrayList<Role>();
		roles1.add(roleUser);
		user1.setRoles(roles1);
		userRepository.save(user1);
		
		Blog blogAnh = new Blog();
		blogAnh.setName("Blog-ANH");
		blogAnh.setUrl("#BlahBlahBlah.com");
		blogAnh.setUser(userAdmin);
		blogRepository.save(blogAnh);
		
		Item item1 = new Item();
		item1.setBlog(blogAnh);
		item1.setTitle("first");
		item1.setLink("#BlahBlahBlah.com");
		item1.setPublishedDate(new Date());
		itemRepository.save(item1);

		Item item2 = new Item();
		item2.setBlog(blogAnh);
		item2.setTitle("second");
		item2.setLink("#BlahBlahBlah.com");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);	
	}
	
}
