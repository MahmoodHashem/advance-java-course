## Object Oriented Programming Overview

### What is OOP?

Object Oriented Programming is a programming paradigm that organizes code into objects that contain both **data and behavior.** It provides a clear structure for programs, making them more flexible, maintainable, and reusable.

### Classes and Objects

- **Class**: A blueprint or template that defines the attributes and behaviors common to all objects of a certain kind
- **Object**: An instance of a class that contains real data and can perform actions
- **Example**:
  ```java
  // Class definition
  public class Car {
      private String model;
      private int year;

      public void start() {
          // behavior
      }
  }

  // Object creation
  Car myCar = new Car();
  ```

### Four Pillars of OOP

1. **Encapsulation**

   - Bundling data and methods that operate on that data within a single unit
   - Using access modifiers (private, public, protected)
   - Implementing getter and setter methods

   ```java
   public class Person {
       private String name;  // data hiding
       public String getName() { return name; }  // accessor
   }
   ```
2. **Inheritance**

   - Mechanism that allows a class to inherit properties and methods from another class
   - Promotes code reuse and establishes relationships between classes

   ```java
   public class Student extends Person {
       private String studentId;
       // Student inherits all Person's properties
   }
   ```
3. **Polymorphism**

   - Ability of objects to take multiple forms
   - Method overriding and overloading

   ```java
   class Animal {
       void makeSound() { }
   }
   class Dog extends Animal {
       void makeSound() { // different implementation }
   }
   ```
4. **Abstraction**

   - Hiding complex implementation details and showing only necessary features
   - Using abstract classes and interfaces

   ```java
   abstract class Shape {
       abstract double calculateArea();
   }
   ```

## Key Benefits of OOP

- Modularity
- Reusability
- Data hiding and abstraction
- Maintainability
- Flexibility and extensibility

## Practical Examples

Check the src/week1 directory for practical implementations of these concepts in our exercises.
