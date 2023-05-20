package self.izouir.whitehousebackend.repository.chat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import self.izouir.whitehousebackend.entity.chat.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
    @Query(nativeQuery = true, value = "INSERT INTO users_to_chats (user_id, chat_id) VALUES (:firstUserId, :chatId);" +
                                       "INSERT INTO users_to_chats (user_id, chat_id) VALUES (:secondUserId, :chatId)")
    void save(@Param("chatId") Long chatId, @Param("firstUserId") Long firstUserId, @Param("secondUserId") Long secondUserId);
}
