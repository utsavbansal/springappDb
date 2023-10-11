package com.example.taskman.notes;

import com.example.taskman.tasks.TaskEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name = "notes")
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id",nullable = false)
    private Long id;

    @NonNull
    @Column
    private String text;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private TaskEntity task;
}
