import styles from "./todoitem.module.css";

export default function TodoItem({ x }) {
  return (
    <div className={styles.item}>
      <div className={styles.itemName}>
        {x}
        <span>
          <button className={styles.deleteButton}>x</button>
        </span>
      </div>

      <hr className={styles.line} />
    </div>
  );
}
