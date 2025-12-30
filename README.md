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
   java Main
