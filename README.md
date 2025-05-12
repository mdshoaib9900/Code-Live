🚀 Collaborative Code Editor
A real-time collaborative code editor that allows multiple users to join a room and write code together. Built with:

Frontend: HTML, JavaScript, CodeMirror

Backend: Spring Boot, WebSocket (STOMP over SockJS)

🔧 Features
🔗 Room-based collaboration (create or join a room)

✍️ Real-time code syncing using WebSockets

🌐 Language mode switching: JavaScript, Python, Java, C++, C, C#

🖥️ Syntax highlighting via CodeMirror


🛠️ How to Run
Backend (Spring Boot)
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/Code-Live.git
cd Code-Live
Open the project in your preferred IDE (IntelliJ, VS Code, Eclipse).

Make sure editor-websocket endpoint is configured in a Spring Boot WebSocket controller.

Run the Spring Boot application:

bash
Copy
Edit
./mvnw spring-boot:run
Backend runs at http://localhost:8080

Frontend (HTML + JavaScript)
Open index.html in any browser.

Click "Create Room" or enter a Room ID and click "Join Room".

Start editing code and see changes reflected in real-time for all users in the same room.

📂 Project Structure
bash
Copy
Edit
Code-Live/
├── backend/           # Spring Boot server
│   └── WebSocketConfig.java, EditorController.java
├── frontend/
│   └── index.html     # The HTML/JS CodeMirror-based editor
└── README.md
🌐 WebSocket Endpoints
ws://localhost:8080/editor-websocket — SockJS endpoint

Subscribe: /topic/editor/{roomId}

Send: /app/update/{roomId}

📦 Dependencies Used
Frontend:
CodeMirror

SockJS

STOMP.js

Backend:
Spring Boot

Spring WebSocket

STOMP support

✅ To-Do / Improvements
 Add authentication

 Shareable room links

 File saving/export

 Chat feature

📃 License
MIT License. Feel free to fork and contribute!

