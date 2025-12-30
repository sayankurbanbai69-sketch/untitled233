# Vehicle Management System — Assignment 2

## A. Project Overview
This project is a Java-based system designed to demonstrate the core principles of Object-Oriented Programming (OOP). The system manages different types of vehicles and their drivers using the following concepts:
**Inheritance**: Created a hierarchy where `Car`, `Motorcycle`, and `Truck` inherit from an abstract `Vehicle` class.
**Abstraction**: Used an abstract class `Vehicle` to define mandatory behaviors (`startEngine`, `stopEngine`) without implementing them in the superclass.
**Composition & Aggregation**: Each `Vehicle` contains a `Driver` object (composition), and a single `Driver` can be associated with multiple vehicles (aggregation).

## B. Class Hierarchy
**Vehicle (Abstract Superclass)**: Contains common fields like `brand` and `year`, and defines the structure for subclasses.
**Car, Motorcycle, Truck (Subclasses)**: Implement specific engine start/stop logic and add unique fields like `doors`, `hasSidecar`, or `capacity`.
**Overridden Methods**: Each subclass overrides `startEngine()` and `stopEngine()` to provide custom behavior.
* **Access Modifiers**: 
  `private`: Used for specific subclass fields to ensure encapsulation.
  `protected`: Used in the `Vehicle` class so subclasses can access shared data.



## C. Instructions to Compile and Run
To run this project, follow these commands in your terminal:

1. **Compile all files:**
   ```bash
   javac *.java
2. **Run the program:**
   ```bash
   java Main
## D. Screenshots
<img width="500" height="754" alt="image" src="https://github.com/user-attachments/assets/dc6f992c-b4d4-4c2e-8612-d70c5c3ad5c2" />


## E. Reflection

**Inheritance:** Using inheritance significantly simplified the design by allowing me to write common code (like `displayInfo`) only once in the `Vehicle` class instead of repeating it in every vehicle type.

**Method Overriding:** Overriding allowed each vehicle to have its own "personality" — for example, a motorcycle starts with a kick, while a truck diesel engine roars.

**Challenges:** The main challenge was correctly using `super()` in constructors to ensure that the brand and year are properly initialized in the parent class before the subclass adds its own data.
