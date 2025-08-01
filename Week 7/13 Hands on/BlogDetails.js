import React from "react";

function BlogDetails() {
  const blogs = [
    {
      title: "React Learning",
      author: "Stephen Biz",
      content: "Welcome to learning React!",
    },
    {
      title: "Installation",
      author: "Schwezdenier",
      content: "You can install React from npm.",
    },
  ];

  return (
    <div style={{ borderLeft: "4px solid green", paddingLeft: 20 }}>
      <h2>Blog Details</h2>
      {blogs.map((blog, index) => (
        <div key={index}>
          <strong style={{ fontSize: 20 }}>{blog.title}</strong>
          <p style={{ fontWeight: "bold" }}>{blog.author}</p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
