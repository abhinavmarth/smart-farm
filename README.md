
# 🌾 SmartFarm Backend - Microservices Based Farming System

A real-world inspired microservices-based backend system to manage smart agriculture solutions such as crop monitoring, sensor data, inventory, orders, and user management.

---

## 🧩 Microservices Structure

```

smartfarm-backend/
├── api-gateway/
├── eureka-server/
├── user-service/
├── crop-service/
├── inventory-service/
├── order-service/
├── crop-analysis-service/
├── sensor-service/
└── notification-service/

````

---

## 📦 Tech Stack

| Layer             | Technologies                              |
|------------------|--------------------------------------------|
| Backend          | Java 17+, Spring Boot 3.5.4                |
| Microservices    | Spring Cloud, Spring Data JPA              |
| API Gateway      | Spring Cloud Gateway                       |
| Service Registry | Eureka Server                              |
| Database         | MySQL                                      |
| Build Tool       | Maven                                      |
| Configuration    | `application.properties`                   |

---

## 🚀 How to Run

### 1. **Start Eureka Server**
```bash
cd eureka-server
mvn spring-boot:run
````

### 2. **Start API Gateway**

```bash
cd api-gateway
mvn spring-boot:run
```

### 3. **Start Each Microservice (User, Crop, Inventory, etc.)**

For each service:

```bash
cd <service-name>
mvn spring-boot:run
```

> ⚠️ Make sure each service uses the correct `server.port` and `eureka.client.service-url` in its `application.properties`.

---

## 📚 Features

* 👥 **User Management**: CRUD for farmers and admins
* 🌾 **Crop Management**: Add/view crops and schedules
* 📦 **Inventory Service**: Tracks stock and tools
* 🛒 **Order Service**: Handles orders and payments
* 📈 **Crop Analysis**: Predicts crop health 
* 📡 **Sensor Service**: Ingests real-time field data
* 🔔 **Notification Service**: Sends alerts 
* 🔍 **Service Discovery**: Eureka-based microservice registry
* 🌐 **API Gateway**: Routes all external calls

---

## 🔐 Environment Configuration

Each microservice has an `application.properties` file for:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/<db_name>
spring.datasource.username=root
spring.datasource.password=yourpassword

eureka.client.service-url.defaultZone=http://localhost:8761/eureka
```

---

## 💡 Contributing

1. Fork the repo
2. Create your branch (`git checkout -b feature/xyz`)
3. Commit changes (`git commit -m 'Add xyz'`)
4. Push to branch (`git push origin feature/xyz`)
5. Open a pull request

---

