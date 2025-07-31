import React from 'react';
import officeImage1 from './pictures/Office Space.jpg';
import officeImage2 from './pictures/Office Space 2.jpg';
import officeImage3 from './pictures/Office Space 3.jpg';

const App = () => {
  const officeSpaces = [
    {
      name: 'DBS',
      rent: 50000,
      address: 'Chennai',
      image: officeImage1,
    },
    {
      name: 'WeWork',
      rent: 70000,
      address: 'Bangalore',
      image: officeImage2,
    },
    {
      name: 'SmartWorks',
      rent: 45000,
      address: 'Hyderabad',
      image: officeImage3,
    },
  ];

  return (
    <div style={{ margin: '30px', fontFamily: 'Arial' }}>
      <h1>Office Space, at Affordable Range</h1>

      {officeSpaces.map((office, index) => (
        <div key={index} style={{ marginBottom: '40px' }}>
          <img
            src={office.image}
            alt={office.name}
            width="200"
            height="150"
            style={{ marginBottom: '10px' }}
          />
          <h2>Name: {office.name}</h2>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green', fontWeight: 'bold' }}>
            Rent: Rs. {office.rent}
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
};

export default App;
