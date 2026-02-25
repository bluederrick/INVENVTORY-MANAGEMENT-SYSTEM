#!/bin/bash

# --------------------------
# Go to project root
# --------------------------
cd "$(dirname "$0")/../.."  # moves from src/scripts to project root

# --------------------------
# Start MySQL container
# --------------------------
docker compose up -d db

# Wait for MySQL to initialize
sleep 10

# --------------------------
# Build Spring Boot app
# --------------------------
mvn clean package -DskipTests

# --------------------------
# Run the JAR
# --------------------------
java -jar target/InventoryManagementSystem-0.0.1-SNAPSHOT.jar