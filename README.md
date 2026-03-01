# 🚀 Spring & Spring MVC Practice Projects

This repository contains multiple Spring Core and Spring MVC practice projects developed to understand the internal working of the Spring Framework step-by-step — starting from basic IOC concepts to full MVC + Database integration.

The projects are arranged in a progressive learning order.

---

# 📚 Learning Progression (Project Order)

The projects are structured in the following order to reflect concept evolution:

1. SpringProject_Demo  
2. SpringProject_DepedecnyEnjection  
3. SpringProject_application_context  
4. SpringProject_Autowire  
5. SpringProject_Annotation  
6. SpringProject_Annotationconf  
7. SpringProject_Projectdb  
8. SpringMVC_Demo  
9. Spring_MVC_Studentdb  
10. Spring_MVC_Studentdb1  

---

# 📁 Detailed Project Explanation

---

## 1️⃣ SpringProject_Demo

### Concept:
- Introduction to Spring Core
- IOC (Inversion of Control)
- XML-based configuration
- Bean creation & lifecycle

### What I Practiced:
- Creating beans in XML
- Loading Spring container
- Getting bean using ApplicationContext

---

## 2️⃣ SpringProject_DepedecnyEnjection

### Concept:
- Dependency Injection (DI)
- Loose Coupling
- Constructor Injection
- Setter Injection

### What I Practiced:
- How Spring injects dependencies
- Difference between tight & loose coupling
- Practical DI implementation

---

## 3️⃣ SpringProject_application_context

### Concept:
- ApplicationContext vs BeanFactory
- Spring container initialization
- Bean scopes (singleton, prototype)

### What I Practiced:
- How Spring container works internally
- Eager vs Lazy loading
- Scope management

---

## 4️⃣ SpringProject_Autowire

### Concept:
- Autowiring in Spring
- @Autowired
- Constructor Injection (recommended)
- Field Injection
- Setter Injection

### What I Practiced:
- Automatic dependency resolution
- Qualifier usage
- Best practices in DI

---

## 5️⃣ SpringProject_Annotation

### Concept:
- Annotation-based configuration
- @Component
- @Service
- @Repository
- @Controller
- Component Scanning

### What I Practiced:
- Eliminating XML configuration
- Using stereotype annotations
- Clean architecture setup

---

## 6️⃣ SpringProject_Annotationconf

### Concept:
- Java-based configuration
- @Configuration
- @Bean
- Pure Java configuration (No XML)

### What I Practiced:
- Replacing XML with Java config
- Bean creation via @Bean
- Clean project setup

---

## 7️⃣ SpringProject_Projectdb

### Concept:
- Spring with Database
- JDBC Template
- DAO Layer
- CRUD operations

### What I Practiced:
- Connecting Spring to MySQL
- Writing DAO classes
- Performing Insert, Update, Delete, Fetch operations

---

## 8️⃣ SpringMVC_Demo

### Concept:
- Spring MVC Architecture
- DispatcherServlet
- Controller
- View Resolver
- JSP Integration

### What I Practiced:
- MVC request flow
- Handling HTTP requests
- Returning views from controller

---

## 9️⃣ Spring_MVC_Studentdb

### Concept:
- Spring MVC + Database Integration
- Form handling
- Model binding
- CRUD operations

### What I Practiced:
- Controller → Service → DAO flow
- Database-driven MVC application
- Data binding with forms

---

## 🔟 Spring_MVC_Studentdb1

### Concept:
- Advanced MVC structure
- Improved project layering
- Enhanced database interaction
- Validation & Data Binding

### What I Practiced:
- Cleaner MVC architecture
- Better separation of concerns
- Real-time style project structuring

---

# 🛠️ Tech Stack Used

- Java
- Spring Core
- Spring MVC
- JDBC Template
- Maven
- JSP
- Servlet
- MySQL
- Apache Tomcat
- Eclipse IDE

---

# ⚙️ Prerequisites

Before running the projects, make sure you have:

- Java 8 or above
- Maven installed
- Apache Tomcat Server
- MySQL (for database projects)
- Eclipse / IntelliJ IDEA

---

# ▶️ How to Run the Projects

## 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/your-repository-name.git

---

## 2️⃣ Import into IDE

- Open **Eclipse** or **IntelliJ IDEA**
- Choose: `Import → Existing Maven Project`
- Select the project folder

---

## 3️⃣ Configure Tomcat

- Add **Apache Tomcat** in your IDE
- Configure server runtime
- Deploy the required project

---

## 4️⃣ Run on Server

- Right-click project → **Run on Server**
- Open in browser: http://localhost:8080/project-name/


---

If you found this repository useful, feel free to give it a ⭐  
It motivates me to continue improving backend projects.
