package lk.ijse.spring.service.impl;


import lk.ijse.spring.dto.TaskDTO;
import lk.ijse.spring.service.TaskService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
    public void saveTask(TaskDTO taskDTO) {

    }

    public void updateTask(TaskDTO taskDTO) {

    }

    public TaskDTO searchTask(Integer taskId) {
        return null;
    }

    public void deleteTask(Integer taskId) {

    }

    public List<TaskDTO> getAllTasks() {
        return null;
    }
}
