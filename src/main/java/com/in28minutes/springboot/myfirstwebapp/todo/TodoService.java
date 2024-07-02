package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    //외부에서 직접 접근하길 바라지 않기 때문에 private 안에 todo 리스트를 담자.
    private static List<Todo> todos;
    //정적 리스트 만들기
    static {
        todos.add(new Todo(1, "Kim", "Learn JAVA",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Lee", "Learn python",
                LocalDate.now().plusMonths(3), false));
        todos.add(new Todo(3, "Park", "Learn C++",
                LocalDate.now().plusWeeks(2), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }

}
