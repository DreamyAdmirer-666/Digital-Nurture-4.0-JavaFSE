import './Posts.css';
import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postObjects = data.map(item => new Post(item.id, item.title, item.body));
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        this.setState({ hasError: true });
        console.error('Error loading posts:', error);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred while rendering the component.");
    console.error("Error caught in componentDidCatch:", error, info);
  }

  render() {
    if (this.state.hasError) {
      return <h2>Something went wrong while fetching posts.</h2>;
    }

    return (
  <div className="posts-container">
    <h1>Posts</h1>
    {this.state.posts.map(post => (
      <div key={post.id} className="post-box">
        <h3>{post.title}</h3>
        <p>{post.body}</p>
        <hr />
      </div>
    ))}
  </div>
);

  }
}

export default Posts;
