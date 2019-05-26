/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygroup.yoursong.model;

/**
 *
 * @author rizal
 */
public class Song {
    private long id;
	
    private String title;
    
    private String author;

    private String link;

    private int duration;

    public Song(){
        id=0;
    }

    public Song(long id, String title, String author, String link, int duration){
        this.id = id;
        this.title = title;
        this.author = author;
        this.link = link;
        this.duration = duration;
    }

    public long getId() {
            return id;
    }

    public void setId(long id) {
            this.id = id;
    }

    public String getTitle() {
            return title;
    }

    public void setTitle(String title) {
            this.title = title;
    }

    public String getAuthor() {
            return author;
    }

    public void setAuthor(String author) {
            this.author = author;
    }
    
    public String getLink() {
            return link;
    }

    public void setLink(String link) {
            this.link = link;
    }

    public int getDuration() {
            return duration;
    }

    public void setDuration(int duration) {
            this.duration = duration;
    }

    @Override
    public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + (int) (id ^ (id >>> 32));
            return result;
    }

    @Override
    public boolean equals(Object obj) {
            if (this == obj)
                    return true;
            if (obj == null)
                    return false;
            if (getClass() != obj.getClass())
                    return false;
            Song other = (Song) obj;
            if (id != other.id)
                    return false;
            return true;
    }

    @Override
    public String toString() {
            return "Song [id=" + id + ", title=" + title + ", author=" + author
                            + ", link=" + link + ", duration=" + duration + "]";
    }
}
