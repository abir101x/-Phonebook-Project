# Advanced Java Phonebook Project (Version 2.0)

A command-line phonebook application built with Java that has been refactored to use a full Object-Oriented design. This project demonstrates key OOP principles like encapsulation, composition, and method overriding.

## Features

* **Object-Oriented Design:** The project is structured into logical classes (`Name`, `PhoneNumber`, `PhonebookEntry`) for better organization and maintainability.
* **Data Import:** Reads contact data from an external `phonebook.text` file into an array of `PhonebookEntry` objects.
* **Name & Reverse Lookup:** Performs lookups using custom `.equals()` methods for robust object comparison.
* **Exception Handling:** Gracefully handles `FileNotFoundException` and throws a custom exception if the phonebook capacity is exceeded.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Place all four `.java` files and a `phonebook.text` file in the same directory.
3.  Compile all the code from your terminal:
    ```bash
    javac *.java
    ```
4.  Run the main program:
    ```bash
    java Phonebook
    ```

## Key Concepts Demonstrated

* **Object-Oriented Programming (OOP):** Core concepts of designing and implementing a system using classes and objects.
* **Encapsulation:** Data and methods are bundled together within classes (e.g., `Name` class holds first and last name).
* **Composition:** Building complex objects from simpler ones (a `PhonebookEntry` is composed of a `Name` and a `PhoneNumber`).
* **Method Overriding:** Providing custom implementations for `equals()` and `toString()` methods.
* **Exception Handling:** Using `try-catch` blocks to manage potential runtime errors like a missing file.
* **Arrays of Objects:** Managing a collection of custom objects.

## Changelog

* **v2.0:** Major refactor to a full Object-Oriented design with separate classes for `Name`, `PhoneNumber`, and `PhonebookEntry`. Replaced `ArrayLists` with a fixed-size array and added exception handling.
* **v1.5:** Updated the underlying implementation of the lookup methods.
* **v1.0:** Initial procedural implementation of the phonebook application.
