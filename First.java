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












