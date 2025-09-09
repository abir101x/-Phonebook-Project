# Advanced Java Phonebook Project (Version 1.5)

A command-line phonebook application built in Java that reads contact information from a text file and allows a user to perform lookups. This project was developed for an advanced Java programming course and demonstrates fundamental programming concepts.

## Features

* **Data Import:** Reads contact data (last name, first name, phone number) from an external `phonebook.text` file.
* **Name Lookup:** Prompts the user for a first and last name and returns the corresponding phone number.
* **Reverse Lookup:** Prompts the user for a phone number and returns the corresponding name.
* **Session Summary:** Tracks the number of lookups and reverse lookups performed and displays a summary when the user quits.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Place the `Phonebook.java` file and a `phonebook.text` file in the same directory. The text file should be formatted with `LastName FirstName PhoneNumber` on each line.
3.  Compile the code from your terminal:
    ```bash
    javac Phonebook.java
    ```
4.  Run the program:
    ```bash
    java Phonebook
    ```

## Key Concepts Demonstrated

* **File I/O:** Reading and parsing data from external files using `java.io.File` and `java.util.Scanner`.
* **Data Structures:** Use of `ArrayList` to store and manage collections of data in memory.
* **User Input Handling:** Interactive command-line interface for handling user choices and input.
* **Procedural Decomposition:** Breaking down a larger problem into smaller, manageable static methods.

## Changelog

* **v1.5:** Updated the underlying implementation of the lookup methods. The external user interface remains the same.
* **v1.0:** Initial procedural implementation of the phonebook application.
