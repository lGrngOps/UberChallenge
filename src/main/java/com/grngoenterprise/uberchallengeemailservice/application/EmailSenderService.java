package com.grngoenterprise.uberchallengeemailservice.application;

import com.grngoenterprise.uberchallengeemailservice.adapter.EmailSenderGateway;
import com.grngoenterprise.uberchallengeemailservice.core.EmailSendUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSendUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to,subject,body);
    }
}
