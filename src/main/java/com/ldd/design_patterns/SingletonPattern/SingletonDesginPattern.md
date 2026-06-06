# Singleton Pattern

## Problem Statement

A logging system is required across the application. Multiple logger objects should not be created 
because it wastes memory and causes inconsistent logging behavior.

---

## What Problem Exists?

Different parts of the application can create separate logger instances.

```java
Logger logger1 = new Logger();
Logger logger2 = new Logger();
```

Multiple objects exist for something that should be unique.

---

## Why Normal Code Fails?

Normal object creation using the `new` keyword creates a fresh instance every time.

### Problems

* Memory wastage
* Inconsistent state across the application
* Difficult resource management
* No centralized control

---

## How Singleton Solves It?

Singleton restricts object creation to a single instance and provides a global access point to
that instance.

### Benefits

* Exactly one object exists
* Controlled access to the object
* Reduced memory usage
* Consistent application state

---

## Real-World Examples

* Logger
* Cache Manager
* Configuration Manager
* Database Connection Pool
* Application Settings Manager

---

## UML Understanding

```text
+----------------+
|   Singleton    |
+----------------+
| - instance     |
+----------------+
| +getInstance() |
+----------------+
```

### Explanation

| Component             | Description                                 |
| --------------------- | ------------------------------------------- |
| `instance`            | Stores the single object of the class       |
| `private constructor` | Prevents object creation using `new`        |
| `getInstance()`       | Provides global access to the single object |

---

## Key Interview Points

### Why is the constructor private?

To prevent external classes from creating objects using:

```java
Singleton obj = new Singleton();
```

---

### Is Singleton thread-safe?

Not always.

For multi-threaded applications, use:

* Synchronized Singleton
* Double Checked Locking
* Bill Pugh Singleton
* Enum Singleton

---

### When should Singleton be used?

When exactly one object is needed throughout the application lifecycle.

Examples:

* Logging
* Configuration Management
* Caching
* Database Connection Pools


### Does Singleton need synchronization? 
* If the application is single-threaded, synchronization is not required. 
* In a multi-threaded environment, synchronization or another thread-safe approach 
* (Double Checked Locking, Bill Pugh Singleton, or Enum Singleton) is necessary to ensure 
* that only one instance is created.