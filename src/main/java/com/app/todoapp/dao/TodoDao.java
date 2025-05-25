package com.app.todoapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.todoapp.entity.Todo;

@Repository
public interface TodoDao extends JpaRepository<Todo, Long>{
	
    
     
}
