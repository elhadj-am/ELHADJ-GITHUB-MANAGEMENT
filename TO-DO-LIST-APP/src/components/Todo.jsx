import { useState } from "react";
import TodoItem from "./TodoItem";
import Form from "./Form";
import TodoList from "./TodoList";

export default function Todo() {
  const [todos, setTodos] = useState([]);

  return (
    <div>
      <Form todos={todos} setTodos={setTodos} />
      <TodoList todos={todos} />

      {console.log(todos)}
    </div>
  );
}
