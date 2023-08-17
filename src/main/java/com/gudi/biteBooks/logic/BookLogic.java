package com.gudi.biteBooks.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gudi.biteBooks.dao.BookDao;

@Service
public class BookLogic {
    Logger logger = LoggerFactory.getLogger(BookLogic.class);
    @Autowired
    private BookDao bookDao = null;
    
    //insert method here 

}
