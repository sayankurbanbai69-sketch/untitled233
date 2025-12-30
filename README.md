# Vehicle Management System — Assignment 2

## A. Project Overview
[cite_start]This project is a Java-based system designed to demonstrate the core principles of Object-Oriented Programming (OOP)[cite: 11, 83]. The system manages different types of vehicles and their drivers using the following concepts:
* [cite_start]**Inheritance**: Created a hierarchy where `Car`, `Motorcycle`, and `Truck` inherit from an abstract `Vehicle` class[cite: 12, 92].
* [cite_start]**Abstraction**: Used an abstract class `Vehicle` to define mandatory behaviors (`startEngine`, `stopEngine`) without implementing them in the superclass[cite: 13, 23, 91].
* [cite_start]**Composition & Aggregation**: Each `Vehicle` contains a `Driver` object (composition), and a single `Driver` can be associated with multiple vehicles (aggregation)[cite: 66, 67, 93].

## B. Class Hierarchy
* [cite_start]**Vehicle (Abstract Superclass)**: Contains common fields like `brand` and `year`, and defines the structure for subclasses[cite: 14, 15, 91].
* [cite_start]**Car, Motorcycle, Truck (Subclasses)**: Implement specific engine start/stop logic and add unique fields like `doors`, `hasSidecar`, or `capacity`[cite: 28, 38, 46, 92].
* [cite_start]**Overridden Methods**: Each subclass overrides `startEngine()` and `stopEngine()` to provide custom behavior[cite: 36, 44, 53].
* **Access Modifiers**: 
    * [cite_start]`private`: Used for specific subclass fields to ensure encapsulation[cite: 87].
    * [cite_start]`protected`: Used in the `Vehicle` class so subclasses can access shared data[cite: 15, 87].



## C. Instructions to Compile and Run
To run this project, follow these commands in your terminal:

1. **Compile all files:**
   ```bash
   javac *.java
