# 🏭🏭 Abstract Factory Design Pattern (Java)

## 1. Definition

Abstract Factory Pattern is a **Creational Design Pattern** that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Unlike Factory Pattern, which creates a single product, Abstract Factory creates a group of related products.

---

## 2. Intent

* Create families of related objects.
* Hide object creation logic from the client.
* Ensure compatible objects are used together.
* Promote consistency among related products.
* Decouple client code from concrete implementations.

---

## 3. Problem Statement

Suppose we are building a Cross-Platform UI Application.

For Windows:

* Windows Button
* Windows Checkbox

For Mac:

* Mac Button
* Mac Checkbox

Without Abstract Factory:

```java
Button button = new WindowsButton();
Checkbox checkbox = new MacCheckbox();
```

Problems:

* Client must know all concrete classes.
* Incompatible objects can be mixed accidentally.
* Difficult to maintain and extend.
* Violates Open-Closed Principle.

### Problems

* Tight coupling.
* Large if-else blocks.
* Platform-specific logic scattered across code.
* Difficult to add new platforms.

---

## 4. Issues Solved by Abstract Factory Pattern

Abstract Factory helps to:

* Create related objects together.
* Prevent incompatible object combinations.
* Centralize object creation.
* Improve maintainability.
* Support easy extension for new product families.

---

## 5. Solution Approach

Create:

### Abstract Products

```text
Button
Checkbox
```

### Concrete Products

```text
WindowsButton
WindowsCheckbox

MacButton
MacCheckbox
```

### Abstract Factory

```text
GUIFactory
```

### Concrete Factories

```text
WindowsFactory
MacFactory
```

Client asks the factory for products instead of creating them directly.

---

## 6. Key Components

### Abstract Product

Common interfaces for products.

Example:

```java
Button
Checkbox
```

### Concrete Product

Specific implementations.

Example:

```java
WindowsButton
MacButton
```

### Abstract Factory

Declares methods for product creation.

Example:

```java
createButton()
createCheckbox()
```

### Concrete Factory

Creates specific product families.

Example:

```java
WindowsFactory
MacFactory
```

### Client

Uses only interfaces.

---

## 7. Structure (Conceptual Flow)

```text
             Abstract Factory
                     |
        -------------------------
        |                       |
        v                       v
WindowsFactory           MacFactory
        |                       |
        v                       v
 Windows Products       Mac Products
```

Flow:

1. Client chooses factory.
2. Factory creates related products.
3. Client uses products through interfaces.
4. Client remains unaware of concrete classes.

---

## 8. Advantages

* Loose coupling.
* Ensures product compatibility.
* Easy to extend.
* Centralized object creation.
* Supports Open-Closed Principle.

---

## 9. Disadvantages

* Many classes/interfaces required.
* Increased complexity.
* Adding new product types affects all factories.
* Overkill for simple applications.

---

## 10. When To Use

Use Abstract Factory when:

* Multiple product families exist.
* Products must work together.
* Platform-specific implementations are required.
* Object creation should be hidden.

Examples:

* UI Toolkits
* Cross-platform applications
* Database Drivers
* Payment Gateways
* Cloud Provider SDKs

---

## 11. When NOT To Use

Avoid Abstract Factory when:

* Only one product exists.
* Product families do not exist.
* Simpler Factory Pattern is sufficient.
* Application complexity is low.

---

## 12. Interview Questions

### Basic Questions

1. What is Abstract Factory Pattern?
2. Why do we use Abstract Factory?

### Intermediate Questions

3. Difference between Factory and Abstract Factory?
4. What problem does Abstract Factory solve?
5. What is a product family?

### Advanced Questions

6. Abstract Factory vs Factory Method?
7. Which SOLID principles does it support?
8. Can Abstract Factory work with Singleton?
9. How does Spring use Abstract Factory?
10. What happens when a new product type is introduced?

---

## 13. One-Line Definition

Abstract Factory Pattern provides an interface for creating families of related objects without specifying their concrete classes.
