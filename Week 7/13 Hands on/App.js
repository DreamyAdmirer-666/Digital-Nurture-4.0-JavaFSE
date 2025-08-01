import React from "react";
import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";

function App() {
  const showCourses = true;
  const showBooks = true;
  const showBlogs = true;

  return (
    <div style={{ display: "flex", justifyContent: "space-around", marginTop: 40 }}>
      {showCourses && <CourseDetails />}
      {showBooks ? <BookDetails /> : <p>No books available</p>}
      {(() => {
        if (showBlogs) return <BlogDetails />;
        else return <p>No blogs found</p>;
      })()}
    </div>
  );
}

export default App;
