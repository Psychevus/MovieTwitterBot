package model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by mzaferanloo on 12/3/2016.
 */
public class MovieModel {

    @JsonProperty("budget")
    private String budget;

    @JsonProperty("vote_average")
    private String vote_average;

    @JsonProperty("backdrop_path")
    private String backdrop_path;

    @JsonProperty("genres")
    private GenresModel[] genres;

    @JsonProperty("status")
    private String status;

    @JsonProperty("runtime")
    private String runtime;

    @JsonProperty("spoken_languages")
    private SpokenLanguagesModel[] spoken_languages;

    @JsonProperty("adult")
    private String adult;

    @JsonProperty("homepage")
    private String homepage;

    @JsonProperty("id")
    private String id;

    @JsonProperty("production_countries")
    private ProductionCountriesModel[] production_countries;

    @JsonProperty("title")
    private String title;

    @JsonProperty("original_language")
    private String original_language;

    @JsonProperty("overview")
    private String overview;

    @JsonProperty("production_companies")
    private ProductionCompaniesModel[] production_companies;

    @JsonProperty("imdb_id")
    private String imdb_id;

    @JsonProperty("release_date")
    private String release_date;

    @JsonProperty("original_title")
    private String original_title;

    @JsonProperty("vote_count")
    private String vote_count;

    @JsonProperty("poster_path")
    private String poster_path;

    @JsonProperty("video")
    private String video;

    @JsonProperty("tagline")
    private String tagline;

    @JsonProperty("revenue")
    private String revenue;

    @JsonProperty("popularity")
    private String popularity;

    @JsonProperty("belongs_to_collection")
    private BelongsToCollectionModel belongsToCollectionModel;


    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public GenresModel[] getGenres() {
        return genres;
    }

    public void setGenres(GenresModel[] genres) {
        this.genres = genres;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public SpokenLanguagesModel[] getSpoken_languages() {
        return spoken_languages;
    }

    public void setSpoken_languages(SpokenLanguagesModel[] spoken_languages) {
        this.spoken_languages = spoken_languages;
    }

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductionCountriesModel[] getProduction_countries() {
        return production_countries;
    }

    public void setProduction_countries(ProductionCountriesModel[] production_countries) {
        this.production_countries = production_countries;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public ProductionCompaniesModel[] getProduction_companies() {
        return production_companies;
    }

    public void setProduction_companies(ProductionCompaniesModel[] production_companies) {
        this.production_companies = production_companies;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getVote_count() {
        return vote_count;
    }

    public void setVote_count(String vote_count) {
        this.vote_count = vote_count;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public BelongsToCollectionModel getBelongsToCollectionModel() {
        return belongsToCollectionModel;
    }

    public void setBelongsToCollectionModel(BelongsToCollectionModel belongsToCollectionModel) {
        this.belongsToCollectionModel = belongsToCollectionModel;
    }

    @Override
    public String toString() {
        return "ClassPojo [budget = " + budget + ", vote_average = " + vote_average + ", backdrop_path = " + backdrop_path + ", genres = " + genres + ", status = " + status + ", runtime = " + runtime + ", spoken_languages = " + spoken_languages + ", adult = " + adult + ", homepage = " + homepage + ", id = " + id + ", production_countries = " + production_countries + ", title = " + title + ", original_language = " + original_language + ", overview = " + overview + ", production_companies = " + production_companies + ", imdb_id = " + imdb_id + ", release_date = " + release_date + ", original_title = " + original_title + ", vote_count = " + vote_count + ", poster_path = " + poster_path + ", video = " + video + ", tagline = " + tagline + ", revenue = " + revenue + ", popularity = " + popularity + "]";
    }
}