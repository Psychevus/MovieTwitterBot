package model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mzaferanloo on 12/3/2016.
 */

public class GenresModel
{
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", name = "+name+"]";
    }
}
