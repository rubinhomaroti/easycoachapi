package br.com.fiap.easycoachapi.dto;

import java.time.LocalDateTime;

public class UpdateSessionDTO {
    private LocalDateTime scheduledDateTime;
    private String title;
    private String description;
    private String inviteUrl;
    private Boolean hasCancellationFee;

    public LocalDateTime getScheduledDateTime() {
        return scheduledDateTime;
    }

    public void setScheduledDateTime(LocalDateTime scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
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
