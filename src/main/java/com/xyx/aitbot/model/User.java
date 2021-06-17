package com.xyx.aitbot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@Entity
@Table
public class User {

    @Id
    private String email;

    private String password;

    private short status;

    private Date time;

}
