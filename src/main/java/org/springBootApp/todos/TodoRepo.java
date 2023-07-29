package org.springBootApp.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo,Integer> {

    Todo findByTitle(String title);
}
