package com.grngoenterprise.uberchallengeemailservice.core;

public interface EmailSendUseCase {
    void sendEmail(String to, String subject, String body);
}
