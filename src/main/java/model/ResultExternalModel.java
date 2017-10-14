package model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mzaferanloo on 12/3/2016.
 */
public class ResultExternalModel
{
    @JsonProperty("tv_season_results")
    private String[] tv_season_results;

    @JsonProperty("tv_episode_results")
    private String[] tv_episode_results;

    @JsonProperty("tv_results")
    private String[] tv_results;

    @JsonProperty("movie_results")
    private MovieResultsModel[] movie_results;

    @JsonProperty("person_results")
    private String[] person_results;

    public String[] getTv_season_results ()
    {
        return tv_season_results;
    }

    public void setTv_season_results (String[] tv_season_results)
    {
        this.tv_season_results = tv_season_results;
    }

    public String[] getTv_episode_results ()
    {
        return tv_episode_results;
    }

    public void setTv_episode_results (String[] tv_episode_results)
    {
        this.tv_episode_results = tv_episode_results;
    }

    public String[] getTv_results ()
    {
        return tv_results;
    }

    public void setTv_results (String[] tv_results)
    {
        this.tv_results = tv_results;
    }

    public MovieResultsModel[] getMovie_results ()
    {
        return movie_results;
    }

    public void setMovie_results (MovieResultsModel[] movie_results)
    {
        this.movie_results = movie_results;
    }

    public String[] getPerson_results ()
    {
        return person_results;
    }

    public void setPerson_results (String[] person_results)
    {
        this.person_results = person_results;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tv_season_results = "+tv_season_results+", tv_episode_results = "+tv_episode_results+", tv_results = "+tv_results+", movie_results = "+movie_results+", person_results = "+person_results+"]";
    }
}

