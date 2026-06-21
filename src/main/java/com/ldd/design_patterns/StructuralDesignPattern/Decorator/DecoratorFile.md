# Decorator Design Pattern

## Definition

The **Decorator Pattern** is a structural design pattern that allows behavior to be added to an object dynamically without modifying its existing code.

---

## Intent

Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

---

## Problem Statement

Suppose you have a `Coffee` class and want to support:

* Coffee + Milk
* Coffee + Sugar
* Coffee + Milk + Sugar
* Coffee + Whipped Cream
* Coffee + Milk + Sugar + Cream

Creating subclasses for every combination results in a large number of classes:

```text
Coffee
MilkCoffee
SugarCoffee
MilkSugarCoffee
CreamCoffee
MilkCreamCoffee
SugarCreamCoffee
MilkSugarCreamCoffee
...
```

This becomes difficult to maintain.

---

## Issues Solved

* Avoids subclass explosion.
* Adds functionality at runtime.
* Follows Open/Closed Principle.
* Promotes composition over inheritance.

---

## Solution Approach

Instead of creating subclasses, wrap objects inside decorator objects.

Each decorator:

1. Implements the same interface as the original object.
2. Stores a reference to the wrapped object.
3. Adds extra behavior before or after delegating the call.

## Structure
            Component
                ^
                |
      -------------------
      |                 |
ConcreteComponent   Decorator
                        ^
                        |
                ConcreteDecorator
```

---

## Real-World Example

### Coffee Customization

Base Coffee:

```text
₹100
```

Add Milk:

```text
₹120
```

Add Sugar:

```text
₹130
```

Instead of creating multiple subclasses, decorators wrap the coffee object and add functionality dynamically.

---

## Advantages

* Adds behavior dynamically.
* Avoids subclass explosion.
* Promotes composition over inheritance.
* Follows Open/Closed Principle.
* Flexible and reusable.

---

## Disadvantages

* Creates many small objects.
* Debugging can be harder due to multiple wrappers.
* Can increase system complexity.

---

## When To Use

* When behavior needs to be added dynamically.
* When subclassing would create too many classes.
* When you want flexible combinations of features.

Examples:

* Coffee customization
* Java I/O Streams
* Logging wrappers
* Security wrappers
* Compression wrappers

---

## When NOT To Use

* When behavior is fixed and won't change.
* When object wrapping would make the design overly complex.
* When simple inheritance is sufficient.

---

## Java API Example

Decorator is heavily used in Java I/O.

```java
InputStream input =
    new BufferedInputStream(
        new FileInputStream("data.txt"));
```

Here:

* FileInputStream = Concrete Component
* BufferedInputStream = Decorator

---

## Decorator vs Adapter

| Decorator         | Adapter                |
| ----------------- | ---------------------- |
| Adds behavior     | Changes interface      |
| Same interface    | Different interface    |
| Runtime extension | Compatibility solution |

---

## Decorator vs Facade

| Decorator          | Facade                   |
| ------------------ | ------------------------ |
| Adds functionality | Simplifies subsystem     |
| Wraps object       | Hides complexity         |
| Same interface     | New simplified interface |

---

## Interview Questions

### What problem does Decorator solve?

It allows functionality to be added dynamically without modifying existing classes.

### Why use Decorator instead of inheritance?

Inheritance creates many subclasses for feature combinations, while decorators compose behavior dynamically.

### What principle does Decorator promote?

Composition over Inheritance.

### Give a Java example of Decorator.

Java I/O Streams:

```java
BufferedInputStream
DataInputStream
FileInputStream
```

### How is Decorator different from Proxy?

Decorator adds behavior, while Proxy controls access to an object.

---

## One-Line Definition

Decorator Pattern dynamically adds responsibilities to an object by wrapping it inside decorator objects without modifying its original code.
