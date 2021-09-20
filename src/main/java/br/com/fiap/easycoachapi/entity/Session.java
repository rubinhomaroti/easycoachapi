package br.com.fiap.easycoachapi.entity;

import br.com.fiap.easycoachapi.dto.SessionDTO;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "scheduled_date_time")
    private LocalDateTime scheduledDateTime;

    @Column(nullable = false, name = "session_number")
    private Double sessionNumber;

    @Column(length = 64)
    private String title;

    @Column(length = 255)
    private String description;

    @Column(length = 255, name = "invite_url")
    private String inviteUrl;

    @Column(nullable = false, name = "has_cancellation_fee")
    private Boolean hasCancellationFee;

    public Session() {
    }

    public Session(SessionDTO newSessionDTO) {
        scheduledDateTime = newSessionDTO.getScheduledDateTime();
        sessionNumber = newSessionDTO.getSessionNumber();
        title = newSessionDTO.getTitle();
        description = newSessionDTO.getDescription();
        inviteUrl = newSessionDTO.getInviteUrl();
        hasCancellationFee = newSessionDTO.getHasCancellationFee();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
