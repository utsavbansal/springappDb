package com.example.taskman;

import com.example.taskman.notes.NotesRepository;
import com.example.taskman.notes.NotesService;
import com.example.taskman.notes.NotesServiceImpl;
import com.example.taskman.tasks.TaskService;
import com.example.taskman.tasks.TaskServiceImpl;
import com.example.taskman.tasks.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    private TasksRepository tasksRepository;
    private NotesRepository notesRepository;

    @Autowired
    public ServiceConfig(TasksRepository tasksRepository, NotesRepository notesRepository) {
        this.tasksRepository = tasksRepository;
        this.notesRepository = notesRepository;
    }

    @Bean
    public TaskService taskService() {
        return new TaskServiceImpl(tasksRepository);
    }

    @Bean
    public NotesService noteService() {
        return new NotesServiceImpl(notesRepository);
    }
}
