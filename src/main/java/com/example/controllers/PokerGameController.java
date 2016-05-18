package com.example.controllers;

import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Ultramar on 5/17/16.
 */
@Controller
public class PokerGameController {

    @Autowired
    UserRepository users;

    
}
