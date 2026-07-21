package com.mei.growthdashboard.repository;

import com.mei.growthdashboard.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
