# Hotel Rating System

## 1. Project Overview

The **Hotel Rating System** is a Java-based backend application developed using Spring Boot and Microservices Architecture.

The application is designed to manage users, hotel information, and hotel ratings through independent microservices. Each service is responsible for a specific functionality, making the application modular, scalable, and easier to maintain.

The project demonstrates the practical implementation of microservices architecture, service discovery, REST API communication, and database integration.

## 2. Key Features

- **User Management:** Manage user information and user-related operations.
- **Hotel Management:** Maintain hotel details and information.
- **Rating Management:** Manage ratings associated with users and hotels.
- **Service Discovery:** Register and discover microservices using Netflix Eureka.
- **REST API Communication:** Enable communication between different services.
- **Database Integration:** Store and manage application data using H2 Database.
- **Independent Services:** Each microservice operates as a separate application.

## 3. Technologies Used

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| Spring Boot | Backend Development |
| Spring Cloud | Microservices Development |
| Spring Data JPA | Database Operations |
| Hibernate | ORM Framework |
| H2 Database | Database Management |
| Netflix Eureka | Service Discovery |
| REST API | Communication Between Services |
| Maven | Dependency Management |
| Postman | API Testing |
| Eclipse IDE | Development Environment |

## 4. Microservices Architecture

The application consists of four independent services:

### 1. UserService
- Manages user-related information.
- Handles user data operations.
- Connects with other services to retrieve related information.

### 2. HotelService
- Manages hotel information.
- Provides hotel-related REST APIs.
- Maintains hotel records.

### 3. RatingService
- Manages hotel ratings.
- Maintains the relationship between users, hotels, and ratings.
- Provides rating-related information to other services.

### 4. ServiceRegistry
- Implements service discovery using Netflix Eureka.
- Allows microservices to register themselves.
- Helps services discover and communicate with one another.

## 5. Project Architecture

The application follows a microservices-based architecture in which each service performs a specific responsibility.

**Architecture Flow:**

```text
                  Client / Postman
                         |
                         |
              -----------------------
              |                     |
          UserService          HotelService
              |                     |
              ---------   -----------
                       |
                 RatingService
                       |
                ServiceRegistry
                  (Eureka)
```

*Note: This is a conceptual representation of the services and their responsibilities.*

## 6. Database

The project uses **H2 Database** with Spring Data JPA for database operations.

- H2 Database provides lightweight database support.
- Spring Data JPA simplifies database interactions.
- Hibernate handles object-relational mapping.
- Each service manages its relevant data.

## 7. Project Structure

```text
Hotel_Rating_System/
│
├── UserService/
│
├── HotelService/
│
├── RatingService/
│
└── ServiceRegistry/
```

Each service contains its own application configuration, source code, and dependencies.

## 8. How to Run the Project

Follow these steps to run the application locally:

1. Clone the repository:

   ```bash
   git clone https://github.com/Nilavrodas31/Hotel_Rating_System.git
   ```

2. Open the project in Eclipse IDE.

3. Import all four services as separate Maven projects.

4. Configure the application properties for each service.

5. Start the ServiceRegistry application first.

6. Start the UserService, HotelService, and RatingService applications.

7. Verify the registered services through the Eureka Dashboard.

8. Use Postman to test the available REST API endpoints.

## 9. Learning Outcomes

Through this project, I gained practical experience in:

- Understanding microservices architecture.
- Developing RESTful web services using Spring Boot.
- Implementing service discovery with Netflix Eureka.
- Working with Spring Data JPA and Hibernate.
- Integrating H2 Database.
- Understanding communication between independent microservices.
- Testing REST APIs using Postman.
- Organizing backend applications into independent services.

## 10. Future Enhancements

- Implement centralized API Gateway.
- Introduce centralized configuration management.
- Implement authentication and authorization.
- Add centralized logging and monitoring.
- Integrate a production-ready database.

## 11. Author

**Nilavro Das**

GitHub: [Nilavrodas31](https://github.com/Nilavrodas31)

**Project Repository:**  
[Hotel Rating System](https://github.com/Nilavrodas31/Hotel_Rating_System)
