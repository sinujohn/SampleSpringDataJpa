package me.sinu.springdata.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Person {
    @Id
    private Integer id;

    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "lastUpdated ", insertable = false, updatable = false)
    private Date dob;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
