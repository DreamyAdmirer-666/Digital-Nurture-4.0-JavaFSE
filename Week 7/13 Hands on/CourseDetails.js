import React from "react";

function CourseDetails() {
  const courses = [
    { name: "Angular", date: "4/5/2021" },
    { name: "React", date: "6/3/20201" },
  ];

  return (
    <div style={{ borderLeft: "4px solid green", paddingLeft: 20 }}>
      <h2>Course Details</h2>
      {courses.length > 0 ? (
        courses.map((course, index) => (
          <div key={index}>
            <strong>{course.name}</strong>
            <p>{course.date}</p>
          </div>
        ))
      ) : (
        <p>No Courses</p>
      )}
    </div>
  );
}

export default CourseDetails;
