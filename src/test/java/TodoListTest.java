import org.example.Task;
import org.example.TodoList;
import org.junit.Test;
import static org.junit.Assert.*;

public class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("test");
        todoList.addTask(task);
        assertEquals(1, todoList.getTasks().size());
        assertEquals("test", todoList.getTasks().get(0).getName());
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("pierwszy");
        Task task2 = new Task("drugi");
        todoList.addTask(task1);
        todoList.addTask(task2);
        todoList.removeTask(1);
        assertEquals(1, todoList.getTasks().size());
        assertEquals("drugi", todoList.getTasks().get(0).getName());
    }
}
