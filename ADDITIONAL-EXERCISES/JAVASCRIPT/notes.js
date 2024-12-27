### LOOPING OBJECT LIST AND CHANGING DATA 

let todos = [
  { name: 'lunch', done: false },
  { name: 'play', done: true },
  { name: 'dinner', done: false },
];

let varName = 'dinner';

const newTodos = todos.map(item => item.name === varName ? { ...item, done: !item.done } : item
);
console.log(newTodos);


