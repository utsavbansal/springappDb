package com.example.taskman.tasks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TasksRepository extends JpaRepository<TaskEntity,Long> {

}
