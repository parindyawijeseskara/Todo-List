package lk.ijse.spring.controller;


import lk.ijse.spring.dto.TaskDTO;
import lk.ijse.spring.service.TaskService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    //save Tasks
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveTask(@RequestBody TaskDTO taskDTO){
        taskService.saveTask(taskDTO);
        return new ResponseUtil(200,"Saved Task successfully...!",taskDTO);
    }

    //update Tasks
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateTask(@RequestBody TaskDTO taskDTO){
        taskService.updateTask(taskDTO);
        return new ResponseUtil(200,"Updated Task successfully...!",taskDTO);
    }

    //search Tasks
    @GetMapping(value = "/{taskId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchTask(@PathVariable Integer taskId){
        TaskDTO taskDTO = taskService.searchTask(taskId);
        return new ResponseUtil(200,"Ok",taskDTO);
    }

    //get all tasks
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllTasks(){
        return new ResponseUtil(200,"Ok",taskService.getAllTasks());

    }

    //delete task by taskId
    @DeleteMapping(params = {"taskId"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteTask(@RequestParam Integer taskId){
        return new ResponseUtil(200,"Deleted task successfully..!",taskId);
    }



}
