import React from "react";

function BookDetails() {
  const books = [
    { name: "Master React", price: 670 },
    { name: "Deep Dive into Angular 11", price: 800 },
    { name: "Mongo Essentials", price: 450 },
  ];

  return (
    <div style={{ borderLeft: "4px solid green", paddingLeft: 20 }}>
      <h2>Book Details</h2>
      {books.length ? (
        books.map((book, index) => (
          <div key={index}>
            <strong>{book.name}</strong>
            <p>{book.price}</p>
          </div>
        ))
      ) : (
        <p>No Books Available</p>
      )}
    </div>
  );
}

export default BookDetails;
