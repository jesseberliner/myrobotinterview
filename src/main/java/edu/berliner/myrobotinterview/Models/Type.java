package edu.berliner.myrobotinterview.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Type
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @OneToMany(mappedBy = "type")
    private Collection<Job> jobs;

    //=================================================
    //Constructors
    //=================================================
    //default

    public Type()
    {
    }


    //loaded

    public Type(String title)
    {
        this.title = title;
    }


    //=================================================
    //Getters and Setters
    //=================================================


    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Collection<Job> getJobs()
    {
        return jobs;
    }

    public void setJobs(Collection<Job> jobs)
    {
        this.jobs = jobs;
    }
}
