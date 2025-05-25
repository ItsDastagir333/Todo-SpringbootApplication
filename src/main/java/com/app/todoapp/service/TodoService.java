package com.app.todoapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.todoapp.dao.TodoDao;
import com.app.todoapp.entity.Todo;

@Service
public class TodoService {
	
	@Autowired
	private final TodoDao todoDao;

	public TodoService(TodoDao todoDao) {
		super();
		this.todoDao = todoDao;
	}




	public List<Todo> getAllTodos() {
		return todoDao.findAll();
	}




	public void addTodo(String title, String description, LocalDate dateToComplete) {
		Todo newTodo = new Todo();
		newTodo.setTitle(title);
		newTodo.setDescription(description);
		newTodo.setIsComplete(false);
		newTodo.setDateToComplete(dateToComplete);
		todoDao.save(newTodo);
	}


	public void deleteTodo(Long id) {
		todoDao.deleteById(id);;
	}

	public void toggleTodo(Long id) {
		Todo todo = todoDao.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Invalid todo Id.."));
		todo.setIsComplete(!todo.getIsComplete());
		todoDao.save(todo);
	}
    
}
