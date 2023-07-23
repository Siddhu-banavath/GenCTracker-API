package forms.InternalAssignment.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import forms.InternalAssignment.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
