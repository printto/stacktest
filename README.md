# JUnit Stack Test
### by Pappim Pipatkasrira

## Goal of this repository
This project was the assignment in OOP course 2017 (my 1st year of Software Engineering at Kasetsart University).
The project was created to test how stack works in Java.

## Defects found in type 0
- Stack with size 0 don't throw IllegalStateException when push item to it.
- Stack don't throw IllegalStateException when push item to it when it is full.

## Defects found in type 1
- Stack with size 0 throw EmptyStackException instead of IllegalStateException when push item to it.
- Stack don't throw IllegalStateException when push item to it when it is full.
- When stack is full stack.isFull() is false.
- Pushing null to the stack don't throw IllegalArgumentException.
- stack.size() returns wrong value
