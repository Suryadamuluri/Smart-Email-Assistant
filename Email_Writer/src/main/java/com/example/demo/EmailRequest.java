package com.example.demo;

public class EmailRequest {
    private String emailContent;
    private String tone;

    // Parameterized Constructor (Optional)
    public EmailRequest(String emailContent, String tone) {
        this.emailContent = emailContent;
        this.tone = tone;
    }

    // Getters
    public String getEmailContent() {
        return emailContent;
    }

    public EmailRequest() {
		super();
	}

	public String getTone() {
        return tone;
    }

    //Setters
    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }
}
