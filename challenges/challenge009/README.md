# Challenge 009 - Inheritance

## Description

Ninth challenge of the Java Roadmap.
The objective is to understand inheritance and polymorphism by creating class hierarchies and overriding inherited methods.

## Concepts practiced

- Inheritance (`extends`)
- Superclasses and subclasses
- Constructors and the `super` keyword
- Method overriding (`@Override`)
- Polymorphism
- Protected members
- Object composition
- `ArrayList`

## Extra challenge

Implemented a simple company hierarchy consisting of:

- An `Employee` base class
- A `Manager` who manages a team of employees
- A `ProjectManager` that extends `Manager` and manages a project
- A `Programmer` with a programming language and a coding-related method

## Technologies

- Java 26

## Possible improvements

- Make `Animal` abstract so generic animals cannot be instantiated.
- Override `printInfo()` in subclasses to display role-specific information.
- Add methods to remove employees from a manager's team.
- Add unit tests.