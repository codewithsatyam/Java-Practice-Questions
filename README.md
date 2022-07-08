# Java-Practice-Questions
This repository consists of theory and programming questions I solved during Java course by Rahul Mathakari Sir.

************************************************
### Assignment 1 | Theory

1. What are command line arguments and explain the working of them?
2. How to convert a numeric string into an integer?
3. Explain working of all parse methods?
4. Explain Scanner class and all its nextXXX() methods?
5. Why nextChar() method is not available in class Scanner?
6. What are packages in java?
7. Explain Benefits of packages over header files?
8. Explain Number FormatException and the situation when it will arise?
9. Explain Input Mismatch Exception and the situation when it will arise?
10. Explain ArrayIndexOutOfBoundsException and the situation when it will arise?

************************************************
### Assignment 1 | Practicle

1. Find the absolute value of any number using ternary operator. Example absolute value of -10 is 10 and absolute value of 20 is 20 only.
2. Find the smallest number between three numbers using nested ternary
operator.
3. Accept three sides of triangle in any order that is user can give three
sides as 3 4 5 or 4 5 3 or 3 5 4 in all situations you have to check that
given input can form a right-angled triangle or not. If given input can
form Right angled triangle print 1 else print -1.

4. Accept 5 subject marks using command line argument and if, in all
subject student secure more than or equal to 35 marks add all subject
marks and find percentage and print it. If student is failed in one or more
subject print failed along with subject number/numbers.
Example: 78 34 89 64 21
Output: Failed 2 5

5. Accept a two digits number from command line argument like 01 or 02
or 11 or 99 and suppose these are the years like 1901,1902, 1911 and
1999 now find the accepted year is leap year or not.

************************************************
### Assignment 2 |

1. WAP to accept 2 numbers and a symbol in string format now according
to symbol perform the operation and display the result. Now ask user do
you want to continue if user enters true continue the process and again
accept two numbers and a symbol perform the operation and display
the result. If user enters false terminate the process.

2. WAP to accept two numbers where n1>n2 or n2>n1 both allowed but
n1==n2 not allowed your task is to find all the numbers between n1 and
n2 (including n1 and n2) that are divisible by 3 and 5 both numbers. And
output should be get printed in increasing order of numbers.<br>
Example: n1=30, n2=10 numbers between n1 and n2 that are divisible by
3 and 5 both are 15 and 30 only so print 15 30 in output (in increasing
order).

3. WAP to accept two numbers n1 and n2 from the user and print all the
prime number available between n1 and n2 in decreasing order.
Example: n1=10 n2=20, available prime numbers between the range is
19 17 13 11 (print in decreasing order)

4. WAP to accept n where 1<=n<=4 digit number and check whether it is
Armstrong number or not.

5. WAP to accept three numbers n1 n2 and p from the user and find the
even numbers between the n1 and n2 (including n1 and n2) now your
task is to only print all the pth even number found between n1 and n2.<br>
Example: n1 =2 n2=20 p=3
All even numbers between n1 and n2 are 2 4 6 8 10 12 14 16 18 20
Here p=3 so print every third even number from the sequence so output
will be 6 12 18.

6. WAP to find the kth digit of a accepted numbers. So accept two numbers
n and k where k denotes place of digit that has to display.<br>
Example n=56789 and k=2 so from right to left 8 is the second digit so
print 8 in output.
If k is greater than number of digits available in n print message kth digit
not found.
Example: n=56789 n=10 so print message 10th digit not found.

************************************************
### Assignment 3 |

1. WAP to accept an integer n from user and create array of size n. now
accept n values in array by user. Values can be duplicate. Now find the
most repeated element in array. if all elements are with frequency 1
print the message "all element has same frequency"

2. WAP to accept an integer n from user and create array of size n. now
accept n values in array by user. Values can be duplicate. now reverse
the elements of array. Do not create another array.
Note: Do not print array in reverse manipulate the array itself such that
elements of array get stored in reverse order in same array.

3. WAP to accept an integer n from user and create array of size n. now
accept n values in array by user. Now find the sum of all even terms and
all odd terms available in array. finally print the sum of both in output.

4. WAP to accept an integer n from user and create array of size n. now
accept n values in array by user. Now find how many prime numbers are
available in array.

5. WAP to accept an integer n from user and create array of size n. now
accept n values in array by user. Now find how many Fibonacci terms are
available in array. Fibonacci term are those numbers which are available
in Fibonacci series for example 0 1 1 2 3 5 8 13..... so these all terms are
Fibonacci terms.

************************************************
### Assignment 4 |
Q.1 write a program to find largest and smallest number in unsorted array of 10 integers.

Q.2 write a program to accept n positive and negative integers in array in random order now
rearrange the array such that beginning part of array contains positive numbers followed by
negative numbers.

Q.3 Write a program to ask the user to enter the number of branches of mysirg academy.
Now ask the user to enter the number of courses running in first branch and the number of
students in each course of that branch and do the same process for rest mysirg academy
branches. Now calculate and display the total number of students in each branch of mysirg
academy.

Q.4 Write A program to accept n digit number now find the length of that number and store
each digit in array. Now find the sum and average of stored element.

Q.5 Write a program to create a 2d int array of size nxm where n and m should be taken by
user. Now accept input in it. Now find the sum of all boundary elements. (that means only
the elements which are available on border of array).

***************************************************
### Assignment 5 |
1. Create a Student class with rollno, name, totalmarks as data members.
Create the constructor to initialize them. Now create the array of
students where array size given by user. Now find the topper of class by
comparing total marks of student finally display the rollno, name and
marks of topper student.

2. Create a class Employee with data member id, name, sal and
commission. Create the constructor to initialize them. Your task is to find
the number of employee in company at any point of time. Also find the
lowest paid employee. The lowest paid employee should have sal +
commission value minimum.

3. Create an array such that it keeps the record of grocery items per
month. For example, in January month you purchased 5 items of 100
200 150 290 540 rupees. While in February you only purchased 3 items
of 540 100 and 230. Your task is to maintain 12-month grocery
expenditure in array and find the month in which your expenditure is
most. Print the number of that month in output.

4. Create a class Employee with data member id, department and sal. for
department three values are there Manager, HR, Finance for these three
company provide bonus as 25000, 20000 and 18000 respectively. Your
task is to create the array of Employee where array size given by user.
Initialize the data members using constructor and finally print the total
sal= sal+bonus occupied by each employee. You can create methods in
class as per your requirement.

To compare the department please use String class equals() method.
*******************************************************
### Assignment 6 |

Note: choose wisely you have to create interface or abstract class for below
questions.

Q.1 create a program which converts a given measurement into another unit
of measurement like Kilometre to meter. For this declare three constants in
interface/abstract class choose wisely.
1. KM_TO_M=1000
2. M_TO_CM=100
3. CM_TO_MM=10

Now create Converter class which inherits the above interface/abstract class
and have following methods
1. Public double Kilometer_to_meter(double)
2. Public double meter_to_centimeter(double)
3. Public double centimeter_to_milimeter(double)

Define methods appropriately and converts the given measurements.

Now create another class which contain the main method create object of
Converter class and call methods appropriately.

Q.2 Write a program to calculate the total area of shape. For this declare two
methods in Shape interface/abstract class choose wisely.
1. Public double getArea()
2. Public String getName()

Create three classes Circle, Triangle and Square. All classes inherit *Shape*. In
these three classes provide constructor to initialize their data members to
calculate the area and overrides **Shape** methods appropriately.

Now create a class which contains the main method. Inside main method
creates array of **Shape** and fill array with object of Circle, Triangle and Square.
Call the methods appropriately to obtain area of each shape.

Q.3 create a interface/abstract class Employee which contains following data
members and methods Data members:
1. String name 
2. Double salary 
3. Double bonus
4. Double commission
5. String designation
 
Methods
1. Public String getName()
2. Public String getDesignation()
3. Public Double getSal()
4. Public Double getBonus()
5. Public Double getcomm()
6. Public Double totalIncome()

Now create following classes which inherits Employee.
1. Manager which gets salary, bonus and commission.
2. Salesman which gets salary and commission.
3. Developer which gets salary and bonus.

So appropriately overrides methods in each class.

Now create a class which contains the main method. Inside main method
creates objects of Manager, Salesman and Developer and find the total income
of each of them.

Q.4 create an interface/abstract class called Apartment which contains
following methods.
Methods
1. Public double getBedroom1Area(double length, double width)
2. Public double getBedroom2Area(double length, double width)
3. Public double get Bedroom3Area(double length, double width)
4. Public double getKitchenArea(double length, double width)
5. Public double getHallArea(double length, double width)
6. Public double getTotalArea()

Now create three classes OneBHK, TwoBHK, ThreeBHK. All should inherit
Apartment. Overrides the method appropriately in these classes.

Now create a class which contains the main method. Inside main method
creates objects of OneBHK, TwoBHK, ThreeBHK. and find the total area of each
flat.
*****************************************************
### Assignment 7 | Exception Handling 

Q.1 Create a class called Licence having data member as name (String) and DOB(String).
Create Parameterized constructor that initialize data members like Licence (String, String).
Now design a method called canDrive() in your class this method should calculate the age of
the person .it generates the user defined exception if the age is below 18 finally the msg
should display by main() that the user is eligible or not.

Q.2 Create a class called Findsqrt. it has two methods getNumber() method which accepts a
no from user and calculate() method which calculates the sqrt value of that no if given no is
negative no. then generate a user defined exception ComplexNumberException and give the
appropriate message in the calculate() method?

Q.3 Create a class called password having String data member for storing password. Create
parameterize constructor to initialize it. now create method called as getPassword () which
accepts password from the user. if provided password is getting wrong then generate an
exception PasswordMismatchException and give the msg stored in object of
PasswordMismatchException along with "TRY AGAIN" and again ask for password. The
program should ask the password for 3 times. After 3rd time program generate an Exception
called as PasswordVarificationExpiersException and give the message stored in
PasswordVarification Expiers Exception object in displayMsg() method. if password matches
then give welcome message in same displayMsg() method. Now create the class which
contains main() make object of Password class and call the methods appropriately?

Q. 4 Create a class called ArrayDemo having a int array reference as data member now create
method init() which accepts size of array as an argument and create the array of that size and
also initialized it. Create one more method called as getValueAt() which accept index value
as an argument. If index value is not valid it generates the Exception
ArrayIndexOutOfBoundsException and give the appropriate error message.

Q.5 create a class called Account which have account number, name and balance as data
members now create three methods getData() to initialize the data members, deposit(int)
and withdrawal(int) both accepts an amount. deposit() will add amount in balance and
withdrawal() will subtract it from balance. If you pass any negative or zero amount to deposit() and withdrawal() it should generate InvalidAmountException and if you pass amount which
is greater than remaining balance then withdrawal() should generate
InsufficientBalanceException with appropriate message. Create a class which contains main
initialize Account class and calls method appropriately.

**********************************************************
### Assignment 8 | Multithreading

1. Write a program to create two threads in a program assign the names addition and
multiplication to them. Now add first 50 number with in thread addition and multiply first 30
numbers in thread multiplication. Finally print the result of both threads.

2. Write a program to create an int array of size 10 initialize it with only positive integers. Now
create 4 threads named as add, sub, mul and div. perform corresponding operations over
array elements in each thread and display the result of each thread but output should be in
order of add, sub, mul then div.

3. Write a program to print tables with the help of multiple threads create three threads
named as T1, T2 and T3. T1 thread prints the table of 11 and 12, T2 prints table of 13 and 14
and T3 prints table of 15 and 16. Any thread can start first but once any one starts to print
table of any number it is not allowed to print different table by another thread. For example,
suppose thread t3 starts first and start printing 15 table now until table of 15 gets completed
no one prints another table. once the printing of 15 table has ended any one allowed to
print another table.

4. Write a program to add first 50000 numbers and display it's total but to make this process
fast take the help of multithreading concepts create 4 threads each will add the quarter
portion of first 50000 numbers like T1 adds 1 to 12500, T2 adds 12501 to 25000 and so on.
Now to complete the operation finally add all 4 parts of addition calculated by 4 threads to
get whole.

5. Write a program to solve the producer consumer problem.

*****************************************************




