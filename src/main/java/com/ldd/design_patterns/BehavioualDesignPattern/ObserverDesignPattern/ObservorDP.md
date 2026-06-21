# 👀 Observer Design Pattern (Java)

## 1. Definition

Observer Pattern is a **Behavioral Design Pattern** that defines a **one-to-many dependency** between objects so that when one object changes its state, all its dependent objects (observers) are automatically notified and updated.

The object being observed is called the **Subject (Publisher)**, and the objects receiving updates are called **Observers (Subscribers)**.

---

## 2. Intent

* Establish communication between one publisher and multiple subscribers.
* Automatically notify interested parties when data changes.
* Promote loose coupling between publisher and subscribers.
* Support dynamic subscription and unsubscription.

---

## 3. Problem Statement

Consider a social media platform like Instagram.

An Influencer uploads a new post:

```text
"Observer Pattern Tutorial"
```

All followers should immediately receive a notification.

### Example

```text
Influencer uploads post
        ↓
All Followers receive notification
```

Followers may:

* Subscribe to the influencer.
* Unsubscribe from the influencer.
* Receive updates whenever a new post is uploaded.

The challenge is to notify all followers automatically without tightly coupling the Influencer class to every follower.

---

## 4. Without Observer Pattern

A naive implementation might look like:

```java
public class Influencer {

    public void uploadPost() {

        notifyShilpa();
        notifyRahul();
        notifyAmit();
        notifyNeha();
    }

    private void notifyShilpa() {
        System.out.println("Notify Shilpa");
    }

    private void notifyRahul() {
        System.out.println("Notify Rahul");
    }

    private void notifyAmit() {
        System.out.println("Notify Amit");
    }

    private void notifyNeha() {
        System.out.println("Notify Neha");
    }
}
```

Whenever a new follower joins, the Influencer class must be modified.

---

## 5. Problems Without Observer Pattern

### Problem 1: Tight Coupling

The Influencer knows every follower individually.

```text
Influencer
   ├── Shilpa
   ├── Rahul
   ├── Amit
   └── Neha
```

Adding or removing followers requires changing existing code.

---

### Problem 2: Violates Open-Closed Principle

Every new follower requires:

```java
notifyNewFollower();
```

and modifications to the Influencer class.

The class is not closed for modification.

---

### Problem 3: Poor Scalability

Imagine:

```text
1 Influencer
100,000 Followers
```

Maintaining individual notification methods becomes impossible.

---

### Problem 4: Difficult Maintenance

Whenever notification logic changes:

```text
Email Notification
Push Notification
SMS Notification
```

the Influencer class must be updated.

---

### Problem 5: No Dynamic Subscription

Users cannot:

* Subscribe at runtime.
* Unsubscribe at runtime.

All followers are hardcoded.

---

## Why We Need Observer Pattern

We need a mechanism where:

```text
Influencer uploads a post
          ↓
All current followers are notified automatically
```

without the Influencer knowing:

* Who the followers are.
* How many followers exist.
* How notifications are delivered.

This is exactly what the Observer Pattern solves.

---

## One-Line Definition

Observer Pattern establishes a one-to-many relationship between a Subject and its Observers so that when the Subject changes state, all Observers are automatically notified and updated.
