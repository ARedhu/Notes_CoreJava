What is Java? 
Java is an object-oriented programming language which works on write onece, run anwhere principle using JVM. 
JDK (Java Development Kit): Full package for development + execution
 ├── JRE (Java Runtime Environment)
 │    ├── JVM (Java Virtual Machine)
 │    └── Core Libraries (Java API)
 │
 └── Development Tools like: javac, java, javadoc, etc.

Step-by-step:
1. You write code in .java file
2. javac compiles it → creates .class file
    This contains bytecode (platform-independent)
3. JVM (inside JRE) executes the bytecode
    Converts bytecode → machine code (platform-dependent) 

Client don't need to have JDK in their machine. They just need to have JRE in their machine to run java bytecode. But nowadays client don't need to install anything, they can directly run the bytecode using some tools like jlink. 

Java Keywords (reserved words to specific some standard job)
Naming Conventions: Java follows standard naming conventions like PascalCase for classes, camelCase for methods and variables, uppercase for constants, and lowercase reverse domain naming for packages. These conventions improve code readability and maintainability. Variable name must start with lowercase letter, _ , $. Java is a case sensitive language means age and aGE are two diff things. 

JAVA DATA TYPES
1. Primitive Data Types (8 types): These store actual values.
A. Integer Types:
    - byte   (1 byte)  → range: -128 to 127
    - short  (2 bytes)
    - int    (4 bytes)  → most commonly used
    - long   (8 bytes)  → use 'L' at end (e.g., 1000L)
B. Floating Point Types:
    - float  (4 bytes)  → use 'f' at end (e.g., 10.5f). Accuracy till 7-digits after decimal. 
    - double (8 bytes)  → default for decimals
C. Character Type:
    - char (2 bytes) → stores single character (e.g., 'A')
D. Boolean Type: (1 bit)
    - boolean → true or false

2. Non-Primitive Data Types (Reference Types) : These store reference (address), not actual value.
Examples:
    - String
    - Array
    - Class
    - Interface

Example:
    String name = "Ashish";
    int[] arr = {1, 2, 3};

Key Differences:
    Primitive:
    - Stores actual value
    - Fixed size
    - Stored in stack memory
    Non-Primitive:
    - Stores reference
    - Size varies
    - Stored in heap memory
References are stored in stak memory and the actual object created is stored in heap memory. 
--------------------------------------------------

Important Points:
- String is NOT a primitive data type
- int is the most commonly used data type
- double is default for decimal numbers

--------------------------------------------------

Implicit Data conversion: The data of shorter data types can be converted to larger bydefault without data loss. This is loseless conversion. But if we do reverse of it, it will do lossy conversion (means some data will be lost). And, that is called explicit data conversion or type-casting. 



--------------------------------------------------

Binary to decimal and decimal to binary, binary operations, Java operator, Scanner class. 
next()     → reads only one word
nextLine() → reads full line (including spaces)

Common Issue (Very Important)

When using nextLine() after nextInt() or next():

Example:
int age = sc.nextInt();
String name = sc.nextLine();  // problem

Problem:
- nextLine() reads leftover newline character

Solution:
int age = sc.nextInt();
sc.nextLine(); // consume newline
String name = sc.nextLine();


* use sc.close() so that garbage collector can easily remove the sc object from memory. Using this we are specifying that sc object is of no use now. 
* switch is lil bit more optimized as compared to if-else. Because it takes us directly to a particular case rather than checking each if-else condition. In switch default is recommended but not mendatory. break keyword. 
Supported Types:
- int, char, String, enum
- Not supported: float, double, boolean
✅ default can be placed anywhere
Multiple cases can be combined together if we want to perform the same task. case 1: case 2: case 15: code here. Remember we can't use curly braces here with case. 

We use Integer eventhough we have int, It's because so that we can use Collections. 

Labels: Used to break out of a specific outer loop. We basically name that loop. 
Example
outer:
for(int i = 1; i <= 3; i++) {
    for(int j = 1; j <= 3; j++) {
        if(i == 2 && j == 2) {
            break outer;
        }
        System.out.println(i + " " + j);
    }
}



--------------------------------------------------

Arrays: 
int age[]; // Array declaration. this variable is pointing to age[0] by default. 
age = new int[20]; // memory allocation. Remember arrays itself is an object. Stored in heap memory. age → reference variable, actual array → object in heap
System.out.println(age.getClass()); // But these are not normal class, these are managed by JVM. 
int[] age = {1, 2, 9, 2};


Functions:
Math library: Math.random() this method returns a random value b/w [0, 1). If we want random number b/w [1, 6] -> Math.random()*6 + 1
General formula: (int)(Math.random()*(b-a+1) + a); from [a, b];


STRING IN JAVA

Definition:
A String in Java is a sequence of characters used to store text.
It is a non-primitive (reference) data type and an object of the String class.

--------------------------------------------------

1. Ways to Create String

A. Using String Literal:
String s1 = "Hello";

- Stored in String Constant Pool (SCP)
- Memory efficient (reuses existing objects)

--------------------------------------------------

B. Using new Keyword:
String s2 = new String("Hello");

- Stored in Heap memory
- Always creates a new object

--------------------------------------------------

2. String is Immutable
- Once a String object is created, it cannot be changed

Example:
String s = "Hello";
s = s + " World";

- A new object is created ("Hello World")
- Original "Hello" remains unchanged

--------------------------------------------------

3. String Constant Pool (SCP)

- Special memory area inside heap
- Stores unique string literals

Example:
String a = "Java";
String b = "Java";

- Both refer to same object in SCP

--------------------------------------------------

4. Important Methods
length()       → returns length
charAt(i)      → returns character at index
toUpperCase()  → converts to uppercase
toLowerCase()  → converts to lowercase
equals()       → compares values
compareTo()    → compares lexicographically
substring()    → extracts part of string
st.replace(old word, new word) -> replaces the old word or character in the string with new one. 
st.contains("word") -> returns true or false if that particular word is present or not. 
String arr[] = st.split(" ") -> here it will split the string on the basis of the string or character we provide here and returns an array of strings. 
"\\." → split by dot
"\\d" → split by digits
"\\d+" → splits at groups of digits
If you want to split on the basis of 6, Just use "6" directly

char arr[] = st.toCharArray();
st.isEmpty() vs st.isBlank(); // "      " this is blank not empty. 

Remember all the methods will not change the existing string, these will generate a newly updated string. 

--------------------------------------------------

5. == vs equals()

==       → compares reference (memory address)
equals() → compares actual content

Example:
String a = "Java";
String b = new String("Java");

System.out.println(a == b);        // false
System.out.println(a.equals(b));  // true

--------------------------------------------------

6. Memory Concept
- String literal → stored in SCP
- new String()   → stored in heap
- Reference variable → stored in stack

--------------------------------------------------

Important Points:
- String is immutable
- Stored in String Constant Pool
- Most commonly used class in Java

--------------------------------------------------

Interview Answer (Short):
String in Java is a non-primitive data type used to store text. 
It is an object of the String class and is immutable, meaning its value cannot be changed once created.





********************************** OOPs in Java ***************************************


Classes: 
Class is a way to store data and it's behavious together. 

There can be multiple classes in a single .java file but can be at max a single public class (having the same name as .java file name) which would have psvm function from where the execution of that .java file starts. Also it is not necessary to make this main class as public. If we make it public then that means we can access it from outside of the file as well. 

java.lang.Object
Object is the root (top-most) class in Java
Every class implicitly extends Object (even if you don’t write it)

Eventhough the memory is allocated when object of a class is created. But still the metadata of a class is stored in metaspace for classes, only once for each class. And, this memory of class is released when program removed. 


Method Overloading: 
Two or more methods can have the same name inside the same class if they accept diff arguments. Arguments can be diff in the number/count or in their data type. Return types of methods don't specify method overloading. 


Constructors:
Constructor is a function with no return type and having same name as class which is invoked as we create the object/instance of a class. If we don't create a constructor by ourself then java itself will create a default constructor during runtime. We can override the default constructor as well. Also if we have made any constructor other than default constructor then we have to make the default constructor as well by ourself because then java will not create any kind of default constructor by itself for that class. A constructor cannot be abstract or static or final. A constructor can be overloaded but cannot be override. 

this keyword: is used to refer the current object. 


1. Inheritance:
Inheritance is one of the key features of OOP that allows us to create new class from an existing class. 
The new class that is created is knows as subclass(child or derived) and the existing clsas from where the child class is derived is known as superclass(parent or base class). Multiple Inheritance (one class inherits from more than one class) is not allowed in java. There can be only one immediate parent class. 
- keyword used to inherit a class is "extends";
class Ashish extends Person{}

Method Overriding:
If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is know as method overriding. This is also known as runtime polymorphism. polymorphism means many forms. It allows one object or method to behave differently in diff situations. 

The super keyword in java: 
super keyword is used to access the instance of the immediate parent class. To access immediate parent class instance variables, methods, and constructors. When we call the constructor of child class it's parent class's default constructor is called bydefault. And, if parent have any grandparent class then grandparent class's constructor will be called in reverse order (grandparent constructor > parent > child). super(argument) -> parent's constructor. super.methodName() -> parent's method. If you want to call the constructor of parent by yourself (other than default constructor) then you have to call it in the first line of your child constructor before any other code of child's constructor. 

The final Keyword: 
final variable - can't be assigned again. 
final method - can't be overridden by it's subclasses. 
final class - can't be extended or inherited by other classes. 


--------------------------------------------------


2. Encapsulation: 
it is the process of wrapping data (variables) and code (methods) together as a single unit. It helps in data hiding. 

Java packages: A package is simply a container that groups related types(Java classes, interfaces, enumerations, and annotations). To define a package in Java, we use a keyword package. Java uses file system directories to store packages. 
    |-com // this is package
       |- test // this is also a package
            |- Test.java // This is class or say java file. 

Test.java file code: 
package com.test; // Here we are defining that this Test.java file/class is inside of package com.test. And, it is mendatory to provide this complete path. 

// External imports will be here only. 
import java.util.*; // Here we are importing the whole package 'util' which is present inside of java package. 
import java.util.Date; // Here we are importing the Date class which is present inside of util package which is present inside of java package and the right convention to say is, which is present inside ofjava.util package. 

// Also it is mendatory and a convention also to import the external package here b/w the "package com.test" (means our package defining for current class) and current class definition which is below (class Test). Also we need to import these external classes only if they are not present in the package. If they are present in the diff class of same package then no need to import. 
class Test{
    public static void main(String[] args){
        System.out.println("HELLO World");
    }
}

Access modifiers: are used to set the accessbility(visibility) of classes, interfaces, variables, methods, constructors, data members and the settor methods. 

i) Private keyword with variables of a class: Then these variables can be accessed by the same class only not even by the subclass or the objects of the same class. 

- We can't make an independent static class. We can make a static class inside of another class only. 

ii) Public accessible to everyone even in the diff packages. 

iii) default: accessible to same package but not out of package. Also called package-private. 

iv) Protected: accessble to all in the same package but only to the subclass/child class outside of package. This was introduced so that we can 

Remember these things apply to everything variables, functions, classes etc. 

The static keyword: 
Static variables are directly accessbile by calling the class name. And, these variables are common/shared among all the instances of the class. The memory allocation of these variables also happens as the class loads in the memory. Static variables can be used in any type of method (static or non-static). But the non-static variables can't be used inside of static methods. It will throw compile time error. 
static method: if the functioning of a method doesn't depend on the objects then we can make that as static. 
static block runs even before the main method and all the constructors. this and super are not used inside of static block. 


--------------------------------------------------


3. Abstraction
It is an OOPs concept that allows us to hide unnecessary details and show the needed information. 

Java Abstract Class: can't be instantiated. We use abstract keyword to declare an abstract class.
 "abstract class Human{}"
 "class Male extends Human{}" we can extend only a single class. "
An abstract class can have both regular and abstract methods. A method that doesn't have it's body is knows as abstract method. We can create subclasses and then access the member of the abstract class using the object of the subclass. It is mendatory for the child class(if it is non-abstract) to provide the definition/implementation of the abstract methods of it's abstract parent class, if subclass is also abstract then we can't provide definition in subclass also. The abstract methods can be present inside of abstract class only. Abstract class can have normal methods, normal variables as well as abstract methods. In an abstract class if a method is not abstract then we have to provide it's implementation/definition. 

@Override keyword this basically used for spell checking of the overrided methods inside of a child class from parent class. This is called annotation. 


Java Interfaces:
An interface is a fully abstract class. It can't have any non-abstract/normal method or even normal variables. It includes a group of abstract methods only(methods without a body). By default all the methods are public and abstract. We don't need to use abstract keyword. But in case of classes we have to use abstract keyword with the method to make it abstract. 

"interface TimeKeeper{}"
"interface MessagingDevice{}"
"class SmartWatch implements TimeKeeper, MessagingDevice{}" "

We are able to perform multiple inheritance using interfaces which is usually not possible in Java. Reason ? As classes, even abstract classes can have normal methods. Now what if both the two parent classes have the same method. Then child class object will get confused which method it should invoke on calling. But interfaces don't have implementation of the methods, child class defines it's own implementation for the method. So, even if both the parent interfaces have same method, no problem will occur. 

"public static final a=5", by default all the variables inside of an interface are public static final. "a=5". public because If a variable were private or protected, the implementing classes wouldn't be able to access it. static because Interfaces cannot be instantiated. final because If interfaces allowed non-final variables, an implementing class could change the value. If multiple classes implemented the same interface, they could all be fighting over and changing that variable's value, leading to unpredictable bugs. 

default functions in interface in Java: 
What happens is what if we want to add a new funtion in an interface then all the child classes which are implementing this interface have to define this newly added function. So, Java introduce a new way to escape this so that only the classes which wants this methods can implement it when they want. Although it breaks the 100% abstraction rule. 
"interface TimeKeeper(){
    default void hello(){
        System.out.println("Saying hello...");
    }
}" "


- nested class and nested static class
public class LearnInnerClass{
    class Toy{
        int price;
    }
    static class Playstation{
        int price;
    }
    public static void main(String[] args){
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy(); // Way to create object of nested class as the nested class Toy is a normal entity inside of LearnInnerClass which can be accessed only via creating the objected of outer class i.e LearnInnerClass. 

        Playstation playstation = new LearnInnerClass.Playstation(); // Way to create the object of nested static class as the static nested class is class entity and can be accessed directly by class name LearnInnerClass. 
    }
}


- Anonymous Classes in Java:
A nested class that doesn't have any name is known as an anonymous class. Here, we declare and instantiate a class at the same time. We can't create multiple objects of this anonymous class. Since it has no name, we can't create a constructor of it. 
"BaseClass obj = new BaseClass(){
    // This inside is the definition of an anonymous class and it is extending BaseClass. obj is an object of anonymous class, not of BaseClass(); Can work similarly with interfaces. 
    @Override
    public void someMethod(){

    }
    // can create new methods also. 
}
" "


- Functional Interfaces in Java:
An interface that contains exactly one abstract method. 

@FunctionalInterface // This annotation is used to tell others that this is a functional interface. 
interface Sample{
    int calculate(int num);
}

We can use lambda expressions to make the syntax lil bit more smaller for the anonymous class or in layman language say object of functional interface. 
// without lambda. 
Sample s1 = new Sample(){
}
// with lambda
Sample s2 = () -> {
   // Because we already know the interface name and it has only function. We can remove the parenthesis if we have only one argument. We can remove the curly braces also if we have a single statement. We can remove the return statement also if we have a single statement. 
}


--------------------------------------------------


4. Polymorphism
Polymorphism means multiple forms where a method can behave differently depending on the object or input. It is of two types Compile-time polymorphism(method overloading) and Run-time polymorphism(method overriding).

Heap Memory: where the actual objects are stored. It is created when our program loads by JRE. Its size is more than stack memory. String pool is also there in heap memory. Objects present in this memory are accessible from everywhere in the code, we just be able to pass the reference of that memory to that particular location. This is not thread safe. 

Stack Memory: where the reference of objects and primitive data types are stored. 

Object class in Java: 
Object is the parent class of every class by default, we can use and even override few methods of this class. toString() is one of those methods which returns string. equals() is also one which returns true/false. We can override the hashcode() method as well, it returns int. getClass() method gives the class of 

What is the contract b/w hashcode and equals method ? If equals method of two objects gives true that means their hashcode is also same. As each object has a unique hashcode. 

Parent class reference variable can point to child class object in java and will be able to access only the methods and variables of parent class. But its vice-versa is not possibe. For example every dog is an animal but every animal is not dog. 










