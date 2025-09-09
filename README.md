# Advanced Java Phonebook Project (Version 2.5)

A command-line phonebook application built with Java, designed with a full Object-Oriented architecture. The core logic and data are encapsulated within a `Phonebook` class, with a separate `PhonebookApp` class to run the application.

## Features

* **Encapsulated Design:** The phonebook is now a true object. The main application creates an instance of the `Phonebook` class to interact with the data.
* **Data Import via Constructor:** The `Phonebook` constructor handles loading all contact data from the source file.
* **Object-Oriented Lookups:** The application uses instance methods (`phonebook.lookup()`) to search for data within the phonebook object.
* **Exception Handling:** Gracefully handles `FileNotFoundException` and throws a custom exception if the phonebook capacity is exceeded.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Place all five `.java` files and a `phonebook.text` file in the same directory.
3.  Compile all the code from your terminal:
    ```bash
    javac *.java
    ```
4.  Run the main application:
    ```bash
    java PhonebookApp
    ```

## Key Concepts Demonstrated

* **Object-Oriented Programming (OOP):** Advanced design separating a data model (`Phonebook`) from its runner application (`PhonebookApp`).
* **Encapsulation:** The `Phonebook` class encapsulates the entry array and the logic to manipulate it.
* **Constructor Logic:** The constructor is used to initialize the object's state by reading from a file.
* **Instance Methods:** Logic for `lookup` and `reverseLookup` now operate on a specific instance of a `Phonebook` object.
* **Composition:** A `PhonebookEntry` is composed of a `Name` and a `PhoneNumber`.
* **Exception Handling:** Using `try-catch` blocks for robust error management.

## Changelog

* **v2.5:** Refactored the architecture to fully encapsulate phonebook data and logic into a `Phonebook` class, with a new `PhonebookApp` runner class.
* **v2.0:** Major refactor to a full Object-Oriented design with separate classes for `Name`, `PhoneNumber`, and `PhonebookEntry`.
* **v1.5:** Updated the underlying implementation of the lookup methods.
* **v1.0:** Initial procedural implementation of the phonebook application.
