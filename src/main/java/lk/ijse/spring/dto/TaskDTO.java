package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class TaskDTO {
    private Integer taskId;
    private String description;
    private int userId;
    private Date startDate;
    private Date endDate;
}
