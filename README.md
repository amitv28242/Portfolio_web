# Amit Verma's Portfolio Website

A modern, responsive portfolio website built with Spring Boot and modern frontend technologies.

## Features

- Responsive design that works on all devices
- Interactive UI with smooth animations
- Contact form with email notifications
- Backend API built with Spring Boot
- H2 database for storing contact form submissions

## Tech Stack

### Frontend
- HTML5
- CSS3 with modern features
- JavaScript with ES6+ features
- Font Awesome for icons

### Backend
- Java 11
- Spring Boot 2.7.0
- Spring Data JPA
- Spring Mail
- H2 Database
- Lombok

## Setup Instructions

1. Clone the repository
2. Configure email settings in `src/main/resources/application.properties`
   - Replace `your-email@gmail.com` with your Gmail address
   - Replace `your-app-password` with your Gmail app password
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
4. Open `index.html` in your web browser

## Development

### Backend Development
- The backend runs on `http://localhost:8080`
- H2 Console available at `http://localhost:8080/h2-console`
- API endpoints:
  - POST `/api/contact` - Submit contact form

### Frontend Development
- All static files are in the root directory
- `styles.css` contains all styling
- `script.js` contains all JavaScript functionality

## Contact

Amit Verma
- Email: amitv28242@gmail.com
- Phone: 8528467242
- Location: Barabanki, Uttar Pradesh
- LinkedIn: [linkedin.com/in/amitverma8528467242](https://linkedin.com/in/amitverma8528467242)
- GitHub: [github.com/amitv28242](https://github.com/amitv28242)
- LeetCode: [leetcode.com/u/Amitv28242](https://leetcode.com/u/Amitv28242/)
