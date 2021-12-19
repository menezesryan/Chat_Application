package com.example.chat_application;

public class Message {
    public String messageId, message, senderId;
    private long timestamp;

    public Message() {
    }

    public Message(String message, String senderId, long timestamp) {
        this.message = message;
        this.senderId = senderId;
        this.timestamp = timestamp;
    }

    public void encryptMessage()
    {
        AES aes = new AES();
        message = aes.encrypt(message);
    }

    public void decryptMessage()
    {
        AES aes = new AES();
        try {
            message = aes.decrypt(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
