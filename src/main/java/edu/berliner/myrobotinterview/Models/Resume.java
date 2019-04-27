package edu.berliner.myrobotinterview.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Resume
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @Lob
    private String data;

    private Date dateUploaded;

    @ManyToOne
//    @JoinColumn(name = "user_id")
    private User user;


    //=================================================
    //Constructors
    //=================================================
    //default
    public Resume()
    {
    }

    //loaded

    public Resume(String title, String data, Date dateUploaded)
    {
        this.title = title;
        this.data = data;
        this.dateUploaded = dateUploaded;
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

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public Date getDateUploaded()
    {
        return dateUploaded;
    }

    public void setDateUploaded(Date dateUploaded)
    {
        this.dateUploaded = dateUploaded;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
