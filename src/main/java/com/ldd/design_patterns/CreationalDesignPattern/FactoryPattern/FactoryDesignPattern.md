# 🏭 Factory Design Pattern (Java)

## 1. Definition

Factory Pattern is a **Creational Design Pattern** that provides an interface for creating objects without 
exposing the object creation logic to the client.

Instead of using the `new` keyword directly, the client asks a Factory class to create and return the required object.

**Factory Pattern delegates object creation responsibility to a dedicated 
Factory class instead of creating objects directly using the new keyword.**
---

## 2. Intent

- Encapsulate object creation logic.
- Hide implementation details from the client.
- Reduce tight coupling between client and concrete classes.
- Follow the "Program to Interface, not Implementation" principle.

---

## 3. Problem Statement

Imagine a Notification System.

Without Factory Pattern:

```

if(type.equals("EMAIL")){
    notification = new EmailNotification();
}
else if(type.equals("SMS")){
    notification = new SmsNotification();
}
else if(type.equals("PUSH")){
    notification = new PushNotification();
}
notification.send();

 ```
# 4. Problems: 

- Client knows all concrete classes.
- Multiple if-else blocks.
- Tight coupling.
- Difficult to add new notification types.
- Violates Open-Closed Principle.


# 5. Solution

**Move object creation logic into a Factory Class.**
**Client asks factory: "Give me an object of type EMAIL"**
**Factory decides which implementation to create.**

# 6. Advantages
- Loose Coupling
- Centeralized object creation
- Easy maintainance
- Easy extention
- Better code readability

# 7. Disadvantage
- Extra factory class
- Slightly more complex
- Can become large if too many products exist

# 8. When to use ?
- Object creation is complex
- Multiple implementations exist
- Client should not know implementation details
- New implementations may be added frequently

# 9. When Not To Use

- Only one implementation exists
- Object creation is very simple
- Factory adds unnecessary complexity
- 
# 10. Real World Examples

**Java:**
Calendar.getInstance()
DriverManager.getConnection()
NumberFormat.getInstance()

**Spring:**

BeanFactory
ApplicationContext