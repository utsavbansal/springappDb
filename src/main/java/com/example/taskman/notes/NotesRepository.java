package com.example.taskman.notes;

import com.example.taskman.tasks.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends JpaRepository<NoteEntity,Long> {
    List<NoteEntity> findAllByTask(TaskEntity task);
}
