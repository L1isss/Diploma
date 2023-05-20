package self.izouir.whitehousebackend.service.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import self.izouir.whitehousebackend.entity.chat.ChatMessage;
import self.izouir.whitehousebackend.repository.chat.ChatMessageRepository;

@RequiredArgsConstructor
@Service
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    public void save(ChatMessage chatMessage) {
        chatMessageRepository.save(chatMessage);
    }
}
