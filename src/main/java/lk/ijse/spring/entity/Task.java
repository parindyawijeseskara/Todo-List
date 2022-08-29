package lk.ijse.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Task {
    @Id
    private Integer taskId;
    private String description;
    @ManyToOne
    @JoinColumn(name = "userId",referencedColumnName = "userId")
    private User userId;
    private Date startDate;
    private Date endDate;

}
