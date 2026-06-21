# 🎯 Strategy Design Pattern (Java)

## 1. Definition

Strategy Pattern is a **Behavioral Design Pattern** that allows us to define a family of algorithms, encapsulate each algorithm into separate classes, and make them interchangeable at runtime.

Instead of hardcoding a particular behavior inside a class, the behavior can be selected dynamically.

---

## 2. Intent

- Encapsulate algorithms into separate classes.
- Allow behavior to change at runtime.
- Remove large if-else or switch statements.
- Follow Open-Closed Principle.
- Promote composition over inheritance.

---

## 3. Problem Statement

Consider an E-Commerce application.

Users can make payments using:

- Credit Card
- UPI
- PayPal
- Net Banking

Initially, the PaymentService handles all payment methods.

Example:

```java
public class PaymentService {

    public void pay(String paymentType,
                    double amount) {

        if(paymentType.equals("UPI")) {

            System.out.println(
                    "Paid via UPI"
            );
        }
        else if(paymentType.equals("CARD")) {

            System.out.println(
                    "Paid via Card"
            );
        }
        else if(paymentType.equals("PAYPAL")) {

            System.out.println(
                    "Paid via PayPal"
            );
        }
    }
}
```

---

## 4. Without Strategy Pattern

```java
public class PaymentService {

    public void pay(String type,
                    double amount) {

        if(type.equals("UPI")) {

            // UPI Logic

        } else if(type.equals("CARD")) {

            // Card Logic

        } else if(type.equals("PAYPAL")) {

            // PayPal Logic

        } else if(type.equals("NETBANKING")) {

            // Net Banking Logic
        }
    }
}
```

---

## 5. Problems Without Strategy Pattern

### Problem 1: Large If-Else Chain

As payment methods increase:

```text
UPI
CARD
PAYPAL
NETBANKING
APPLE PAY
GOOGLE PAY
```

the if-else block keeps growing.

---

### Problem 2: Violates Open-Closed Principle

Adding a new payment method requires modifying existing code.

```java
else if(type.equals("GOOGLEPAY"))
```

Existing class changes repeatedly.

---

### Problem 3: Difficult Maintenance

Payment logic for all methods exists in one class.

```text
PaymentService
```

becomes huge.

---

### Problem 4: Hard to Test

Testing individual payment methods becomes difficult.

---

### Problem 5: Tight Coupling

PaymentService depends on all payment implementations.

---

## Why We Need Strategy Pattern

We need a design where:

```text
PaymentService
      |
      v
PaymentStrategy
      |
--------------------------
|           |            |
UPI       Card       PayPal
```

The payment method can be selected dynamically.

---

## 6. Solution Approach

Create:

### Strategy Interface

```java
PaymentStrategy
```

### Concrete Strategies

```java
UPIPayment
CardPayment
PayPalPayment
```

### Context

```java
PaymentService
```

The context delegates the payment operation to the selected strategy.

---

## 7. Key Components

### Strategy

Common interface for all algorithms.

Example:

```java
PaymentStrategy
```

---

### Concrete Strategy

Actual implementation.

Examples:

```java
UPIPayment
CardPayment
PayPalPayment
```

---

### Context

Uses a strategy object.

Example:

```java
PaymentService
```

---

### Client

Chooses which strategy to use.

---

## 8. Structure (Conceptual Flow)

```text
Client
   |
   v
Context (PaymentService)
   |
   v
Strategy
   |
-----------------------
|          |          |
UPI       Card      PayPal
```

### Flow

1. Client chooses strategy.
2. Strategy injected into Context.
3. Context delegates work.
4. Strategy executes algorithm.

---

## 9. Advantages

- Removes if-else chains.
- Follows Open-Closed Principle.
- Easy to add new algorithms.
- Improves maintainability.
- Supports runtime behavior change.
- Promotes composition over inheritance.

---

## 10. Disadvantages

- More classes are created.
- Client must choose strategy.
- Slight increase in complexity.

---

## 11. When To Use

Use Strategy Pattern when:

- Multiple algorithms exist.
- Behavior changes at runtime.
- Large if-else blocks exist.
- Different implementations perform the same task.

### Examples

- Payment Systems
- Sorting Algorithms
- Navigation Routes
- Compression Algorithms
- Authentication Providers

---

## 12. When NOT To Use

Avoid Strategy Pattern when:

- Only one algorithm exists.
- Behavior never changes.
- Simpler implementation is sufficient.

---

## 13. Interview Questions

### Basic Questions

1. What is Strategy Pattern?
2. Why do we use Strategy Pattern?
3. What problem does Strategy solve?

### Intermediate Questions

4. Strategy vs If-Else?
5. What is Context?
6. What are Concrete Strategies?

### Advanced Questions

7. Strategy vs State Pattern?
8. Strategy vs Factory Pattern?
9. How does Spring use Strategy Pattern?
10. Which SOLID principles are supported?

---

## One-Line Definition

Strategy Pattern defines a family of algorithms, encapsulates each one into separate classes, and makes them interchangeable at runtime.