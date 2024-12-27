import styles from "./todoitem.module.css";

export default function TodoItem({ x: item, todos, setTodos }) {
  function handleDelete() {
    console.log("Delete clicked on " + item);
    setTodos(todos.filter((todo) => todo !== item));
  }

  function handleClick(name) {
    const newArray = todos.map((todo) =>
      todo.name === name ? { ...todo, done: !todo.done } : todo
    );
    setTodos(newArray);
  }
  const classNameUsed = item.done ? styles.completed : "";

  let totalDone = todos.filter((todo) => todo.done === true).lenght;
  return (
    <div className={styles.item}>
      <div className={styles.itemName}>
        <span className={classNameUsed} onClick={() => handleClick(item.name)}>
          {item.name}
        </span>

        <span>
          <button
            onClick={() => handleDelete(item)}
            className={styles.deleteButton}
          >
            x
          </button>
        </span>
      </div>

      <hr className={styles.line} />
      <h3>{totalDone}</h3>
    </div>
  );
}
