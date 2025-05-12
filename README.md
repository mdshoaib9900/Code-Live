# Collaborative Code Editor

A real-time collaborative code editor built with **HTML, JavaScript (CodeMirror, SockJS, STOMP)** on the frontend and **Spring Boot WebSocket** on the backend. This application allows multiple users to join a room and collaboratively edit code in real-time with language highlighting support.

---

## 🌐 Features

* 🔗 Real-time WebSocket-based code synchronization
* 📜 Support for multiple programming languages:

  * JavaScript
  * Python
  * Java
  * C++
  * C
  * C#
*  Syntax highlighting with CodeMirror
*  Join/Create collaborative rooms using unique Room IDs
* Intelligent throttling to avoid unnecessary WebSocket messages

---

## 🏗️ Tech Stack

### Frontend

* HTML, CSS
* JavaScript (Vanilla)
* CodeMirror (for code editing)
* SockJS (WebSocket polyfill)
* STOMP.js (messaging over WebSockets)

### Backend

* Spring Boot (Java)
* WebSocket support with STOMP over SockJS

---


### 🔧 Prerequisites

* Java 11 or above
* Maven or Gradle

### ⚙️ Backend Setup (Spring Boot)

1. Clone the repository and navigate to backend folder:

   ```bash
   git clone 
   cd collaborative-editor-backend
   ```
2. Build and run the Spring Boot application:

   ```bash
   ./mvnw spring-boot:run
   ```

   > The WebSocket endpoint will be available at `http://localhost:8080/editor-websocket`

### 💻 Frontend Setup

1. Open `index.html` in a browser
2. Enter a room ID or create a new one
3. Start collaborating in real-time!

---

## 🔄 Room Management

* **Create Room**: Generates a random alphanumeric Room ID
* **Join Room**: Enter an existing Room ID to join others in real-time editing

---


## 💡 Future Enhancements

* User presence indicators
* Cursor sync & selections
* Chat integration
* Authentication & room access control

---

## 🧑‍💻 Author

**\[Mohammed shoaib]**
Feel free to contribute or suggest improvements!

---

