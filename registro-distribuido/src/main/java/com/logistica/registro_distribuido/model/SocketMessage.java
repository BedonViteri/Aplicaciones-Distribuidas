package com.logistica.registro_distribuido.model;

import java.io.Serializable;

public class SocketMessage implements Serializable {
    private String type;
    private String payload;
    private long lamportTimestamp;
    private int senderId;

    public SocketMessage() {}

    public SocketMessage(String type, String payload, long lamportTimestamp, int senderId) {
        this.type = type;
        this.payload = payload;
        this.lamportTimestamp = lamportTimestamp;
        this.senderId = senderId;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getPayload() { return payload; }
    public void setPayload(String payload) { this.payload = payload; }

    public long getLamportTimestamp() { return lamportTimestamp; }
    public void setLamportTimestamp(long lamportTimestamp) { this.lamportTimestamp = lamportTimestamp; }

    public int getSenderId() { return senderId; }
    public void setSenderId(int senderId) { this.senderId = senderId; }
}