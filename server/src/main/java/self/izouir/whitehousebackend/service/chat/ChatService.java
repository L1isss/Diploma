package self.izouir.whitehousebackend.service.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import self.izouir.whitehousebackend.entity.chat.Chat;
import self.izouir.whitehousebackend.exception.ChatNotFoundException;
import self.izouir.whitehousebackend.repository.chat.ChatRepository;

@RequiredArgsConstructor
@Service
public class ChatService {
    private final ChatRepository chatRepository;

    public Chat find(Long chatId) {
        return chatRepository.findById(chatId).orElseThrow(
                () -> new ChatNotFoundException("Chat with id = " + chatId + " was not found"));
    }

    public void save(Chat chat, Long firstUserId, Long secondUserId) {
        chatRepository.save(chat);
        chatRepository.save(chat.getId(), firstUserId, secondUserId);
    }
}
