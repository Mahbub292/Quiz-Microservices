# Quiz-Microservices

A microservices-based **Quiz Test System** built with **Spring Boot, Spring Cloud, PostgreSQL, and Eureka**.

## 🚀 Project Overview

This project consists of four microservices:

1. **QuizService** 🎯

   - Stores **quiz ID and title** in PostgreSQL.
   - Provides APIs to manage quizzes.

2. **QuestionService** ❓

   - Stores **question ID, question text, and quiz ID** in PostgreSQL.
   - Provides APIs to manage quiz questions.

3. **GatewayService** 🌐

   - Acts as a **gateway** to route requests to the appropriate microservice.
   - Uses **Spring Cloud Gateway** for API management.

4. **RegistryService** 📡

   - Eureka **Service Registry** for managing microservice discovery.
   - Ensures communication between microservices.

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot, Spring Cloud
- **API Gateway**: Spring Cloud Gateway
- **Service Discovery**: Eureka Server
- **Database**: PostgreSQL
- **Build Tool**: Maven

---

## 📁 Project Structure

```
Quiz-Test-Microservices-Architecture/
│── quizService/          # Quiz Management Microservice
│── questionService/      # Question Management Microservice
│── apigatewayService/    # API Gateway
│── registryService/      # Eureka Service Registry
│── README.md             # Project Documentation
│── .gitignore            # Git Ignore File

```

---

## ⚙️ How to Run

### 1️⃣ Start the Eureka Registry Service

```sh
cd registryService
mvn spring-boot:run
```

### 2️⃣ Start the API Gateway

```sh
cd apigatewayService
mvn spring-boot:run
```

### 3️⃣ Start the Microservices

Run each service in separate terminals:

```sh
cd quizService
mvn spring-boot:run
```

```sh
cd questionService
mvn spring-boot:run
```

### 4️⃣ Verify Everything is Running

- Open **Eureka Dashboard**: [`http://localhost:8761`](http://localhost:8761)
- API Gateway should be accessible at ``
- Test APIs using **Postman**

---

## 📌 API Endpoints

### QuizService

| Method | Endpoint   | Description       |
| ------ | ---------- | ----------------- |
| GET    | `/quiz`    | Get all quizzes   |
| POST   | `/quiz`    | Create a new quiz |

### QuestionService

| Method | Endpoint                  | Description              |
| ------ | ------------------------- | ------------------------ |
| GET    | `/question/quiz/{quizId}` | Get questions by quiz ID |
| POST   | `/questions`              | Add a question           |

### apigatewayService

- All requests should go through ``

---

## 🎯 Future Enhancements

✅ Add JWT Authentication\
✅ Implement Docker for containerization\
✅ Add Kubernetes for orchestration\
✅ Integrate a Frontend (React.js)

---

## 📜 License

This project is open-source and available under the **MIT License**.

