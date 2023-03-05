package ru.tg_courses.tgbot_courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tg_courses.tgbot_courses.entity.ActiveChat;

import java.util.Optional;

@Repository
public interface ActiveChatRepository extends JpaRepository<ActiveChat, Long> {

    Optional<ActiveChat> findActiveChatByChatId(Long chatId);

}
