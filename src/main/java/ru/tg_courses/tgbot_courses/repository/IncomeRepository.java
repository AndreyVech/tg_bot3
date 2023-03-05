package ru.tg_courses.tgbot_courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tg_courses.tgbot_courses.entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}