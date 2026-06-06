# 🧱 Builder Design Pattern (Java)

## 1. Definition

The Builder Design Pattern is a **creational design pattern** used to construct **complex objects step by step**.

It separates the **construction of an object** from its **representation**, allowing the same construction process to create different representations.

---

## 2. Intent

- To build complex objects in a **controlled and readable way**
- To avoid constructors with too many parameters (telescoping constructor problem)
- To support optional parameters in object creation
- To provide a fluent and readable API for object construction

---

## 3. Problem Without Builder Pattern

When we use constructors for object creation:

- Too many parameters lead to **confusion**
- Difficult to remember parameter order
- Multiple overloaded constructors required for optional fields
- Code becomes **hard to read and maintain**

### Example Problem
- A class with 8–10 fields requires long constructors
- Mixing up parameters causes bugs
- Not scalable for real-world systems

---

## 4. Issues Solved by Builder Pattern

- Eliminates telescoping constructors
- Handles optional parameters cleanly
- Improves code readability
- Provides immutable object creation support
- Makes object creation expressive and self-documenting

---

## 5. Solution Approach

Instead of passing all parameters at once:

- Create a **static inner Builder class**
- Set values step by step using method chaining
- Call `build()` method to create final object

---

## 6. Key Components

- **Product Class** → The object being built
- **Builder Class** → Builds the object step-by-step
- **build() method** → Returns final constructed object
- **Fluent API** → Method chaining style setters

---

## 7. Structure (Conceptual Flow)

1. Client calls Builder
2. Sets required + optional fields
3. Calls `build()`
4. Builder constructs final immutable object

---

## 8. Advantages

- Highly readable object creation
- Better maintainability
- Avoids constructor overload explosion
- Supports immutable objects
- Flexible object construction process

---

## 9. Disadvantages

- Slightly more code compared to constructors
- Extra class (Builder) increases complexity
- Not needed for simple objects

---

## 10. When to Use

Use Builder Pattern when:

- Class has many parameters (especially optional ones)
- Object creation is complex
- You want immutable objects
- You want readable and expressive object creation

---

## 11. When NOT to Use

Avoid Builder Pattern when:

- Object has very few fields (1–3)
- Object creation is simple
- Performance is extremely critical (minor overhead of extra object creation)

---

## 12. Real-World Examples

- `StringBuilder` in Java
- `Lombok @Builder`
- `HttpClient` builders
- Spring framework object construction
- Query builders (SQL, Criteria API)

---

## 13. Interview Perspective

### Common Questions

- What is Builder Pattern?
- Why is it used instead of constructors?
- What is telescoping constructor problem?
- Difference between Builder and Factory Pattern?
- Can Builder be reused?
- Is Builder thread-safe?

---

## 14. One-Line Definition

The Builder Pattern is a creational pattern that constructs complex objects step-by-step using a fluent API while avoiding constructor complexity.