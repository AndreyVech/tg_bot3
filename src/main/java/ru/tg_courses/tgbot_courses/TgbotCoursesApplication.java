package ru.tg_courses.tgbot_courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TgbotCoursesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TgbotCoursesApplication.class, args);
    }

}
