package org.example.azureexample.Repository;

import org.example.azureexample.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}

