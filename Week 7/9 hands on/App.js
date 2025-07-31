import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  const flag = false; // true = show scores < 70, false = show odd/even and merged

  return (
    <div className="App" style={{ margin: '20px' }}>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
