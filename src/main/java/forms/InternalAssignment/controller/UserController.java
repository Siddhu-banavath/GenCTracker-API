package forms.InternalAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import forms.InternalAssignment.Exception.UserNotFoundException;
import forms.InternalAssignment.entity.User;
import forms.InternalAssignment.repository.UserRepository;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping()
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping()
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                	
                	user.setAsso_id(newUser.getAsso_id());

                	user.setAsso_name(newUser.getAsso_name());

                	 user.setProj_id(newUser.getProj_id());

                	 user.setProj_name(newUser.getProj_name());

                	 user.setCust_name(newUser.getCust_name());

                	  user.setSkill(newUser.getSkill());

                	   user.setAsso_city(newUser.getAsso_city());

                	   user.setHcm_name(newUser.getHcm_name());

                	   user.setMentor_name(newUser.getMentor_name());

                	user.setCurrent_status(newUser.getCurrent_status());           
                	return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return  "User with id "+id+" has been deleted success.";
    }



}