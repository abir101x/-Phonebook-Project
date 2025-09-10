# Advanced Java Phonebook Project (Version 3.0)

A command-line phonebook application built with Java, designed with a full Object-Oriented architecture. This final version uses a Map for efficient lookups, supports multiple phone numbers per contact, and is run using command-line arguments.

## Features

* **Map-Based Data Structure:** The core of the phonebook is a `HashMap`, providing highly efficient O(1) average time complexity for lookups.
* **Support for Multiple Numbers:** Contacts can have multiple phone numbers, each with a description (e.g., mobile, work, fax).
* **Command-Line Interface:** The application is launched like a standard command-line tool, specifying the data file as an argument.
* **Robust OOP Design:** The project is fully encapsulated, with distinct classes for `Name`, `PhoneNumber`, `PhonebookEntry`, and the `Phonebook` itself. A `PhonebookApp` class handles user interaction.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Place all five `.java` files and a `phonebook.text` file in the same directory.
3.  Compile all the code from your terminal:
    ```bash
    javac *.java
    ```
4.  Run the main application, passing the phonebook file as an argument:
    ```bash
    java PhonebookApp phonebook.text
    ```

## Key Concepts Demonstrated

* **Advanced Data Structures:** Use of `HashMap` for efficient key-value lookups.
* **Object-Oriented Design:** A clean separation of concerns between data model classes and the main application runner.
* **Hashing:** Implementation of `hashCode()` and `equals()` methods in the `Name` class, a requirement for custom keys in a `HashMap`.
* **Command-Line Arguments:** Processing `String[] args` in the `main` method to control the program's behavior.
* **Encapsulation & Composition:** Bundling data and behavior within classes and building complex objects from simpler ones.

## Changelog
* **v3.0:** Re-architected the phonebook to use a `HashMap` for O(1) lookups. Added support for multiple phone numbers per entry and implemented command-line argument handling.
* **v2.5:** Refactored ` the architecture to fully encapsulate phonebook data and logic into a `Phonebook` class, with a new `PhonebookApp` runner class.
* **v2.0:** Major refactor to a full Object-Oriented design with separate classes for `Name`, `PhoneNumber`, and `PhonebookEntry`.
* **v1.5:** Updated the underlying implementation of the lookup methods.
* **v1.0:** Initial procedural implementation of the phonebook application.
