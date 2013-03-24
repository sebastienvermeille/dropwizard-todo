package fr.blemale.dropwizard.todo.jdbi;

import com.google.common.base.Optional;
import fr.blemale.dropwizard.todo.core.Todo;

import java.util.List;

public interface TodoDAO {
    Todo createTodo(Todo todo);

    Optional<Todo> updateTodo(Todo todo);

    List<Todo> getTodos();

    Optional<Todo> getTodo(long id);
}