import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

const App = () => {
  const [count, setCount] = useState(1);

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello! You've increased the counter!");
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = () => {
    alert('I was clicked');
  };

  return (
    <div style={{ margin: '30px', fontFamily: 'Arial' }}>
      <h1>{count}</h1>
      <button onClick={increment}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome('Welcome!')}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>

      <CurrencyConvertor />
    </div>
  );
};

export default App;
