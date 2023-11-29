package com.grngoenterprise.uberchallengeemailservice.adapter;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
