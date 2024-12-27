import styles from "./todoitem.module.css";

export default function TodoItem({ x: item, todos, setTodos }) {
  function handleDelete() {
    console.log("Delete clicked on " + item);
    setTodos(todos.filter((todo) => todo !== item));
  }
  return (
    <div className={styles.item}>
      <div className={styles.itemName}>
        {item.name}
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
    </div>
  );
}
