package com.example.taskman.tasks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TasksRepository extends JpaRepository<TaskEntity,Long> {

}
