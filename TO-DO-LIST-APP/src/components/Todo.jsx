import { useMemo, useState } from "react";
import TodoItem from "./TodoItem";
import Form from "./Form";
import TodoList from "./TodoList";
import Footer from "./Footer";

export default function Todo() {
  const [todos, setTodos] = useState([]);
  const completedTodos = useMemo(() => todos.filter((todo) => todo.done).length, [todos]);
  const totalTodos = todos.length;

  return (
    <div>
      <Form todos={todos} setTodos={setTodos} />
      <TodoList todos={todos} setTodos={setTodos} />
      <Footer completedTodos={completedTodos} totalTodos={totalTodos} />
    </div>
  );
}
