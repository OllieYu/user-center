# User Center System

This project is designed to provide a comprehensive and user-friendly system that based on Spring Boot backend + React front-end full stack project, to achieve user registration, login, query, and other basic functions.

## Table of Contents
1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Installation](#installation)

## Project Overview
The User Center System is aimed at providing a starter for a backend management system. 

## Features
- User Registration
- User Authentication (Login/Logout)
- Profile Management
- Role-Based Access Control
- User Activity Logs
- API Integration

## Installation
To install and run the User Center System locally, follow these steps:

1. **Clone the Repository:**
    ```sh
    git clone https://github.com/OllieYu/user-center.git
    cd user-center
    ```

2. **Install Dependencies for frontend and backend:**
    ```sh
    cd userCenter
    npm install
    ```
3. **Run the SQL script on cloud-dentist-backend/sql to create database tables**

4. **Update Environment Variables(cloud-dentist-backend/src/main/resources/application.yml):**
    ```
    url: jdbc:mysql://localhost:3306/could-dentist
    username: root
    password: root
    ```

5. **Run the Application:**
    ```sh
    npm start
    ```

## Usage
Once the application is running, you can access it at `http://localhost:3000`.
Or use the docker file to deploy as a docker.

