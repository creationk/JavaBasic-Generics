# JavaBasic-Generics

### Why Generic Programming?
Generic programming means writing code that can be reused for objects of many different types. 
Before generic classes were added to Java, generic programming was achieved with inheritance.
This approach has two problems. A cast is necessary whenever you retrieve a value. Moreover, there is no error checking. You can add values of any class. 

### What is a generic class
A generic class is a class with one or more type variables. A generic class can have more than one type variable. The class having the type variable must indicate it in the class declaration after the class name in braces like this - ClassName<T>
