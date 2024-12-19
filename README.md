# Role-Based Authentication App in Spring Boot

A Spring Boot application that implements **role-based authentication** with distinct user roles, including **User** and **Admin** logins. The app demonstrates secure access control based on user roles using **Spring Security**.

## Features
- **User Authentication**: Supports login for both **User** and **Admin** roles with separate access control.
- **Role-Based Access Control**: Admin users have access to additional functionality (e.g., managing users), while regular users can only access basic features.
- **JWT Authentication**: Secure token-based authentication for both User and Admin logins.
- **Spring Security Integration**: Used to configure role-based permissions and restrict access to certain endpoints based on the user's role.

## Tech Stack
- **Backend**: Spring Boot, Spring Security, JWT
- **Database**: MySQL (for storing user credentials and roles)
- **ORM**: JPA (Java Persistence API)
- **Tools**: Postman (for API testing)

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/role-based-authentication-app.git
