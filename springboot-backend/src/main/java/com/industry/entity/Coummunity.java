package com.industry.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "tb_coummunity")
public class Coummunity {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String userId;
    
    @Column
    private String title;

    @Column
    private String content;
    
    @Column
    private Date createdAt;
    
}
