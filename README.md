# Workflow Management & API System

A backend-driven workflow management platform built using Java, Spring Boot, and MySQL that enables workflow creation, approval management, task tracking, and secure role-based operations through REST APIs.

## 🚀 Features

- Developed **15+ REST APIs** for:
  - Workflow creation
  - Task assignment
  - Status updates
  - Approval/rejection processes
  - Workflow tracking

- Implemented **Role-Based Access Control (RBAC)**:
  - Admin
  - User
  - Approver

- Designed a **normalized relational database schema** with:
  - Foreign keys
  - Entity relationships
  - Data consistency constraints

- Optimized backend performance using:
  - SQL joins
  - Indexing
  - Efficient query design

- Built secure request handling with:
  - Authorization checks
  - Request-level validation
  - Structured API responses

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **API Testing:** Postman
- **Build Tool:** Maven
- **ORM:** Spring Data JPA / Hibernate

---

## 📂 Project Architecture

```bash
backend-api-system/
│── src/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   ├── security/
│   └── config/
│
│── resources/
│   ├── application.properties
│
│── pom.xml
│── README.md
```

---

## ⚙️ Core Modules

### 1. Workflow Management
- Create and manage workflows
- Update workflow status
- Track workflow progress

### 2. Approval System
- Multi-role approval handling
- Approve/reject requests
- Maintain approval history

### 3. User & Role Management
- Role-specific access permissions
- Secure endpoint authorization
- Request-level access validation

### 4. Database Management
- Relational schema design
- Foreign key relationships
- Query optimization for faster retrieval

---

## 🔐 Security Features

- Role-based endpoint protection
- Authorization validation
- Structured exception handling
- Secure API request flow

---

## 📊 Database Design

The project uses a normalized MySQL relational schema to ensure:

- Data consistency
- Reduced redundancy
- Scalable workflow relationships
- Efficient transactional operations

---

## ▶️ How to Run

### Clone Repository

```bash
git clone https://github.com/pujitha-mule/backend-api-system.git
```

### Navigate to Project

```bash
cd backend-api-system
```

### Configure Database

Update `application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/workflow_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Run Application

```bash
mvn spring-boot:run
```

---

## 📬 Sample API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/workflows` | Create workflow |
| GET | `/api/workflows/{id}` | Get workflow details |
| PUT | `/api/workflows/{id}` | Update workflow |
| POST | `/api/approvals` | Approve/Reject request |
| GET | `/api/tasks` | Fetch assigned tasks |

---

## 📈 Key Highlights

- Built scalable backend architecture using Spring Boot
- Developed secure RESTful services with RBAC
- Improved query efficiency through indexing and joins
- Maintained modular and clean layered architecture
- Designed production-style workflow handling logic

---

## 👩‍💻 Author

**Pujitha Mule**

- GitHub: https://github.com/pujitha-mule/backend-api-system
