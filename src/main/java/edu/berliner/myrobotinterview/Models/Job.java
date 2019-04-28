package edu.berliner.myrobotinterview.Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Job
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @Lob
    private String description;

    private Date datePosted;

    private String dateExpires;

    private boolean closed;

    private String hiringManagerEmail;

    private String[] keywords;

    @ManyToMany(mappedBy = "jobs", fetch = FetchType.LAZY)
    private Collection<User> users;

    @ManyToOne
    //@JoinColumn(name = "jobTitle_id")
    private Type type;
    //=================================================
    //Constructors
    //=================================================
    //default

    public Job()
    {
    }

    //loaded

    public Job(String title, String description, Date datePosted, String dateExpires, boolean closed,
               String hiringManagerEmail, String[] keywords)
    {
        this.title = title;
        this.description = description;
        this.datePosted = datePosted;
        this.dateExpires = dateExpires;
        this.closed = closed;
        this.hiringManagerEmail = hiringManagerEmail;
        this.keywords = keywords;
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

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getDatePosted()
    {
        return datePosted;
    }

    public void setDatePosted(Date datePosted)
    {
        this.datePosted = datePosted;
    }

    public String getDateExpires()
    {
        return dateExpires;
    }

    public void setDateExpires(String dateExpires)
    {
        this.dateExpires = dateExpires;
    }

    public boolean isClosed()
    {
        return closed;
    }

    public void setClosed(boolean closed)
    {
        this.closed = closed;
    }

    public String getHiringManagerEmail()
    {
        return hiringManagerEmail;
    }

    public void setHiringManagerEmail(String hiringManagerEmail)
    {
        this.hiringManagerEmail = hiringManagerEmail;
    }

    public String[] getKeywords()
    {
        return keywords;
    }

    public void setKeywords(String[] keywords)
    {
        this.keywords = keywords;
    }

    public Collection<User> getUsers()
    {
        return users;
    }

    public void setUsers(Collection<User> users)
    {
        this.users = users;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }
}
