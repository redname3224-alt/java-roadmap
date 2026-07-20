# Challenge 008 - Classes

## Description

Eighth challenge of the Java Roadmap.
The objective is to understand the concept of classes by creating custom classes with constructors, attributes, methods, and encapsulation.

## Concepts practiced

- Classes and objects
- Constructors
- Instance attributes
- Instance methods
- Encapsulation
- Getters and setters
- The `this` keyword
- Object creation
- `ArrayList`
- Composition (using collections inside classes)

## Extra challenge

Implemented custom classes representing:

- A `Stack` with:
    - Push
    - Pop
    - Size
    - Print contents
- A `Queue` with:
    - Enqueue
    - Dequeue
    - Size
    - Print contents

## Technologies

- Java 26

## Possible improvements

- Make the `Stack` and `Queue` classes generic (`Stack<T>` and `Queue<T>`).
- Override `toString()` instead of using custom `print()` methods.
- Throw exceptions instead of returning `null` when removing elements from an empty collection.
- Add unit tests.