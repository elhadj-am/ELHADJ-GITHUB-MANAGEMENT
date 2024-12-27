import styles from "./footer.module.css";
export default function Footer({ completedTodos, totalTodos }) {
  return (
    <div className={styles.footer}>
      <span className={styles.itemFooter}>
        Completed Todos : {completedTodos}
      </span>
      <span className={styles.itemFooter}>total Todos : {totalTodos}</span>
    </div>
  );
}
