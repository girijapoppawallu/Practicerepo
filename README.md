# Practicerepo

This repository is intended **specifically for coding and software learning purposes**.

It is a beginner-level Java practice project covering fundamental programming concepts such as:

- **Data Types** – Primitive types (byte, short, int, long, float, double, boolean, char, String)
- **Object-Oriented Programming** – Classes, constructors, and objects (e.g., employee data example)
- **Control Flow** – if/else statements for even/odd checking, switch statements for day checking
- **Loops** – for, while, and do-while loop demonstrations
- **Unit Testing** – Basic JUnit tests for calculator operations (add, subtract, multiply, divide)

## Who Is This For?

This repository is **not** for general use. It is a dedicated space for practising and learning Java programming concepts. It is best suited for:

- Beginners learning Java
- Students following Java coursework or tutorials
- Anyone wanting to explore basic Java syntax and structure

## Project Structure

```
src/
├── main/java/com/miit/
│   ├── FirstProgram.java         # Primitive data types demo
│   ├── employeedata.java         # OOP example with constructors
│   ├── Checkevenoroddnumber.java # if/else conditional example
│   ├── checkdays.java            # switch statement example
│   └── printnumber.java          # Loop demonstrations
└── test/java/
    ├── calculator/calculatorTest.java
    └── javanewproject/calculater_test.java
```

## Build

This project uses [Maven](https://maven.apache.org/). To build:

```bash
mvn compile
```

To run tests:

```bash
mvn test
```
