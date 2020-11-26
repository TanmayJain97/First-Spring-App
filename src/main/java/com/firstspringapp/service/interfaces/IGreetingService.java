package com.firstspringapp.service.interfaces;

import com.firstspringapp.models.Greeting;
import com.firstspringapp.models.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);

}
