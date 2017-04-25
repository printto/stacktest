# JUnit Stack Test
### by Pappim Pipatkasrira

## Defects found in type 0
- Stack with size 0 don't throw IllegalStateException when push item to it.
- Stack don't throw IllegalStateException when push item to it when it is full.

## Defects found in type 1
- Stack with size 0 throw EmptyStackException instead of IllegalStateException when push item to it.
- Stack don't throw IllegalStateException when push item to it when it is full.
- When stack is full stack.isFull() is false.
- Pushing null to the stack don't throw IllegalArgumentException.
- stack.size() returns wrong value
