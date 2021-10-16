package br.com.fiap.easycoachapi.dto;

import br.com.fiap.easycoachapi.entity.Session;

import java.time.LocalDateTime;

public class SessionDTO {
    private Integer id;
    private LocalDateTime scheduledDateTime;
    private Double sessionNumber;
    private String title;
    private String description;
    private String inviteUrl;
    private Boolean hasCancellationFee;

    public SessionDTO() {}

    public SessionDTO(Session session){
        id = session.getId();
        scheduledDateTime = session.getScheduledDateTime();
        sessionNumber = session.getSessionNumber();
        title = session.getTitle();
        description = session.getDescription();
        inviteUrl = session.getInviteUrl();
        hasCancellationFee = session.getHasCancellationFee();
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public LocalDateTime getScheduledDateTime() {
        return scheduledDateTime;
    }

    public void setScheduledDateTime(LocalDateTime scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }

    public Double getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(Double sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInviteUrl() {
        return inviteUrl;
    }

    public void setInviteUrl(String inviteUrl) {
        this.inviteUrl = inviteUrl;
    }

    public Boolean getHasCancellationFee() {
        return hasCancellationFee;
    }

    public void setHasCancellationFee(Boolean hasCancellationFee) {
        this.hasCancellationFee = hasCancellationFee;
    }
}
