# Design Patterns

## What is a Design Pattern?

Design patterns are reusable solutions to common software design problems. They provide a structured approach to solving
recurring issues in software development while ensuring scalability, maintainability, and flexibility. These patterns
are derived from Object-Oriented Programming (OOP) principles and software architecture best practices.

### Key Characteristics of Design Patterns:

- **Reusable:** They can be applied across multiple projects.
- **Lightweight:** They serve as guidelines rather than rigid implementations.
- **Scalable & Maintainable:** They help in designing robust and adaptable software.
- **Best Practices:** They provide industry-accepted solutions rather than direct plug-and-play code.

## Categories of Design Patterns

Design patterns are classified into three main categories:

### 1. Creational Patterns

These patterns focus on object creation mechanisms, ensuring flexibility and reusability. They help manage object
instantiation efficiently.

#### Common Creational Patterns:

- **Singleton Pattern:** Ensures only one instance of a class exists and provides a global access point.
- **Factory Pattern:** Hides object creation logic and delegates it to a factory class.
- **Prototype Pattern:** Creates new objects by copying existing ones.
- **Builder Pattern:** Simplifies object creation with multiple configurations.

### 2. Structural Patterns

These patterns define how objects and classes are composed to form larger structures while ensuring flexibility and
efficiency.

#### Common Structural Patterns:

- **Facade Pattern:** Simplifies complex system interactions by providing a unified interface.
- **Decorator Pattern:** Adds behavior to objects dynamically at runtime.
- **Proxy Pattern:** Controls access to another object while adding additional functionality.
- **Adapter Pattern:** Enables two incompatible interfaces to work together.
- **Bridge Pattern:** Separates abstraction from implementation to allow them to evolve independently.
- **Composite Pattern:** Treats individual objects and compositions of objects uniformly.

### 3. Behavioral Patterns

These patterns focus on how objects interact and communicate while maintaining flexibility in workflows and algorithms.

#### Common Behavioral Patterns:

- **Observer Pattern:** Allows one-to-many dependency, where observers get notified of changes in the subject.
- **Strategy Pattern:** Enables dynamic selection of algorithms at runtime.
- **Mediator Pattern:** Centralizes communication between objects to reduce direct dependencies and improve
  maintainability
- **State Pattern:** Allows an object to change its behavior when its internal state changes.
- **Memento Pattern:** Captures and restores an object's internal state without violating encapsulation.
- **Visitor Pattern:** Separates an algorithm from the object structure it operates on.
- **Iterator Pattern:** Provides a way to traverse collections without exposing internal details.

# Key Design Patterns Covered

This document explains several key design patterns, divided into **Creational**, **Structural**, and **Behavioral**
categories.

---

## Creational Patterns

### 1. Singleton Pattern

**Purpose:**  
Ensures a single instance of a class is created and globally accessible.

**Key Components:**

- **Private Static Instance:**
    - The instance is stored as a private static variable, ensuring it belongs to the class and is not directly
      accessible from outside.
- **Private Constructor:**
    - Prevents direct instantiation using the `new` keyword.
- **Public Static Method to Get Instance:**
    - Provides a controlled access point to retrieve the single instance.

**Usage Example:**
> *"Apata mulu application eka purama access karanna puluwan global instance ekaka hadagann meka use karann puluwan,
instance eka kochchr eliyata gattath eka instance ekai hedenne, ekama thama request karana hemawelema eliyata denne"*

---

### 2. Factory Pattern

**Purpose:**  
Centralizes object creation logic, thereby promoting loose coupling and encapsulation of object creation details.

**Key Components:**

- **Products:**
    - Define a common structure (usually via a product interface) with concrete products (e.g., Car classes like
      Mustang, Audi, GTR, Lambo).
- **Factory Interface:**
    - Declares the method for creating objects.
- **Concrete Factories:**
    - Implement the factory interface to create specific objects.

**Usage Example:**
> *"Meken object creation logics hide karaganna puluwan, ethakota mekedi object creation ekata wenama factory class ekak
hadagannawa."*

---

## Structural Patterns

### 3. Facade Pattern

**Purpose:**  
Provides a simplified interface to a complex system by encapsulating the complexities of its subsystems.

**Key Components:**

- **Subsystems:**
    - Represent specific functionalities of the system.
- **Facade:**
    - An interface or class that connects and simplifies interactions with the subsystems.
- **Client:**
    - Code or an application that interacts with the system via the facade.

**Usage Example:**
> *"Home Theater System: Subsystems - TV, DVD Player, and Sound System. By using a Facade, the complexity of controlling
each device is hidden, offering a simpler interface to the client."*

---

### 4. Decorator Pattern

**Purpose:**  
Dynamically enhances or modifies object behavior at runtime without altering its structure.

**Key Components:**

- **Component Interface:**
    - Defines the core operations.
- **Concrete Component:**
    - The basic implementation of the component.
- **Decorator:**
    - An abstract class that implements the component interface and holds a reference to a component.
- **Concrete Decorators:**
    - Extend the base decorator to add specific behaviors.

**Usage Example:**
> *"Messaging System: Component Interface - MessagingService, Concrete Components - SmsMessagingService,
EmailNotificationService, Decorator - MessagingDecorator, Concrete Decorators - SenderMessagingDecorator,
TimestampMessagingDecorator."*
>
> First, the messaging system sends an SMS or email. Then a sender's name is added (first decorator) followed by a
> timestamp (second decorator).

---

## Behavioral Patterns

### 5. Observer Pattern

**Purpose:**  
Establishes a one-to-many dependency so that when one object (subject) changes state, all its dependents (observers) are
notified and updated automatically.

**Key Components:**

- **Subject (Observable):**
    - Maintains a list of observers and notifies them of any state changes.
- **Observer Interface:**
    - Defines the update method that all observers must implement.
- **Concrete Subject:**
    - Implements the subject interface and manages observer registrations.
- **Concrete Observer:**
    - Implements the observer interface to receive updates.

**Usage Example:**
> *"Social Media Notification System: Subject interface - PostPublisher, Concrete Subject - SocialMediaUser, Observer
interface - Follower, Concrete Observer - FollowerImpl. When the SocialMediaUser posts, all attached Follower objects
receive a notification."*

---

### 6. Strategy Pattern

**Purpose:**  
Allows the runtime selection of different algorithms or behaviors without modifying the code that uses them.

**Key Components:**

- **Strategy:**
    - An interface or abstract class defining the algorithm or behavior.
- **Concrete Strategies:**
    - Implementations of the strategy interface.
- **Context:**
    - Holds a reference to a strategy and delegates tasks to it, allowing dynamic changes in behavior.

**Usage Example:**
> *"Travelling System: Context - Traveler, Strategy - TravelStrategy, Concrete Strategies - WalkingStrategy,
DrivingStrategy, BikingStrategy. At runtime, the travel method can be switched among walking, driving, or biking."*

---

## Architectural Patterns

In addition to the lower-level design patterns, architectural patterns address the high-level structure of a software system. They provide overarching guidelines and structures for organizing the components of an application.

### 1. Model-View-Controller (MVC)

**Purpose:**  
Separates the application into three interconnected components:
- **Model:** Manages the data and business logic.
- **View:** Represents the user interface.
- **Controller:** Handles user input and interacts with the model to update the view.

### 2. Layered Architecture

**Purpose:**  
Divides the system into layers, each with a specific responsibility. Common layers include:
- **Presentation Layer:** Handles the user interface.
- **Business Layer:** Contains the business logic.
- **Data Access Layer:** Manages data storage and retrieval.

### 3. N-tier Architecture

**Purpose:**  
Similar to layered architecture but emphasizes physical separation between tiers (e.g., client, server, database), which can be distributed across different machines.

### 4. Client-Server

**Purpose:**  
Divides the system into service providers (servers) and service consumers (clients). The server offers resources or services, while the client requests and consumes these services.

### 5. Monolithic Architecture

**Purpose:**  
A single unified software system where components are tightly interconnected. While simple to develop initially, monolithic systems can become difficult to scale and maintain as they grow.

### 6. Microservices Architecture

**Purpose:**  
Breaks down a system into smaller, independent services that communicate over well-defined APIs. This approach offers greater flexibility, scalability, and ease of deployment compared to monolithic systems.

---

## Summary

Each of these design patterns and architectural patterns serves a specific purpose:

- **Creational Patterns** manage object creation and ensure the proper use of instances.
- **Structural Patterns** simplify the relationships and interactions between classes and subsystems.
- **Behavioral Patterns** manage how objects interact and communicate with each other, ensuring that the system responds dynamically to changes.
- **Architectural Patterns** define the high-level organization and structure of an application, addressing issues like separation of concerns, scalability, and maintainability.

Feel free to extend this document with code examples in your preferred programming language or further detailed explanations for each pattern.