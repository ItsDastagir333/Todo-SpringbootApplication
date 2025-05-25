package com.app.todoapp.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.todoapp.entity.Todo;
import com.app.todoapp.service.TodoService;

@Controller
@RequestMapping(value = "/")
public class TodoController {
	@Autowired
	private final TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	@GetMapping(value = "/getTodos")
	public String getTodos(Model model) {
		List<Todo> todos = todoService.getAllTodos();
		model.addAttribute("todos", todos);
		model.addAttribute("now", java.time.LocalDate.now());
		return "todo";
	}
	
	@PostMapping(value = "/addTodo")
	public String addTodo(@RequestParam String title, String description, LocalDate dateToComplete) {
		todoService.addTodo(title, description, dateToComplete);
		return "redirect:/getTodos";
	}
	
	@GetMapping(value="/getTodos/{id}/delete")
	public String deleteTodo(@PathVariable(value = "id") Long id) {
		todoService.deleteTodo(id);
		return "redirect:/getTodos";
	}
	
	@GetMapping(value="/getTodos/{id}/toggle")
	public String toggleTodo(@PathVariable(value = "id") Long id) {
		todoService.toggleTodo(id);
		return "redirect:/getTodos";
	}

}
