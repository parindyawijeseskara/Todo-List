package lk.ijse.spring.service;

import lk.ijse.spring.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    public void saveTask(TaskDTO taskDTO);
    public void updateTask(TaskDTO taskDTO);
    public TaskDTO searchTask(Integer taskId);
    public void deleteTask(Integer taskId);
    public List<TaskDTO> getAllTasks();
}
