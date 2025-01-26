
##############################################################
                React 
##############################################################


Q°?  Incrementer un conteur -------------------------------


import React from 'react';
import { useState } from 'react';

export function App(props) {
  const [count, setCount] = useState(0);

    
  function add() {
    setCount(count + 1);
  }

  function retire() {
    setCount(count - 1);
  }

  return (
    <div className="App">
      <h1>{count}</h1>
      <h2>Start editing to see some magic happen!</h2>
      <button onClick={() => add()}>Increment</button>
      <button onClick={() => retire()}>Decrement</button>
    </div>
  );
}


Q°?  Incrementer / Decrementer un conteur Version 2 (Optimale)-------------------------------


import React from 'react';
import { useState } from 'react';

export function App(props) {
  const [count, setCount] = useState(0);


  return (
    <div className='App'>
      <h1>{count}</h1>
      <h2>Start editing to see some magic happen!</h2>
      <button onClick={() => setCount(count+1)}>Increment</button>
      <button onClick={() => setCount(count-1)}>Decrement</button>
    </div>
  );
}






Q°? Incrementer / Decrementer un conteur Versions useState et useReducer -------------------------------

import { useReducer, useState } from "react";

export default function App() {
  const [count, setCount] = useState(0);
  const [state, dispatch] = useReducer(reducer, 0);

  function reducer(state, action) {
    if (action.type == "Increment") {
      return state + 1;
      // Ou bien return state + action.payload;
    }

    if (action.type == "Decrement") {
      return state - action.payload;
    }
  }

  return (
    <div className="App">
      <h1>{count}</h1>
      <h2>Start editing to see some magic happen!</h2>
      <button onClick={() => setCount(count + 1)}>Increment</button>
      <button onClick={() => setCount(count - 1)}>Decrement</button>
      <p>-----------</p>

      <button onClick={() => dispatch({ type: "Increment", payload: 1 })}>
        Increment
      </button>
      <button onClick={() => dispatch({ type: "Decrement", payload: 1 })}>
        Decrement
      </button>
      <h1>{state}</h1>
    </div>
  );
}
