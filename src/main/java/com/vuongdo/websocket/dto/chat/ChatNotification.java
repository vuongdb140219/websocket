package com.vuongdo.websocket.dto.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatNotification {
    private String id;
    private String senderId;
    private String recipientId;
    private String content;
}
