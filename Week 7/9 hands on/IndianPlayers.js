import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'];

  const [first, second, third, fourth, fifth, sixth] = allPlayers;

  const oddPlayers = [first, third, fifth];
  const evenPlayers = [second, fourth, sixth];

  const T20Players = [
    'Mr. First Player',
    'Mr. Second Player',
    'Mr. Third Player',
  ];
  const RanjiPlayers = [
    'Mr. Fourth Player',
    'Mr. Fifth Player',
    'Mr. Sixth Player',
  ];

  const mergedPlayers = [...T20Players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First : {oddPlayers[0]}</li>
        <li>Third : {oddPlayers[1]}</li>
        <li>Fifth : {oddPlayers[2]}</li>
      </ul>

      <hr />

      <h2>Even Players</h2>
      <ul>
        <li>Second : {evenPlayers[0]}</li>
        <li>Fourth : {evenPlayers[1]}</li>
        <li>Sixth : {evenPlayers[2]}</li>
      </ul>

      <hr />

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
