# CLOUD COUNSELAGE Project

## Overview
The **CLOUD COUNSELAGE Project** is a Java-based application designed to [briefly describe the project purpose — e.g., automate onboarding, manage data, etc.].  
It follows a **client–server architecture** where the client collects user input, and the server processes, stores, and responds with relevant data.

## Features
- Collects user details via a client interface
- Processes and validates input data
- Generates unique tracking/UTM links
- Stores data securely in a MySQL database
- Sends automated email notifications
- Centralized and scalable architecture

Procedure:
  Add Libraries-
      Go to File → Project Structure → Libraries and add the JARs from the lib folder.
  Run Server-
      Start Server.java first.
  Run Client-
      Run Client.java, enter details, and verify server receives them.

File Structure:
- lib/ # External JAR dependencies
  - activation-1.1.1.jar
  - jakarta.mail-1.6.7-javadoc.jar
  - javax.mail-1.6.2.jar
- Client.java # Client program
- Server.java # Server program
- EmailSender.java # Email sending utility


