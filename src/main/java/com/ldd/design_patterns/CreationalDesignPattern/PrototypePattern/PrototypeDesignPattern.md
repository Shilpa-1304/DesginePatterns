# 🧬 Prototype Design Pattern (Java)

## 1. Definition

Prototype Pattern is a **Creational Design Pattern** that creates new objects by 
cloning an existing object instead of creating it from scratch.

The pattern allows object creation by copying a prototype instance and modifying it if necessary.

---

## 2. Intent

- Create objects by cloning existing objects.
- Improve performance by avoiding expensive object creation.
- Reduce repetitive initialization logic.
- Provide flexibility in object creation.

---

## 3. Problem Statement

Suppose we have an Employee object whose creation requires:

- Loading employee details
- Reading configuration
- Performing validations
- Connecting to external systems

Every time a new Employee object is needed:

```java
Employee employee = new Employee();
```

the entire initialization process runs again.

### Problems

- Object creation becomes expensive.
- Initialization logic gets repeated.
- Performance degrades when many similar objects are required.
- Duplicate setup code increases maintenance effort.

---

## 4. Issues Solved by Prototype Pattern

Prototype Pattern helps to:

- Avoid expensive object creation.
- Improve application performance.
- Reuse existing configured objects.
- Eliminate repetitive initialization code.
- Create multiple similar objects efficiently.

---

## 5. Solution Approach

Instead of creating new objects repeatedly:

1. Create one fully initialized object.
2. Store it as a prototype.
3. Clone the prototype whenever a new object is required.

### Example

```java
Employee employee2 = employee1.clone();
```

The cloned object contains the same data as the original object but occupies a different memory location.

---

## 6. Key Components

### Prototype

Declares the clone operation.

### Concrete Prototype

Implements the clone operation.

### Client

Uses the prototype to create cloned objects.

---

## 7. Structure (Conceptual Flow)

```text
Client
   |
   v
Prototype
   |
 clone()
   |
   v
New Object
```

### Flow

1. Create Prototype Object.
2. Client requests clone.
3. Prototype creates a copy.
4. New object is returned.

---

## 8. Advantages

- Faster object creation.
- Reduces initialization cost.
- Promotes object reuse.
- Simplifies object creation logic.
- Useful for performance-critical applications.

---

## 9. Disadvantages

- Cloning can become complex.
- Deep cloning requires additional effort.
- Circular references make cloning difficult.
- Maintaining clone methods can increase complexity.

---

## 10. When To Use

Use Prototype Pattern when:

- Object creation is expensive.
- Multiple similar objects are required.
- Database calls are involved during object creation.
- Configuration loading is costly.
- Performance optimization is important.

### Examples

- Game Characters
- Employee Templates
- Document Templates
- Configuration Objects

---

## 11. When NOT To Use

Avoid Prototype Pattern when:

- Objects are simple to create.
- Cloning logic is more complicated than creation.
- Deep-copy requirements are difficult to manage.
- Performance benefits are negligible.

---

## 12. Interview Questions

### Basic Questions

1. What is Prototype Pattern?
2. Why do we use Prototype Pattern?
3. How does cloning differ from object creation?

### Intermediate Questions

4. What is shallow copy?
5. What is deep copy?
6. What are the advantages of Prototype Pattern?
7. When would you use Prototype Pattern?

### Advanced Questions

8. Prototype vs Factory Pattern?
9. Prototype vs Builder Pattern?
10. How does Java's clone() method work?
11. Why is Object.clone() often criticized?
12. How would you implement deep cloning?
13. What issues can occur with shallow copying?

---

## 13. One-Line Definition

Prototype Pattern is a creational design pattern that creates new objects by cloning existing objects instead of creating them from scratch.