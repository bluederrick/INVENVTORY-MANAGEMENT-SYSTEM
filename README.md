API Documentation. # 📦 Inventory Management System

A comprehensive inventory management system built with Spring Boot, MySQL, and Docker. Manage products, suppliers, customers, orders, and track inventory in real-time.
---

## 🚀 Features

### Core Modules
- **Product Management** - Create, update, delete, and track products
- **Category Management** - Organize products into categories
- **Supplier Management** - Manage supplier information and relationships
- **Customer Management** - Track customer details and order history
- **Incoming Orders** - Receive stock from suppliers
- **Outgoing Orders** - Process customer orders and shipments
- **Real-time Inventory Tracking** - Automatic stock level updates



### Technical Features
- ✅ RESTful API with comprehensive endpoints
- ✅ DTO pattern for clean data transfer
- ✅ MySQL database
- ✅ Docker containerization for easy deployment
- ✅ Spring Security for authentication/Authorization
- ✅ Input validation
- ✅ Exception handling
- ✅ Swagger/OpenAPI documentation


 Base URL
http://localhost:8080/api/v1

### 📦 APP Endpoints
http://127.0.0.1:8080/api/v1/products
http://127.0.0.1:8080/api/v1/products/{id}
http://127.0.0.1:8080/api/v1/register
http://127.0.0.1:8080/api/v1/incomingorder
http://127.0.0.1:8080/api/v1/incomingorder/{id}
http://127.0.0.1:8080/api/v1/outgoingorder
http://127.0.0.1:8080/api/v1/outgoingorder/{id}
http://127.0.0.1:8080/api/v1/supplier
http://127.0.0.1:8080/api/v1/supplier/{id}
http://127.0.0.1:8080/api/v1/user
http://127.0.0.1:8080/api/v1/user/{id}



POST api/v1/register
{
  "success": true,
  "message": "User registered successfully",
  "data": {
    "id": 1,
    "username": "john_doe",
    "email": "john@example.com",
    "role": "USER"
  }
}

POST api/v1/login
response: 200 ok
{
  "success": true,
  "message": "Login successful",
  "data": {
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
    "username": "john_doe",
    "role": "ADMIN"
  }
}

GET /api/products

{
  "success": true,
  "message": "Success",
  "data": [
    {
      "id": 1,
      "name": "Laptop",
      "description": "High-performance laptop with Intel i7 processor, 16GB RAM, 512GB SSD",
      "price": 999.99,
      "quantity": 50,
      "category": {
        "id": 1,
        "name": "Electronics"
      },

      "dateCreated": "2024-02-10",
      "dateUpdated": "2024-02-15"
    },
    {
      "id": 2,
      "name": "Mechanical Keyboard",
      "description": "RGB mechanical keyboard with Cherry MX switches",
      "price": 129.99,
      "quantity": 200,
      "category": {
        "id": 1,
        "name": "Electronics"
      },
      "dateCreated": "2024-02-11",
      "dateUpdated": "2024-02-11"
    },
    {
      "id": 3,
      "name": "Wireless Mouse",
      "description": "Ergonomic wireless mouse with adjustable DPI",
      "price": 29.99,
      "quantity": 150,
      "category": {
        "id": 1,
        "name": "Electronics"
      },
      "dateCreated": "2024-02-12",
      "dateUpdated": "2024-02-12"
    },
    {
      "id": 4,
      "name": "Office Chair",
      "description": "Ergonomic office chair with lumbar support",
      "price": 249.99,
      "quantity": 30,
      "category": {
        "id": 2,
        "name": "Furniture"
      },
      "dateCreated": "2024-02-13",
      "dateUpdated": "2024-02-13"
    },
    {
      "id": 5,
      "name": "USB-C Cable",
      "description": "2-meter USB-C to USB-C cable with fast charging support",
      "price": 12.99,
      "quantity": 500,
      "category": {
        "id": 3,
        "name": "Furniture"
      },
      "dateCreated": "2024-02-14",
      "dateUpdated": "2024-02-14"
    },
    {
      "id": 6,
      "name": "Monitor Stand",
      "description": "Adjustable monitor stand with cable management",
      "price": 45.00,
      "quantity": 80,
      "category": {
        "id": 3,
        "name": "Furniture"
      },
      "dateCreated": "2024-02-15",
      "dateUpdated": "2024-02-15"
    },
    {
      "id": 7,
      "name": "Desk Lamp",
      "description": "LED desk lamp with adjustable brightness and color temperature",
      "price": 39.99,
      "quantity": 120,
      "category": {
        "id": 4,
        "name": "Furniture"
      },
      "dateCreated": "2024-02-16",
      "dateUpdated": "2024-02-16"
    },
    {
      "id": 8,
      "name": "Webcam",
      "

GET /api/v1/products/{id}
response: 200 ok
{
  "success": true,
  "message": "Success",
  "data": [
    {
      "id": 1,
      "name": "Laptop",
      "description": "High-performance laptop",
      "price": 999.99,
      "quantity": 50,
      "category": "Electronics",
      "product": "LAP-001",
      "dateCreated": "2024-02-17"
    }
    
  ]
}
POST /api/v1/products
response: 200 ok
{
  "success": true,
  "message": "Product found",
  "data": {
    "id": 1,
    "name": "Laptop",
    "description": "High-performance laptop",
    "price": 999.99,
    "quantity": 50,
    "category": "Electronics"
  }
}
PUT /api/v1/products/{id}

{
  "success": true,
  "message": "Product updated successfully",
  "data": {
    "id": 1,
    "name": "Updated Laptop Pro",
    "description": "High-performance gaming laptop with updated specs",
    "price": 1299.99,
    "quantity": 35,
    "category": {
      "id": 1,
      "name": "Electronics"
    },
    "dateCreated": "2024-02-10",
    "dateUpdated": "2024-02-17"
  }
}

DELETE /api/v1/products/{id}
{
  "success": true,
  "message": "Product deleted successfully",
  "data": null
}
GET /api/categories
{
  "success": true,
  "message": "Success",
  "data": [
    {
      "id": 1,
      "name": "Electronics",
      "description": "Electronic devices and accessories"
    },
    {
      "id": 2,
      "name": "Fashion",
      "description": "Clothing and accessories"
    }
  ]
}
POST /api/v1/categories
{
  "success": true,
  "message": "Category created successfully",
  "data": {
    "id": 1,
    "name": "Electronics",
    "description": "Electronic devices and accessories"
  }
}
PUT /api/v1/categories/{id}
GET /api/suppliers
{
  "success": true,
  "message": "Success",
  "data": [
    {
      "id": 1,
      "firstName": "John",
      "lastName": "Supply Co",
      "email": "contact@supplyCo.com",
      "phoneNumber": "+1234567890",
      "address": "123 Supplier Street",
      "role": "SUPPLIER"
    }
  ]
}
POST /api/v1/suppliers
{
  "success": true,
  "message": "Supplier created successfully",
  "data": {
    "id": 1,
    "firstName": "John",
    "lastName": "Supply Co",
    "email": "contact@supplyCo.com",
    "role": "SUPPLIER"
  }
}
PUT /api/v1/suppliers/{id}

{
  "success": true,
  "message": "Supplier updated successfully",
  "data": {
    "id": 1,
    "firstName": "John",
    "lastName": "Updated Supply Co",
    "age": 48,
    "email": "newemail@supplyco.com",
    "phoneNumber": "+1234567899",
    "address": "456 Updated Supplier Avenue, New York, NY 10001",
    "role": "SUPPLIER",
    "dateCreated": "2024-01-15",
    "dateUpdated": "2024-02-17"
  }
}
DELETE /api/v1/suppliers/{id}

Response;200 ok
GET /api/v1/incoming-orders

{
  "success": true,
  "message": "Success",
  "data": [
    {
      "id": 1,
      "supplier": {
        "id": 1,
        "firstName": "John",
        "lastName": "Supply Co",
        "email": "contact@supplyco.com",
        "phoneNumber": "+1234567890"
      },
      "product": {
        "id": 1,
        "name": "Laptop",
        
      },
      "quantityOrdered": 100,
      "unitPrice": 800.00,
      "totalPrice": 80000.00,
      "orderDate": "2024-02-17",
      "expectedDeliveryDate": "2024-02-24",
      "actualDeliveryDate": null,
      "status": "PENDING"
    },
    {
      "id": 2,
      "supplier": {
        "id": 2,
        "firstName": "Tech",
        "lastName": "Distributors Ltd",
        "email": "orders@techdist.com",
        "phoneNumber": "+9876543210"
      },
      "product": {
        "id": 3,
        "name": "Wireless Mouse",
       
      },
      "quantityOrdered": 500,
      "unitPrice": 15.50,
      "totalPrice": 7750.00,
      "orderDate": "2024-02-15",

    },
    {
      "id": 3,
      "supplier": {
        "id": 1,
        "firstName": "John",
        "lastName": "Supply Co",
        "email": "contact@supplyco.com",
        "phoneNumber": "+1234567890"
      },
      "product": {
        "id": 5,
        "name": "USB-C Cable",
      },
      "quantityOrdered": 1000,
      "unitPrice": 5.99,
      "totalPrice": 5990.00,
      "orderDate": "2024-02-16",

    },
    {
      "id": 4,
      "supplier": {
        "id": 3,
        "firstName": "Global",
        "lastName": "Electronics Inc",
        "email": "sales@globalelec.com",
        "phoneNumber": "+1122334455"
      },
      "product": {
        "id": 2,
        "name"Keyboard",
      },
      "quantityOrdered": 200,
      "unitPrice": 75.00,
      "totalPrice": 15000.00,
      "orderDate": "2024-02-10",
    
    },
    {
      "id": 5,
      "supplier": {
        "id": 2,
        "firstName": "Tech",
        "lastName": "Distributors Ltd",
        "email": "orders@techdist.com",
        "phoneNumber": "+9876543210"
      },
      "product": {
        "id": 4,
        "name": "Laptop Charger",
      },
      "quantityOrdered": 150,
      "unitPrice": 45.00,
      "totalPrice": 6750.00,
      "orderDate": "2024-02-18",
     
    }
  ]
}
GET /api/v1/incoming-orders/{id}
{
  "success": true,
  "message": "Success",
  "data": [
    {
      "id": 1,
      "supplierId": 1,
      "supplierName": "John Supply Co",
      "productId": 1,
      "productName": "Laptop",
      "quantityOrdered": 100,
      "unitPrice": 800.00,
      "totalPrice": 80000.00,
      "orderDate": "2024-02-17",
     
    }
  ]
}
```
POST /api/v1/incoming-orders
{
  "success": true,
  "message": "Incoming order created successfully",
  "data": {
    "id": 1,
    "supplierId": 1,
    "productId": 1,
    "quantityOrdered": 100,
    "totalPrice": 80000.00,
   
  }
}

GET /api/v1/users

{
"success": true,
"message": "Success",
"data": [
{
"id": 1,
"username": "john_doe",
"email": "john.doe@inventory.com",
"firstName": "John",
"lastName": "Doe",
"role": "ADMIN",
"status": "ACTIVE",
"dateCreated": "2024-01-10",
"lastLogin": "2024-02-17T09:30:00"
},
{
"id": 2,
"username": "jane_smith",
"email": "jane.smith@inventory.com",
"firstName": "Jane",
"lastName": "Smith",
"role": USER”,
"status": "ACTIVE",
"dateCreated": "2024-01-15",
"lastLogin": "2024-02-16T14:20:00"
},
{
"id": 3,
"username": "mike_manager",
"email": "mike.manager@inventory.com",
"firstName": "Mike",
"lastName": "Manager",
"role": "ADMIN",
"dateCreated": "2024-01-20",
"lastLogin": "2024-02-17T08:15:00"
},
{
"id": 4,
"username": "sarah_staff",
"email": "sarah.staff@inventory.com",
"firstName": "Sarah",
"lastName": "Johnson",
"role": “USER”,
"dateCreated": "2024-02-01",
"lastLogin": "2024-02-15T16:45:00"
},
{
"id": 5,
"username": "bob_warehouse",
"email": "bob.warehouse@inventory.com",
"firstName": "Bob",
"lastName": "Williams",
"role": “USER”,
"dateCreated": "2024-01-05",
"lastLogin": "2024-02-10T11:00:00"
}
]
}

GET /api/users/{id}
{
"success": true,
"message": "Success",
"data": [
{
"id": 2,
"username": "jane_smith",
"email": "jane.smith@inventory.com",
"firstName": "Jane",
"lastName": "Smith",
"role": "USER”,
"dateCreated": "2024-01-15",
"lastLogin": "2024-02-16T14:20:00"
},
{
"id": 4,
"username": "sarah_staff",
"email": "sarah.staff@inventory.com",
"firstName": "Sarah",
"lastName": "Johnson",
"role": "User",
"dateCreated": "2024-02-01",
"lastLogin": "2024-02-15T16:45:00"
}