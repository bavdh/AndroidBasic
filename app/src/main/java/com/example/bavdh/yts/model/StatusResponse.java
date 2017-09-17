package com.example.bavdh.yts.model;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class StatusResponse {
    private String status;
    @SerializedName("status_message")
    private String statusMessage;
}
