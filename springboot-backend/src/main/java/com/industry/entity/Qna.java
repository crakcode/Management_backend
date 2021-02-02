package com.industry.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "tb_qna")
public class Qna {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Column(name="user_id")
    private String userId;
    
    @Column
    private String title;

    @Column
    private String content;
    
}
