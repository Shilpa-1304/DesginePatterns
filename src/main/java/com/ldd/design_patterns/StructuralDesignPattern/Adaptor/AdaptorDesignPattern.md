# 🔌 Adapter Design Pattern (Java)

## 1. Definition

Adapter Pattern is a **Structural Design Pattern** that allows two incompatible interfaces to work together.

It acts as a bridge between an existing class and the interface expected by the client.

The Adapter converts the interface of one class into another interface that the client expects.

---

## 2. Intent

* Enable incompatible interfaces to work together.
* Reuse existing classes without modifying them.
* Integrate third-party libraries into existing systems.
* Decouple client code from implementation details.

---

## 3. Problem Statement

Suppose an application expects:

```java
void pay(double amount);
```

But a third-party payment gateway provides:

```java
void makePayment(double amount);
```

The application cannot directly use the gateway because method signatures differ.

### Problems

* Incompatible interfaces.
* Existing code cannot be changed.
* Third-party code cannot be modified.
* Integration becomes difficult.

---

## 4. Issues Solved by Adapter Pattern

Adapter Pattern helps to:

* Reuse legacy systems.
* Integrate external libraries.
* Avoid modifying existing code.
* Reduce code duplication.
* Improve maintainability.

---

## 5. Solution Approach

Create an Adapter class.

The Adapter:

1. Implements the interface expected by the client.
2. Internally calls the existing class.
3. Converts requests from one format to another.

Example:

```text
Client
   |
   v
Target Interface
   ^
   |
Adapter
   |
   v
Adaptee
```

---

## 6. Key Components

### Target

Interface expected by the client.

### Adaptee

Existing class with incompatible interface.

### Adapter

Converts Target calls into Adaptee calls.

### Client

Uses Target interface.

---

## 7. Structure (Conceptual Flow)

```text
Client
   |
   v
Target Interface
   ^
   |
Adapter
   |
   v
Adaptee
```

Flow:

1. Client calls Target.
2. Adapter receives request.
3. Adapter translates request.
4. Adaptee executes operation.
5. Result returned to client.

---

## 8. Advantages

* Reuse existing code.
* Promotes loose coupling.
* Improves maintainability.
* Supports Open-Closed Principle.
* Integrates legacy systems easily.

---

## 9. Disadvantages

* Additional layer of abstraction.
* More classes to maintain.
* Can increase complexity if overused.

---

## 10. When To Use

Use Adapter Pattern when:

* Existing interfaces are incompatible.
* Third-party libraries must be integrated.
* Legacy systems need to be reused.
* Source code cannot be modified.

Examples:

* Payment Gateway Integration
* Legacy SOAP Service Integration
* Database Driver Adapters
* External API Integration

---

## 11. When NOT To Use

Avoid Adapter Pattern when:

* Interfaces are already compatible.
* Direct implementation is simpler.
* No legacy or third-party integration exists.

---

## 12. Interview Questions

### Basic Questions

1. What is Adapter Pattern?
2. Why do we use Adapter Pattern?
3. What problem does Adapter solve?

### Intermediate Questions

4. What are Target and Adaptee?
5. How does Adapter promote reusability?
6. Real-world use cases of Adapter Pattern?

### Advanced Questions

7. Adapter vs Facade?
8. Adapter vs Decorator?
9. Object Adapter vs Class Adapter?
10. How is Adapter used in Spring?

---

## 13. One-Line Definition

Adapter Pattern converts the interface of an existing class into another interface expected by the client, allowing incompatible classes to work together.
