package it.gfrate.agent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String originalUrl;
    private String shortenedUrl;
    @CreatedDate
    private Date createdAt;

    public Url() {
    }

    public Url(String originalUrl, String shortenedUrl, Date createdAt) {
        this.originalUrl = originalUrl;
        this.shortenedUrl = shortenedUrl;
        this.createdAt = createdAt;
    }

    public Url(Long id, String originalUrl, String shortenedUrl, Date createdAt) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.shortenedUrl = shortenedUrl;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortenedUrl() {
        return shortenedUrl;
    }

    public void setShortenedUrl(String shortenedUrl) {
        this.shortenedUrl = shortenedUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
