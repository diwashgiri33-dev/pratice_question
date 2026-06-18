# Java Core Concepts: Practice Set (Questions 1–15)

## Question 1: Smart Warehouse

### Objective

Demonstrate the use of Abstract Classes, Inheritance, and Interfaces in Java.

### Classes and Interfaces

* StorageUnit (Abstract Class)
* Refrigerated (Interface)
* ColdBox (Subclass)

### Features

* Stores warehouse information.
* Adjusts temperature using the Refrigerated interface.

### Sample Output

```
Temperature adjusted to 5°C
```

### Concepts Used

* Abstract Class
* Interface
* Inheritance
* Method Implementation

---

## Question 2: Student Grade Filter

### Objective

Categorize student scores as Distinction, Pass, or Fail.

### Classes

* Main

### Features

* Reads scores from an ArrayList.
* Uses conditional statements to classify grades.

### Sample Output

```
Distinction
Pass
Fail
```

### Concepts Used

* ArrayList
* For-each Loop
* If-Else Statements

---

## Question 3: Invalid Age Protector

### Objective

Validate voting eligibility using custom exceptions.

### Classes

* InvalidAgeException
* Main

### Features

* Checks age eligibility.
* Throws and handles custom exceptions.

### Sample Output

```
Age must be 18 or above.
```

### Concepts Used

* Exception Handling
* Custom Exceptions
* Try-Catch

---

## Question 4: Daily Sales Log

### Objective

Store weekly sales data into a text file.

### Classes

* Main

### Features

* Saves sales records to a file.
* Writes one value per line.

### Sample Output

```
File saved.
```

### Concepts Used

* Arrays
* FileWriter
* BufferedWriter
* File Handling

---

## Question 5: Device Manager

### Objective

Demonstrate runtime polymorphism using abstract classes.

### Classes

* ElectronicDevice
* Printer
* Scanner
* Main

### Features

* Stores different devices in one array.
* Calls overridden methods dynamically.

### Sample Output

```
Printer ON
Scanner ON
```

### Concepts Used

* Polymorphism
* Abstract Classes
* Method Overriding

---

## Question 6: Duplicate Finder

### Objective

Find duplicate names in an ArrayList.

### Classes

* Main

### Features

* Compares list elements using nested loops.
* Displays duplicate entries.

### Sample Output

```
Duplicate: Ram
```

### Concepts Used

* ArrayList
* Nested Loops
* String Comparison

---

## Question 7: Safe Math Calculator

### Objective

Perform division while handling runtime errors.

### Classes

* Main

### Features

* Accepts user input.
* Handles divide-by-zero errors.
* Handles invalid input types.

### Sample Output

```
Result = 5
```

### Concepts Used

* Scanner
* Exception Handling
* Multiple Catch Blocks

---

## Question 8: Product Inventory

### Objective

Apply discounts to electronic products using interfaces.

### Classes and Interfaces

* Discountable (Interface)
* Electronics
* Main

### Features

* Applies percentage discounts.
* Updates product prices.

### Sample Output

```
New Price = 900.0
New Price = 1800.0
```

### Concepts Used

* Interfaces
* Arrays
* Object-Oriented Programming

---

## Question 9: Log File Reader

### Objective

Filter error messages from a log file.

### Classes

* Main

### Features

* Reads a log file.
* Stores ERROR entries in an ArrayList.

### Sample Output

```
ERROR Database Connection Failed
ERROR Invalid Password
```

### Concepts Used

* File Handling
* ArrayList
* String Processing

---

## Question 10: ATM Simulation

### Objective

Implement encapsulation in a banking system.

### Classes

* BankAccount
* Main

### Features

* Protects balance using private variables.
* Prevents invalid withdrawals.

### Sample Output

```
Withdraw Successful
Balance = 8000.0
```

### Concepts Used

* Encapsulation
* Getters and Setters
* Validation Logic

---

## Question 11: Vehicle Fleet

### Objective

Calculate rental fees using inheritance and method overriding.

### Classes

* Vehicle
* Bike
* Bus
* Main

### Features

* Supports multiple vehicle types.
* Calculates rental fees differently.

### Sample Output

```
500.0
1500.0
```

### Concepts Used

* Inheritance
* Method Overriding
* ArrayList

---

## Question 12: Survey Analyzer

### Objective

Count survey responses using frequency arrays.

### Classes

* Main

### Features

* Tracks ratings from 1 to 5.
* Displays frequency counts.

### Sample Output

```
Rating 1 = 2
Rating 2 = 2
Rating 3 = 2
Rating 4 = 2
Rating 5 = 2
```

### Concepts Used

* Arrays
* Frequency Counting
* Loops

---

## Question 13: Library System

### Objective

Implement search functionality using interfaces.

### Classes and Interfaces

* Searchable (Interface)
* EBook
* PhysicalBook
* Main

### Features

* Supports searching in different book types.
* Demonstrates interface implementation.

### Sample Output

```
Searching EBook: Java
Searching Physical Book: Java
```

### Concepts Used

* Interfaces
* Method Implementation
* Polymorphism

---

## Question 14: Config Loader

### Objective

Load configuration files and create defaults if missing.

### Classes

* Main

### Features

* Checks for config.txt.
* Creates a default configuration file when needed.

### Sample Output

```
Default Config Created
```

### Concepts Used

* File Handling
* Exception Handling
* File Creation

---

## Question 15: Employee Payroll

### Objective

Generate payroll reports using inheritance and file handling.

### Classes

* Employee
* FullTime
* Contractor
* Main

### Features

* Calculates employee salaries.
* Writes payroll data to a text file.

### Sample Output

```
Payroll Report Generated
```

### Concepts Used

* Inheritance
* ArrayList
* File I/O
* BufferedWriter
