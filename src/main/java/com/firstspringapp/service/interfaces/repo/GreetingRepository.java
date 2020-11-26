package com.firstspringapp.service.interfaces.repo;

import com.firstspringapp.models.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {
}
