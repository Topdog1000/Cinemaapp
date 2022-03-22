package com.example.cinemaapp;

public class Movies {
    private String title;
    private String director;
    private String producer;
    private String releaseDate;
    private String ticketNumber;

    /**
     * @param title
     * @param director
     * @param producer
     * @param releaseDate
     * @param ticketNumber
     */
    public Movies(String title, String director, String producer, String releaseDate, String ticketNumber) {
        this.title = title;
        this.director = director;
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.ticketNumber = ticketNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
