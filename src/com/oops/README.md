# OOPS
- Object-Oriented Programming or Java OOPs concept refers to programming languages that use objects in programming.

## Java Class
- A Class is a user-defined blueprint or prototype from which objects are created.
- class declarations can include these components in order: 
1. Modifiers: A class can be public or have default access (Refer to this for details).
2. Class name: The class name should begin with the initial letter capitalized by convention.
3. Body: The class body is surrounded by braces, { }.

## Java Object
- An Object is a basic unit of Object-Oriented Programming that represents real-life entities.
- An object mainly consists of: 
- State: It is represented by the attributes of an object. It also reflects the properties of an object.
- Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.
- Identity: It is a unique name given to an object that enables it to interact with other objects.
- Method: A method is a collection of statements that perform some specific task and return the result to the caller.

## 4 Pillars of Java OOPs Concepts
### 1. Abstraction
- Data Abstraction is the property by virtue of which only the essential details are displayed to the user. 
- Note: In Java, abstraction is achieved by interfaces and abstract classes.
- Eg:-
```java
// abstract class
abstract class GFG {
    // abstract methods declaration
    abstract void add();
    abstract void mul();
    abstract void div();
}
```

### 2. Encapsulation
- It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together the code and the data it manipulates.
- Data-hiding
- Encapsulation can be achieved by declaring all the variables in a class as private and writing public methods in the class to set and get the values of the variables.

### 3. Inheritance 
- Inheritance is the mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class. 
- We are achieving inheritance by using extends keyword.
- Inheritance is also known as “is-a” relationship.
- Important terminology: - Superclass, Subclass, Reusablity

### 4. Polymorphism
- It refers to the ability of object-oriented programming languages to differentiate between entities with the same name efficiently. 
- The ability to appear in many forms is called polymorphism.
- mainly of 2 types:- Method Overloading & Method Overriding 

## Method Overloading and Method Overriding
### 1. Method Overloading: 
- compile-time polymorphism.
- more than one method share the same name with different signature(Parameters) in a class.

### 2. Method Overriding: 
- run-time polymorphism
- the child class has the same name, return-type and parameters as in parent class. The child class provides the implementation in the method already written.

