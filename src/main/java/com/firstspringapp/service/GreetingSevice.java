package com.firstspringapp.service;

import com.firstspringapp.models.Greeting;
import com.firstspringapp.models.User;
import com.firstspringapp.service.interfaces.IGreetingService;
import com.firstspringapp.service.interfaces.repo.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingSevice implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template,(user.toString().isEmpty())? "Hello world":user.toString());
        return  greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    @Override
    public Greeting getGreetingById(long id) {
        return null;
    }
}