
public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

/* every line of code that runs in java must be inside a class,
 class name must match the filename,
 any code inside the main() method will be executed,
 each code must end with a semicolon */

// types of variables: String "", char '', int, float, boolean

// to create a variable called name of type String and assign it the value "John":

String name = "John";

public class MyClass {
  public static void main(String[] args) {
    String name = "John";
    System.out.println(name);
  }
}

// to create a variable MyNum of type int and assign it the value 15:
int MyNum = 15;
System.out.println(MyNum);
//or
int MyNum;
MyNum = 15;
System.out.println(MyNum);

// to overwrite prev value:
int myNum = 15;
myNum = 20;  // myNum is now 20
System.out.println(myNum);

// to prevent variable from being overwritten:
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable

// how to declare the variables:
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
long myNum = 150000000L;
double myFloatNum = 19.99d;

// e or E are used to indicate a power of ten; float myNum = 12e3f returns 12000.0

// can use ASCII values to display certain characters:
char a = 65, b = 66, c = 67;

String name = "John"
System.out.println("Hello" + name);

String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;

system.out.println(5+6);

// to declare more than one variable of the same type:
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);

// variable names should start with a lowercase letter

// widening (automatic) vs narrowing (manual) casting:
public class MyClass {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}

public class MyClass {
  public static void main(String[] args) {
    double myDouble = 9.78;
    int myInt = (int) myDouble; /* Manual casting: double to int [by placing the type
                                 in parentheses in front of the value] */

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}

/* modulus (%) returns the remainder of a division eqn, increment (++) increases the value of the variable by 1, decrement (--) does the opposite */

// some operators: &=, |=, ^=, >>=, <<=

// &&: logical and, returns true if both statements are true: x < 5 &&  x < 10
// ||: logical or, returns true if one of the statements is true: x < 5 || x < 4
/* !: logical not, reverse the result; returns false if the result is true: !(x < 5 && x < 10) */

// to find the length of a string called txt:
System.out.println(txt.length());

// other string methods:
txt.toUpperCase()
txt.toLowerCase()
txt.indexOf () //returns the index of the first occurrence of specified text in a string

//example:
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7

txt.concat() //concatenates two strings, example: firstName.concat(lastName)

// backslash (\) escape character turns special characters into string characters:
String txt = "We are the so-called \"Vikings\" from the north.";

// can use \' to insert single quote or \\ to insert a single backslash

// \n: New Line, \r: Carriage Return, \t: Tab, \b: Backspace, \f: Form Feed

// if you add a number and a string, the result will be a string concatenation

// java Math class has many methods:
Math.max(x,y);
Math.min(x,y);
Math.sqrt(x);
Math.abs(-4.7);
Math.random(); //returns a random number between 0.0 inc and 1.0 exc
int randomNum = (int)(Math.random() * 101);  // 0 to 100

// boolean values: true, false

// if-else: if, else, else if, switch

if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}

// example:
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."

// short hand if-else -- ternary operator:
variable = (condition) ? expressionTrue :  expressionFalse;

int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);

/* switch: [switch expression is evaluated once, the break and default keywords are optional, value of the expression is compared with values of each case */

switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}

int day = 4;
switch (day) {
  case 6:
    System.out.println("Today is Saturday");
    break;
  case 7:
    System.out.println("Today is Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
// Outputs "Looking forward to the Weekend"

// while loop:
while (condition) {
  // code block to be executed
}

int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}

int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}

/* do-while loop: [executes the code block once, before checking if the condition is
 true, then it will repeat the loop as long as the condition is true] */

do {
  // code block to be executed
}
while (condition);

// for loop:
/* statement 1 is executed (one time) before the execution of the code block, statement 2 defines the condition for executing the code block, statement 3 is executed (every time) after the code block has been executed.*/

for (statement 1; statement 2; statement 3) {
 // code block to be executed
}

for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

public class MyClass {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}

for (int i = 0; i <= 10; i = i + 2) {
  System.out.println(i);
}

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}

// for-each loop: [used to loop through elements in an array]

for (type variableName : arrayName) {
  // code block to be executed
}

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

// arrays: used to store multiple values in a single variable

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

System.out.println(cars[0]);
// Outputs Volvo

// to change the value of an array element:
cars[0] = "Opel";

// to find array length:

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4

// loop through array using length property -- or use for-each loop:

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}

// [for-each]
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

// multidimensional array:

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; // this is a 2-d array

int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
int x = myNumbers[1][2];
System.out.println(x); // Outputs 7

public class MyClass {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}

