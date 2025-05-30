# 📝 Todo Application (Spring Boot + Docker)

A simple yet functional **Todo List** application built using **Spring Boot**, **Thymeleaf**, and **MySQL**. The entire application runs in **Docker containers** using **Docker Compose**, making it easy to set up and run locally.

---

## 🚀 Features

- ✅ Create, view, and delete todo tasks
- 📝 Add task descriptions and due dates
- 🔁 Mark tasks as complete or incomplete
- 🟢 Shows **Completed**, 🟡 **Pending**, and 🔴 **Overdue** badges based on task status and due date
- 🧠 Smart UI with **Thymeleaf** templates and **Bootstrap modals**
- 🐬 MySQL-backed persistence

---

## 🧱 Tech Stack

- **Backend**: Spring Boot (Java)
- **Frontend**: Thymeleaf + Bootstrap 5
- **Database**: MySQL 8
- **Containerization**: Docker + Docker Compose

---

## 🐳 Run with Docker

### 📁 Clone the repository

```bash
git clone https://github.com/yourusername/todo-app.git
cd todo-app
```
### 🛠 Build the Spring Boot App
```bash

./mvnw clean package -DskipTests
```
Make sure this generates an executable JAR file like target/todo_app.jar.

### 📦 Start Docker Containers
```bash
docker-compose up --build
```
Once running, visit: http://localhost:8080

The app connects automatically to the MySQL container defined in the same Docker Compose file.

## ⚙️ Configuration Details
Component	Value
MySQL Image	mysql:8.0
App Image	todoapp-todo-app
DB Name	tododb
DB User	root
DB Password	root
App Port	8080
MySQL Port	3306 (or 3307 if changed)

## 📂 Project Structure
```bash

todo-app/
├── src/                     # Spring Boot source code
├── target/                  # Compiled JAR output
├── Dockerfile               # Docker image for the app
├── docker-compose.yml       # Multi-container orchestration
├── application.properties   # Spring Boot DB config
└── README.md                # Project overview
```
## 🧼 Clean Up
To stop and remove the containers:
```bash
docker-compose down
```
To also remove volumes (including the MySQL database data):
```bash
docker-compose down -v
```

## 🧠 Known Limitations / To-Do
❌ No authentication — all users share one list

📱 Not yet mobile-optimized

☁️ Not deployed to cloud yet

🌱 No REST API — only server-rendered HTML

## 📄 License
This project is licensed under the MIT License.
Feel free to use, modify, and share!

## 🙋‍♂️ Author
Built with ❤️ by Dastagir using Spring Boot and Docker.


---