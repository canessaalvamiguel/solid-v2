# SOLID Principles
Java project to show the SOLID principles applied.
Based on: https://www.youtube.com/watch?v=QwQuro7ekvc

## SOLID

- Single Responsibility
  Each class should have only one sole purpose, and not be filled with excessive functionality

- Open Closed
  Classes should be open for extension, closed for modification.
  In other words, you should not have to rewrite an existing class for implementing new features.

- Liskov Substitution
  Let Φ(x) be a property provable about objects x of type T. Then Φ(y) should be true for objects y of type S where S is a subtype of T.
  This means that every subclass or derived class should be substitutable for their base or parent class.
  Clients should not be forced to depend upon interfaces that they don't use

- Interface Segregation
  Interfaces should not force classes to implement what they can’t do.
  Large interfaces should be divided into small ones.

- Dependency Inversion
  Components should depend on abstractions, not on concretions.

Useful links:
- [Java liskov substitution principle](https://www.baeldung.com/java-liskov-substitution-principle)
- [Liskov substitution principle](https://dev.to/amrsaeedhosny/liskov-substitution-principle-ofc)
- [Interface segregation principle](https://medium.com/@radheshyamsingh_83359/interface-segregation-principle-solid-design-12ecfd29f906)
- [Dependency inversion principle](https://dev.to/tamerlang/understanding-solid-principles-dependency-inversion-1b0f)
