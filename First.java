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
import java.util.Date; // Here we are importing the Date class which is present inside of util package which is present inside of java package and the right convention to say is, which is present inside of java.util package. 

// Also it is mendatory and a convention also to import the external package here b/w the "package com.test" (means our package defining for current class) and current class definition which is below (class Test). Also we need to import these external classes only if they are not present in the package. If they are present in the diff class of same package then no need to import. 
class Test{
    public static void main(String[] args){
        System.out.println("HELLO World");
    }
}

Access modifiers: are used to set the accessbility(visibility) of classes, interfaces, variables, methods, constructors, data members and the settor methods. 

i) Private keyword with variables of a class: Then these variables can be accessed by the same class only not even by the subclass or the objects of the same class. Access either using class name if made them static or using getter/setter using object. 

- We can't make an independent static class. We can make a static class inside of another class only. 

ii) Public accessible to everyone even in the diff packages. 

iii) default: accessible to same package but not out of package. Also called package-private. 

iv) Protected: accessble to all in the same package but only to the subclass/child class outside of package. This was introduced so that we can share current class features outside of the package. 

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
Object is the parent class of every class by default, we can use and even override few methods of this class. toString() is one of those methods which returns string. equals() is also one which returns true/false. We can override the hashcode() method as well, it returns int. getClass() method gives the class. If we try to print the object it will print it after using .toString() with it. 

What is the contract b/w hashcode and equals method ? If equals method of two objects gives true that means their hashcode is also same. As each object has a unique hashcode.  

* We can override hashcode and equals method if we have custom objects. 
Code-
@Override
public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return rollNo == student.rollNo;
}
@Override
public int hashCode(){
    return Objects.hash(rollNo);
}
Usually when we print an object directly inside of sout, it converts the object to string using "toString()" method. So, we can override that method also. 
@Override
publci String toString(){
    // override logic here. 
}

Parent class reference variable can point to child class object in java and will be able to access only the methods and variables of parent class. But its vice-versa is not possibe. For example every dog is an animal but every animal is not dog. 





********************************** Java Exceptions ***************************************
An exception is an unexpected event that occurs during program execution. It affects the flow of program instructions which can cause the program to terminate abnormally. It can occur because of many reasons like: invalid user input, loss of network connection, device failure, physical limitations (out of disk memory), code errors, opening an unavailable file. 

- Hirarchy till Exceptions:

java.lang.Object Parent of everything in Java
   ↓
java.lang.Throwable Parent of all errors & exceptions
   ↓
   ├── java.lang.Error Serious issues (not meant to be handled usually)
   ↓
   └── java.lang.Exception Conditions you can handle in your code
          ↓
          ├── Checked Exceptions (Checked at compile time)
          │      ├── IOException
          │      ├── SQLException
          │      └── ClassNotFoundException
          │
          └── Unchecked Exceptions (Runtime Exceptions), it is programmer's fault. 
                 └── java.lang.RuntimeException
                        ├── NullPointerException
                        ├── ArithmeticException
                        ├── ArrayIndexOutOfBoundsException
                        └── IllegalArgumentException



* try{} block: put your code inside of try block which can create runtime issues. 
* catch(NameOfException e){} : handle that error here inside of catch block. We can put RuntimeException or directly Exception class at the place of NameOfException(NullPointerException, ArithmeticException); We can use multiple catch blocks together as well. This "e" object has multiple inbuilt methods as well. 
* finally{} : this block will always run no matter exception occurs or not. But it can still stop execution in some cases like when we use System.exit() method, or an exception orrurs in the finally block, or the death of a thread. 


Java throws: 
we use "throws" keyword in the method declaration to declare the type of exception that might occur within it. This is done so that when someone calls this method they can handle it properly using try-catch block so that they can get an idea that the method they are going to use can throw this kind of exception. 
Code-
import java.io.*;
class Main{
    public static void findFile() throws IOException{
        // code that may produce IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}


Java throw:
The "throw" keyword is used to explicitly throw a single exception. 
Code-
class Main{
    public static void divideByZero(){
        throw new ArithmeticException("Trying to divide by 0");
    }
}
// Try-Catch Or Throws Exception. 
* But remember if we are throwing exception by ourself then either put that throw statement inside of try block means handle it there only. Or put the "throws" keyword and exception name with function declaration/signature. 

* We can create our own exceptions as well. 






********************************** Java Generics and Wrapper Classes ***************************************

Wrapper Classes: A wrapper class in Java is a class whose objects wraps or contains primitive data types. char -> Character, byte -> Byte, int -> Integer, short -> Short etc. We need it because in DSA the collections frameworks like Arraylist works only with objects. Also an object is needed to support synchronization in multithreading. 

Autoboxing: The automatic conversion of primitive type of the object of their corresponding wrapper class. For example - conversion of int to Integer, long to Long, double to Double etc. 

AutoUnboxing: It is just the reverse of autoboxing. The automatic conversion of wrapper class object to its corresponding primitive data type.  For example - Integer to int, Long to long etc. 

The wrapper class is a class which just have primitive data type inside of it. 

Integer obj = 12; // autoboxing; 
int age = obj;  // autounboxing;

Integer obj = Integer.valueOf("21");  // This method is used to get Integer from any other data type. 


Generics: 
Generics means parameterized types. With the help of it we can define the data type of a variable - not just primitive types but also custom types, which makes the code flexible and type-safe.

class MyClass<E, T>{ // Here we simply have to tell the class that we are using this kind of datatypes inside you. 
    E data;
    T data2;
    void takeData(E data){
        this.data = data;
    }
    T returnData() return data2;
}

MyClass<String, Integer> m1 = new MyClsas<>(); // Here while creating the object of this class we have to define that for this object, what would be the data types of those generic variables of the class. But remember it can contain only wrapper class like Integer, not primitive data type like int. 
MyClass<String, String> m2 = new MyClass<String, String>(); // Older way.

Similarly we can work with interfaces and methods also. 

Generic Methods: We can create generic methods in non-generic class as well. 
class MyClass2{
    <E> void fun(E data){
        sout(data);
    }
}
MyClass2 mc2 = new MyClass();
mc2.fun(123);
mc2.fun("hllo");


Bounded Generics: If we want to use generic data types but want to support only some particular data-types in our method or class then we can use bounded generics. 

class MyClass<T extends Number>{
    T data;
}
// Now T can of number type only like Integer, Float, Double, Byte etc. It can't support String, Boolean, Characters. 





********************************** Java Collection Framework ***************************************

Iterable (interface)
   └── Collection (interface)
         ├── List (interface)
         │     ├── ArrayList (class)
         │     ├── LinkedList (class)
         │     └── Vector (class)
         │           └── Stack (class)
         │
         ├── Set (interface) supports only unique elements. 
         │     ├── HashSet (class) : No order. O(1) complexity for each operation. 
         │     ├── LinkedHashSet (class) : Maintains insertion order. It's complexity for insertion is O(1) but for removal it is O(logN).
         │     └── TreeSet (class) : sorted order, uses red-black tree or BST internally. It's complexity is O(logN) for each task. 
         │
         └── Queue (interface)
               ├── PriorityQueue (class) : sorted based on priority.
               ├── LinkedList (class)
               └── Deque (interface)
                     ├── ArrayDeque (class)
                     └── LinkedList (class)

Map (interface)  ❌ (Not part of Collection)
   ├── HashMap (class)
   ├── LinkedHashMap (class)
   ├── TreeMap (class)
   └── Hashtable (class)

- Collection interface methods:
add(E e), offer(E e), remove(Object o), size(): returns number of elements in the list, isEmpty(), contains(Object o), clear(), iterator(), toArray()

- List Interface methods:
add(int index, E element): add element at a particular index and shift the rest elements to the right side, get(int index), set(int index, E element): updates the value at a particular index, remove(int index), indexOf(Object o)

- ArrayList (Dynamic array, fast access, slow insertion/deletion O(n))
- LinkedList (Fast insertion/deletion, slow access), add(): add at the end, addFirst(), addLast();

- Vector (Legacy): Thread-safe, slower than arraylist.
- Stack (LIFO): push(), pop(), peek()
- Queue (FIFO): add(), offer(), remove(), poll(), peek();
- Deque: addFirst, addLast, removeFirst, removeLast, peekFirst, peekLast.
* Try to implement Stack using ArrayDeque rather than Stack class itself if you don't want thread safety and only performance matters to you. As Stack class implements extends Vector class which is thread safe and uses locks which makes things slower. Also you can directly use push, pop, peek methods. 

*offer and poll are better than add and remove. 

📘 1. TIME COMPLEXITY TABLE (VERY IMPORTANT)
Operation        ArrayList   LinkedList   HashSet   TreeSet   HashMap   TreeMap   Queue(PQ)
------------------------------------------------------------------------------------------
Add              O(1)*       O(1)         O(1)      O(log n)  O(1)      O(log n)  O(log n)
Remove           O(n)        O(1)*        O(1)      O(log n)  O(1)      O(log n)  O(log n)
Access (get)     O(1)        O(n)         ❌         ❌         O(1)      O(log n)  ❌
Search           O(n)        O(n)         O(1)      O(log n)  O(1)      O(log n)  O(n)
Insert middle    O(n)        O(1)*        ❌         ❌         ❌         ❌         ❌
* LinkedList removal is O(1) only if reference is known

HashMap:
- Not thread-safe
- Allows 1 null key + multiple null values
- Faster

Hashtable:
- Thread-safe
- No null allowed
- Slower


Enum: When we want the value of a variable can be of only some given specific values only, then we use enum.
Code-
enum Color{
    RED, YELLOW, GREEN
}


Map interface methods: 
put(key, value): overwrite if key-value pair already exist, putIfAbsent(key, value), 
remove(key), get(key), containsKey(key), containsValue(value), size(), isEmpty(), clear(), 
getOrDefault(key, defaultValue): returns the value present with respect to the key, if the key is not present then it will return the defaultValue.

for(Integer key : hm.keySet()){ } // for traversal using keys. 
for(String val : hm.values()){ } // for traversal using vaues. 
for(Map.Entry<Integer, String> entry : hm.entrySet()){
    sout(entry.getKey() + " " + entry.getValue());
}
The third one using entrySet is the efficient way to traverse HashMap, because it avoids extra lookup. 






********************************** Java Comparable, Comparator and Lambda functions ***************************************
To define custom sorting we use these things in java. For example if we have to sort two employees or two students then we use these things to tell the compiler on which basis we have to sort the objects of employees, if we have a list of employees. 

1. Comparable:
Comparable will define the sorting logic in the class itself by overriding the compareTo method. It is an interface used to define the natural or default sorting order of objects. 
Code-
public class Animal implements Comparable<Animal>{
    int age;
    String name;
    int weight;
    Animal(int age, int name, int weight){
        this.age = age; this.name = name; this.weight = weight;
    }
    @Override
    public String toString(){ // If we directly want to print the Object of animal inside of sout in a particular fashion. 
        return "Animal{" + "age=" + age + ", name=" + name + ", weight=" + weight + "}" + "\n";
    }

    @Override
    public int compareTo(Animal o){
        return this.age - o.age;
    }

}
public static void main(String[] args){
    Animal a1 = new Animal(4, "Leo", 10);
    Animal a2 = new Animal(4, "Leo", 7);
    Animal a3 = new Animal(4, "Bruno", 7);
    Animal a4 = new Animal(3, "Maxo", 6);
    Animal a5 = new Animal(1, "Don", 3);

    List<Animal>dogs = new ArrayList<>();
    dogs.add(a1); dogs.add(a2); dogs.add(a3); dogs.add(a4); dogs.add(a5);

    // dogs.sort();  this always needs a comparator inside of it.
    Collections.sort(dogs);

}

2. Comparator
Comparator is an interface used to define the custom sorting logic. It is implemented outside the class and uses the compare method. If we use comparable then we have to come to the class and update the compareTo() which is not good as some other user or some piece of code could be using that logic of sorting. So, we should define the sorting logic outside of class while sorting, using comparator. It is a functional interface(which has only a single method).
Code-
Collections.sort(dogs, new Comparator<Animal>(){
    @Override
    public int compare(Animal o1, Animal o2){
        return Integer.compare(o1.age, o2.age);
        // It is a better practice to use Integer.compare rather than o1.age - o2.age because sometimes the second method can lead to Integer overflow or say some wrong results. 
    }
});

Comparable → single default sorting, compareTo() -> Takes 1 parameter
Comparator → multiple custom sorting, compare() -> Takes 2 parameters.


3. Lambda functions (Java 8+)
This is a shorter way to define anonymous class and functional interface. 
Code-
Collections.sort(dogs, (a, b) -> {
    if(a.age==b.age) return a.name.compareTo(b.name);
    return Integer.compare(a.age, b.age);
});

* In real-world projects, we mostly prefer Comparator with lambda because it is more flexible and readable.

4.) Comparing method
To use this we have to define the getters like getAge, getName. Then we can use comparing on these getters. Comparator.comparing itself returns a comparator. 
Code-
Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));




compare(a, b) -> a-b for ascending, b-a for descending. 
| Return Value   | Meaning | Result           |
| -------------- | ------- | ---------------- |
| Negative (< 0) | a < b   | a comes BEFORE b | -ve means keep the order same. 
| Zero (0)       | a == b  | No change        |
| Positive (> 0) | a > b   | a comes AFTER b  |


// Internal working. 
for Descending: We are using (a,b) -> Integer.compare(b,a);
(a,b) says In the list a is before b. By using Integer.compare(b,a), we want to do b-a, if this gives -ve that means b is smaller. And, -ve means keeps the order same, so a, b will be the order where a > b. 



Arrays.sort(arr, (arr1, arr2) -> {
    return arr1[0] - arr2[0];
}); // way to sort a 2D array on the basis of 1st element of each row. 









********************************** Multithreading ***************************************
CPU: The brain of computer which executes intructions from program and performs arithematic, logical, control and I/O operations. eg. Intel, AMD. A CPU (Central Processing Unit) is a physical hardware component inside the computer.
Core: The individual processing unit within a CPU. Modern CPUs have multiple cores allowing them to perform multiple tasks simultaneously. A core is an actual processing unit inside the CPU that executes instructions.
Program: is a set of intructions written in a programming language that tells the computer how to perform a specific task. 
Process: Instance of a program that is being executed. When a program runs, the OS creates a process to manage its execution. 
Thread: is the smallest execution unit within a process. A process can have multiple threads which share same resources but can run independently. 

Applications
    ↓
Operating System (OS): It is a software. 
    ↓
CPU / Cores (Hardware)
    ↓
Physical electronics (transistors, circuits)


Multitasking: It is the ability of an OS to run multiple processes simultaneously. On a single-core CPU, this is done through time-sharing, rapidly switching b/w tasks. On multi-core CPUs, true parallel execution occurs. OS-scheduler balances the load, ensuring efficient and responsive system performance. 
Multithreading: refers to the ability to execute multiple threads within a single process concurrently. Eg. We have multiple threads for rendering th page, running JS, managing user inputs. It is more granular. 
Time Slicing: divides CPU time into small intervals called time slice or quanta. It prevents monopolizing the CPU, enable concurrent execution as CPU will allocate these quanta to threads and processes. 
Context Switching: is the process of saving the state of a corrently running process or thread and loading the state of the next one to be executed. When a process or thread's time slice expires, the OS schedule performs a context switch to move the CPU's focus to another process or thread. 

Java Multithreading: 
Java multithreading properties are present in java.lang package. JVM and OS both helps in multithreading. Multithreading is supported via java.lang.Thread class and java.lang.Runnable class. When a java program starts, one thread begins immediately, which is called main thread. This thread is responsible for executing the main method of a program. 

1.) Multithreading using Thread Class
- A new class is created which will extends Thread class. 
- Inside of this class we will override the run method to define the code that constitutes the new thread. 
- Create object of this newly created class (inside the main function or where we want to use this class)
- start method is called using this object to initiate new thread. 
* Thread.currentThread().getName(); # to get the name of the thread. 
* Also the execution of threads occur in random order. 

Code: 
ThreadClass1.java
package threadlearning; // Remember the package name should be entirely in lowercase.
// If we compile and run using the terminal the .class file will be created inside of same src/package folder. But if I directly run it using the run button then the .class file will be created inside of output(out) folder and will be executed from there.
public class ThreadClass1 {
    static void main() {
        ThreadClass2 tc2 = new ThreadClass2();
        tc2.start();
        for(int i=0; i<10; i++) System.out.println("Hello");
    }
}
ThreadClass2.java
package threadlearning;
// Java automatically imports java.lang.*; That's why we don't need to import java.lang.Thread class here. Also because of the same reason we can easily use String, Math, System, Thread, Exception, Object classes.
public class ThreadClass2 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<10; i++) System.out.println("World");
    }
}



2.) Multithreading using Runnable Interface
- A new class is created that implements Runnable interface. 
- Same run method is override. 
- Now we create the object of this newly created class but we can't do newObject.start() because this start() method itself is present inside of Thread class. 
- So, we will create the object of Thread class and pass this newObject inside of the object of Thread class as contructor argument. 
- Now call the start() method using the object of Thread class. 

Code: 
ThreadClass1.java
package threadlearning1;
public class ThreadClass1 {
    static void main() {
        ThreadClass2 tc2 = new ThreadClass2();
        Thread t1 = new Thread(tc2);
        t1.start();
        for(;;) System.out.println("Hello");
    }
}
ThreadClass2.java
package threadlearning2;
public class ThreadClass2 implements Runnable{
    @Override
    public void run(){
        for(;;) System.out.println("World");
    }
}




Java Thread LifeCycle:
1 New: A thread is in this state when it is created but not yet started. 
2 Runnable: After the start method is called, the thread becomes runnable. It's ready to run and is waiting for CPU time. 

3 Running: The thread is in this state when it is executing. But remember there is no Running state inside of Thread class and Runnable interface. Runnable and Running are considered as same. There is an enum inside of Thread.java which has "NEW", "RUNNABLE", "BLOCKED", "WAITING", "TIMED_WAITING", "TERMINATED".

4 Blocked/Waiting: A thread is in this state when it is waiting for resources or for another thread to perform an action. 
5 Terminated: A thread is in this state when it has finished execution. 

- t1.getState(); # to get the state of the thread. 
// Try-Catch Or Throws Exception
- Thread.sleep(timehere); # Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds. But remember if we are using it inside of any function then either use try-catch or that function has to throws InterruptedException. But if we are using it inside of any Overridden method (like run) then we have to use try-catch only, because we can't change the signature of the overridden method. 

- t1.join(); # Now the thread that is calling this t1 class thread will wait until the complete execution of this t1 class thread. Like here the main thread is calling thread-0 (thread of t1 class)

Code: 
public class ThreadClass1 {
    static void main() throws InterruptedException{
        System.out.println("Main thread state: "+Thread.currentThread().getState());
        ThreadClass2 tc2 = new ThreadClass2();
        System.out.println("state of tc2 is: "+tc2.getState());
        tc2.start();
        System.out.println("After start, state of tc2 is: "+tc2.getState());
        for(int i=0; i<10; i++) System.out.println("Hello");

        Thread.sleep(100);
    }
}

Question: If we have Thread class then do we need Runnable ? 
Ans: If we want to create the thread of a child class then we can't extend Thread class as multiple inheritance is not possible in Java using Classes. In that case we have to implements Runnable interface. 



--------------- Java Thread methods: --------------- 
- t.setPriority(); // 0-10 min-max. Remember after setting the priority it doesn't mean that this particular thread will execute first or last. But this is a hint to the OS and JVM that try to execute this thread as late or early as possible. t1.getPriority() or Thread.getPriority for current thread. 
- To rename a thread we can simply create the constructor the class and call the constructor of parent class by passing that newName in super. 
- t.interrupt(); // method to interrupt the execution of thread. But remember it doesn't stop and destroy the thread immediately. It only sends an interruption signal/request. 
- Thread.yield(); // It is a method to hint the schedule that "I am willing to pause now, so another thread can run". Remember it is just a suggestion. Schedular can ignore it completely. 
- User Thread: is a normal thread that performs important work. JVM waits for all user threads to finish before exiting. eg. main thread, worker thread, business logic threads. 
- Daemon Thread: is a background/support thread. eg. garbage collector, auto-save services, monitoring threads. JVM doesn't wait for daemon threads. When all user threads finish, JVM terminates, daemon threads stop automatically. 
t.setDaemon(true);  // must be called before start to make a thread as daemon thread. 
t.start();



--------------- Synchronization: --------------- 
- synchronized keyword: is used with functions or we can make a synchronized block as well inside of a function like synchronized(){}; It controls multiple threads accessing shared resources. synchronized allows only one thread at a time to access a critical section.. It prevents race condition, and inconsistent data. It ensures mutual exclusion. It is an implicit/intrinsic lock.


- Race condition: occurs when two or more threads access shared data and try to change it at the same time. 
How It Happens:
Most race conditions happen because an operation that looks like one step to us is actually multiple steps for the CPU.

Take the simple statement: count++;
In the background, Java performs three distinct steps:
    1. Read the current value of count.
    2. Modify the value (add 1).
    3. Write the new value back to memory.

If Thread A reads the value, and then Thread B reads the same value before Thread A can write its update, both threads will increment the same starting number. One of those increments will be "lost."

Threads: We can also create an anonymous class using Runnable and Override the run method. 
Runnable rn = new Runnable(){
    @Override
    public void run(){
        // some task here. 
    }
}
Thread t1 = new Thread(rn, "thread1"); // (task, threadName)

-------- Explicit Locks --------
Explicit locks: Explicit locks in Java are advanced thread synchronization mechanisms provided by the Lock interface that give more control than synchronized, such as manual locking, tryLock, fairness, and interruptible locking.
Explicit locks are provided in: java.util.concurrent.locks
Main interface: Lock
Most commonly used implementation: ReentrantLock


Lock lock = new ReentrantLock();
try{
    lock.lock(); // the thread will wait until it receives the lock. 
    lock.tryLock(); // the thread will try to get the lock, if the lock is not available it will leave. It prevents deadlock. 
    lock.tryLock(time, timeUnit); // wait and try to get the lock within the given specified time. If the lock is not available the thread will leave. 
    lock.unlock(); // always unlock in the finally block. 
}
catch(InterruptedException e){
    Thread.currentThread().interrupt(); // always do this. It restores the interrupted status (means it tells to the higher-level code "hey this thread was interrupted") because InterruptedException clears the interrupt flag bydefault. 
}

Why This Is Important
Suppose outer code checks interruption:
while(!Thread.currentThread().isInterrupted()) {

}

ReentrantLock: Same thread can acquire the same lock multiple times, but it has to release the lock same number of times as well. A count is maintained internally. 

Lock Interruptiblity: 
lock.lock(): Thread waits no matter what, until gets lock. Even if someone says: "Stop waiting and go home"
lock.lockInterruptibly(); "I'll wait for the key, but if someone interrupts me, I'll stop waiting."

Code: 
import java.util.concurrent.locks.ReentrantLock;
public class InterruptibleLockExample {

    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            lock.lock();

            System.out.println("Thread 1 acquired the lock");

            try {
                Thread.sleep(5000);
            }
            catch (Exception e) {

            }

            System.out.println("Thread 1 releasing the lock");

            lock.unlock();
        });

        Thread t2 = new Thread(() -> {

            try {

                System.out.println("Thread 2 trying to acquire lock");

                lock.lockInterruptibly();

                System.out.println("Thread 2 acquired the lock");

                lock.unlock();
            }
            catch (InterruptedException e) {

                System.out.println("Thread 2 was interrupted while waiting");
            }
        });

        t1.start();

        try {
            Thread.sleep(100);
        }
        catch (Exception e) {

        }

        t2.start();

        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {

        }

        System.out.println("Main thread interrupts Thread 2");

        t2.interrupt();
    }
}

- Lock Fairness: threads get the lock in the order they requested it. It helps to prevent threads starvation. 
Lock lock = new ReentrantLock(); // bydefault it is unfair. 
Lock lock = new ReentrantLock(true); // Now this is fair. 

-Read/Write Lock: To increase the efficiency. ReadWriteLock allows multiple threads to read shared data simultaneously while ensuring exclusive access for write operations.
ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

Lock readLock = lock.readLock();
Lock writeLock = lock.writeLock();

readLock.lock(); 
writeLock.lock();


synchronized vs Lock
| Feature               | synchronized | Lock |
| --------------------- | ------------ | ---- |
| Automatic release     | Yes          | No   |
| Manual unlock         | No           | Yes  |
| tryLock support       | No           | Yes  |
| Interruptible waiting | No           | Yes  |
| Fairness option       | No           | Yes  |
| Starvation            | Yes          | No   |
| Read/Write lock       | No           | Yes  |
| Simpler               | Yes          | No   |



Deadlock: is a situation where two or more threads are waiting for each other’s resources indefinitely, so none of them can proceed.

1. Deadlock example using synchronized keyword (intrinsic lock):
Thread 1 has Pen A and wants Pen B
Thread 2 has Pen B and wants Pen A

Code: 
public class DeadlockDemo {

    public static void main(String[] args) {

        String penA = "Pen A";
        String penB = "Pen B";

        Thread t1 = new Thread(() -> {

            synchronized (penA) {

                System.out.println("Thread 1 took Pen A");

                try {
                    Thread.sleep(100);
                }
                catch (Exception e) {

                }

                System.out.println("Thread 1 waiting for Pen B");

                synchronized (penB) {

                    System.out.println("Thread 1 took Pen B");
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (penB) {

                System.out.println("Thread 2 took Pen B");

                try {
                    Thread.sleep(100);
                }
                catch (Exception e) {

                }

                System.out.println("Thread 2 waiting for Pen A");

                synchronized (penA) {

                    System.out.println("Thread 2 took Pen A");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
// In case of synchronized the unlock is handled by itself. 


2. Deadlock example using Explicit lock: 
T1 → has A → waiting for B
T2 → has B → waiting for A

Code: 
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class DeadlockExample {

    static Lock lockA = new ReentrantLock();
    static Lock lockB = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            lockA.lock();

            System.out.println("Thread 1 locked Lock A");

            try {
                Thread.sleep(100);
            }
            catch (Exception e) {

            }

            System.out.println("Thread 1 waiting for Lock B");

            lockB.lock();

            System.out.println("Thread 1 locked Lock B");

            lockB.unlock();
            lockA.unlock();
        });

        Thread t2 = new Thread(() -> {

            lockB.lock();

            System.out.println("Thread 2 locked Lock B");

            try {
                Thread.sleep(100);
            }
            catch (Exception e) {

            }

            System.out.println("Thread 2 waiting for Lock A");

            lockA.lock();

            System.out.println("Thread 2 locked Lock A");

            lockA.unlock();
            lockB.unlock();
        });

        t1.start();
        t2.start();
    }
}

Question: How the code is actually working, it is looking new, how we are passing things inside of a thread ? 
Answer: We are using lambda expression. As we know we can create anynoymous class an pass it. Or we can pass function interface as well. Or to short it as we know we have a single function updation only and that is run() function. So, we can directly use lambda functions here. Lambda expression is basically an anonymous function. Runnable is a functional interface that is why we can replace it with lambda expression. 


4-condition for a Deadlock:
    1. Mutual Exclusion: Only one thread can access a resource at a time. 
    2. Hold and wait: A thread is holding at least one resource and is awaiting to acquire additional resources held by other threads. 
    3. No Preemption: Resources cannot be forcibly taken from threads holding them. 
    4. Circular Wait: A set of threads is waiting for each other in a circular chain. 

Ways to Avaoid Deadlock:
1. Maintain consistent lock order: Always acquire lock in the same order across all threads. 
2. use tryLock() or if possible tryLock() with time. 
3. keep critical section small and put concurrent utilities on higher-level. 
4. Minimize nested locks. 
5. Detect lock during debugging using jstack. 

* ACID properties in Database. 

* Thread Communication: 
Without proper communication mechanisms, threads might end up in inefficient busy-waiting, leading to wastage of CPU resources and potential deadlocks. 
Producer-Consumer problem. 
If the queue is empty consumer should wait. if producer adds data consumer should wake up. If queue is empty producer should add data in the queue. This problem is solved using Thread communication. 
    1. wait(): Makes current thread release the the lock and go into waiting state. Thread stays waiting until another thread calls notify() or notifyAll() method. 
    2. notify(): wakes up one waiting thread. 
    3. notifyAll(): wakes up all waiting threads. 

Remember these methods must be called inside synchronized block or method other you will get IllegalMonitorStateException. 

class Shared {

    private boolean available = false;

    synchronized void produce() {

        System.out.println("Produced Item");
        available = true;
        notify(); // wake consumer
    }

    synchronized void consume() {

        while (!available) {
            try {
                wait(); // wait until item available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumed Item");
        available = false;
    }
}

public class Main {

    public static void main(String[] args) {

        Shared obj = new Shared();

        Thread producer = new Thread(() -> {
            obj.produce();
        });

        Thread consumer = new Thread(() -> {
            obj.consume();
        });

        consumer.start();
        producer.start();
    }
}

* Thread Safety: Means when multiple threads are trying to access a resource but race condition is not occuring, data is consistent. 

* Thread Pool: Collection of pre-initialized threads that are ready to perform a task. Here threads are created once, reused multiple times. We need thread pool because new thread creation every time takes time, memory is allocated, CPU scheduling overhead increases. This controls over thread count, increase response time and better resource management. 
    Task → Thread Pool → Available Worker Thread
Basic Analogy: Like the Restaurant don't hire a new waiter for every new customer. 


Executor Framework: Instead of creating and managing threads manually we can use an inbuilt concurrency framework. Because manual thread creation and management is memory heavy, uncontrolled thread count, increase response time as well. It was introduced in Java 5. 

Present inside package: java.util.concurrent

Executor (Interface)
│
├── ExecutorService (Interface)
│   │
│   ├── ScheduledExecutorService (Interface)
│   │
│   └── AbstractExecutorService (Abstract Class)
│       │
│       ├── ThreadPoolExecutor (Class)
│       │   │
│       │   └── ScheduledThreadPoolExecutor (Class)
│       │
│       └── ForkJoinPool (Class)
│
└── Executors (Utility Factory Class)

Task → Executor → Thread Pool → Execution



* Worker Threads -> that executes tasks. Task Queue -> stores waiting tasks. 
* Pool Size Limits: 
    i.) corePoolSize(default number of threads available to execute a task)
    ii.) maximumPoolSize (maximum number of threads that can exist in thread pool including the newly created threads. These new threads are created automatically if threads count is < maximumPoolSize and no normal worker thread is available to execute newly coming taks and queue is also full. These newly created threads gets destroyed when no new task is present either in the queue or somewhere else and normal worker threads are available).
* Rejection Policy -> what happens when both the threads and queue are full. 


* Working: A thread pool contains a set of worker threads and a task queue. When a new task arrives, if a thread is available, the task is executed immediately. If all threads are busy, the task is placed into the queue. If the queue also becomes full, then either a new thread is created (if the maximum pool size has not been reached) or a rejection policy is applied. Depending on the rejection policy, the new task may be discarded, or the oldest waiting task in the queue may be removed and replaced with the new task.

Code: 
import java.util.concurrent.Executors;
ExecutorService executor = Executors.newFixedThreadPool(2); // Thread pool will have only two threads.
for(int i=0; i<5; i++){
    executor.execute(()->{
        sout("i="+i+" threadName="+ Thread.currentThread().getName()); // Here you will see that only two thread names will come. 
    })
}
executor.shutdown(); // This is important to do. It tells No more new tasks will come. Finish the already submitted tasks and then terminate the worker threads. If it is not done, thread pool may keep running indefinitely. 

' executor.shutdownNow(); // Tries to shutdown immediately. 

// Here we don't have to create the threads by ourself. We can use the inbuilt methods and simply pass the runnable inside of those methods. 

* Runnable: We can say a lambda function or a task that don't return anything. These are basically consumers. These simply perform some work. .execute(runnable); runnable has run() method in built. Exception is lost. 

* Callable: These return something. These are producers. .submit(callable); submit can accept both runnable and callable while the execute can only accept runnable. submit returns a Future value. callable has call() method in built. We can catch the exception. 

* Future: As we know the tasks are executed in asynchronous manner so we can't directly store the returned value of submit's callable ' in a variable because the normal variables need instant assignation. That is why a new data type was introduced called Future which represents the result of asynchronous computation. In real Future is not a data type. It is an interface present inside of : java.util.concurrent.Future.

Code:
Future<Integer>future = executor.submit(callable which will return integer value); // Remember Future is an interface.  Name can be anything "future", "a", "hello" etc. 

What if some exception occurs: Two type of exceptions future throws InterruptedException and ExecutionException and both are compile time handled. 
try {
    future.get();
} catch (ExecutionException e) {
    System.out.println(e.getCause());
}

Some inbuilt methods of Future:
future.get(); // returns the result. If result is not ready then the main thread will wait or say stops working and this thread which is executing callable of this future will execute. 
future.isDone(); // returns true/false.
future.cancel(); // try to cancel task.
isCancelled(); // check cancelled or not. 
So, we prefer to pass even the runnable into .submit so that we can use these methods on it. 

Few other methods:
What if we have multiple callables. Then we can use:
i) invokeAll(takes a list/collection of callable tasks only not runnable); waits untill all taks complete, returns a list of future objects. 
Code: 
    List<Future<Integer>> futures =
    executor.invokeAll(tasks);
ii) invokeAny(takes a list of callable); returns result of FIRST successfully completed task, remaining tasks are cancelled/interrupted.



Executors.newFixedThreadPool(2); internal working. It internally creats the below object. This is enough in most of the cases. But if we need too much control then we can use the below one. 
ThreadPoolExecutor executor = new ThreadPoolExecutor(
    int corePoolSize, // corePoolSize: 2,
    int maximumPoolSize,  // maximumPoolSize: 5,
    long keepAliveTime,   // keepAliveTime: 10,
    Timeunit unit,        // TimeUnit.SECONDS,
    Blocking queue        // new ArrayBlockingQueue<>(capacity:5)
);
type of queue: 
i) ArrayBlockingQueue
ii) LinkedBlockingQueue: this can be infinite in size. 



Type of thread pools: 
i) newFixedThreadPool(): limited number of threads and unlimited size of queue. Good for servers, APIs, database processing. 
ii) newCachedThreadPool(); unlimited number of threads as threads are created dynamically on demand. keepAliveTime is 60seconds. Empty queue. So much memory. Good for small tasks.  
iii) newSingleThreadExecutor(); only one worker thread. Tasks are executed sequentially. Good for logging systems. Slow for larget workloads. 

iv) Scheduled thread pool: Used to execute tasks after a delay or repeatedly at fixed intervals. Mainly used for send OTP expiry, clean cache every 10min, run background taks. 
Code: ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
imp. methods:
- scheduler.schedule(task, delay, timeUnit); // used to execute a task once after a delay from current time.  
- scheduler.scheduleAtFixedRate(task, initialDelay, period, timeUnit); // tries to maintain to the period diff between two tasks execution including the execution time of first task. taskExecutionTime=1 sec, delay=3sec. next task will execute after 3sec. 
- scheduler.scheduleWithFixedDelay(task, initialDelay, period, timeUnit); // same as upper but it doesn't include the task execution time. taskExecutionTime=1 sec, delay=3sec. next task will execute after 4sec. 

- ForkJoinPool. 


Rejection Policies: 
- Abort Policy: Reject the newly coming task with exception. 
- Discard Policy: Reject the newly coming task silently. 
- Discard Oldest Policy: Removes oldest waiting task from the queue and  insert newly coming task at the end of the queue. 





------------------------------ CompletableFuture: ------------------------------------ 

Future has some limitations that when we use f1.get() it will stop the execution of current thread and makes the thread kind of sequential execution which is not good. Because the basis of threads is to increase parallel execution. 


CompletableFuture introduced in Java 8. This helps us to do chaining of methods and it is non-blocking. 
Code:
CompletableFuture<Integer>future = CompletableFuture.supplyAsync(lambda function here)
                                            .thenApply(num -> num*10)
                                            
CompletableFuture<Void>future2 = CompletableFuture.supplyAsync(()-> 10)
                                            .thenAccept(num -> sout(num));
// We can do chaining of functions here. 

thenApply() : Transforms results and returns something. 
thenAccept() : Consumes result but returns nothing.
thenRun() : Runs another task after completion.

// While chaining, the next method will accept the return value of upper/previous one. See example 2, where we are not returning anything from the last method as it consumed the returned values of previous method. So, the reference variable will accept "Void" kind of value as it is not actually accepting anything. 


.runAsync(runnableOnly)
.supplyAsync(callable)


* Combine Futures: f1.thenCombine(f2, combinationLogic): 

Used to combine to output/result of two futures. 
Code: 
CompletableFuture<Integer> future1 =
        CompletableFuture.supplyAsync(() -> 10);

CompletableFuture<Integer> future2 =
        CompletableFuture.supplyAsync(() -> 20);

CompletableFuture<Integer> result =
        future1.thenCombine(future2, (a, b) -> a + b);

System.out.println(result.join()); // So, that the main thread can wait till we get result from this thread. 


* Thread Pool 

By default: Uses common ForkJoinPool
You can provide custom ExecutorService.
Code:
ExecutorService executor = Executors.newFixedThreadPool(3);
CompletableFuture.supplyAsync(() -> {
    return "Hello";
}, executor);




------------------------------ ForkJoinPool: ------------------------------------ 

ForkJoinPool is a special thread pool in Java designed for: Parallel execution, Recursive divide-and-conquer tasks, Efficient utilization of CPU cores
It was introduced in Java 7 in: java.util.concurrent

Each thread has its own queue as well apart from the main queue of the thread pool which is called work-stealing queue. If no task is present in the work stealing queue of current thread and no task is presen in the main queue as well. It will steal the work from the queue of another task and do it. Each task is broken down into smaller parts and then sent to work-stealing queue. 


Two important subclasses:
Class	           | Returns Result?
RecursiveTask<T>   |        Yes
RecursiveAction	   |        No


Example: Sum of Array Using ForkJoinPool. This is simply a divide and conquer technique. 
Code:
import java.util.concurrent.*;
class SumTask extends RecursiveTask<Integer> { // We have to extends RecursiveTask<?> class. 

    private int[] arr;
    private int start;
    private int end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        // Small task
        if (end - start <= 2) {
            int sum = 0;

            for (int i = start; i < end; i++) {
                sum += arr[i];
            }

            return sum;
        }

        // Divide task
        int mid = (start + end) / 2;

        SumTask leftTask = new SumTask(arr, start, mid);
        SumTask rightTask = new SumTask(arr, mid, end);

        // Fork left task. Means we will not do it by ourself. The another thread will do it. 
        leftTask.fork();

        // Compute right directly
        int rightResult = rightTask.compute();

        // Join left result
        int leftResult = leftTask.join();

        return leftResult + rightResult;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        ForkJoinPool pool = new ForkJoinPool();

        SumTask task = new SumTask(arr, 0, arr.length);

        int result = pool.invoke(task);

        System.out.println(result);
    }
}



------------------------------ ThreadLocal: ------------------------------------ 
ThreadLocal in Java is used to create thread-specific variables.

It means:
Every thread gets its own separate copy of the variable.
Changes made by one thread are NOT visible to other threads.

Code:
ThreadLocal<String>threadLocal = new ThreadLocal<>();
// we can use get, set methods. 
Thread t1 = new Thread(()->{
    threadLocal.set("ashish");
})
Thread t2 = new Thread(()->{
    threadLocal.set("golu");
})
// Now we don't have to use Locks and race condition will also not happen. 



Virtual Threads are lightweight threads introduced in Java as part of Project Loom.
They became officially available in: Java 21 (stable)

Package:
java.lang.Thread

Traditional java Threads(platform threads) are managed by the OS, expensive to create and consume more memory. Here virtual threads comes into picture which are managed by JVM, very lightweight and can create millions of them. 
Internal Working:
Virtual threads run on top of a small number of real OS threads called: Carrier Threads. JVM schedules virtual threads onto carrier threads. If 
If any virtual thread block because of any reason may be I/O opertion or any other reason. Then JVM will break the connection of this virtual thread with the OS thread and connect the OS thread will another virtual thread. 

Virtual Threads
   ↓ ↓ ↓ ↓ ↓
Carrier Threads (few OS threads)
   ↓
  CPU

  
Code:
ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

executor.submit(() -> {
    System.out.println("Task");
});
// Each task gets a new virtual thread.































// End. 

