
//Q1.Write a Java program to print 'Hello' on the screen and your name on a separate line.//
/*class Helloworld {
    public static void main(String[] args) {
    System.out.println("Hello"); 
}
}
*/
OUTPUT:
Hello


//Q2.Write a Java program to print the sum (addition), multiply, subtract, divide, and remainder of two numbers.//
/* class Calculations{
public static void main(String args[])
{
int a=2,b=3;
int s1=a+b;
int s2=a-b;
int s3=a/b;
int s4=a*b;
int s5=a%b;
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);

}
}
*/
OUTPUT:
5
-1
0
6
2


//@3. Write a Java program to swap two numbers by using the third variable//
/* class SwappingNumbers{
public static void main(String args[])
{
int a=10,b=20,temp;
temp=a;
a=b;
b=temp;
System.out.println(" value of a:"+a);
System.out.println("value of b"+b);

}
}
*/
OUTPUT:
 value of a:20
value of b10
    
//Q4. Write a Java program to swap two numbers without using the third variable//
/* class SwapUsingTwoVar{
public static void main(String[] args)
{
int a=10,b=20;
a=a+b;
b=a-b;
a=a-b;
System.out.println("value of a:"+a);
System.out.println("value of b:"+b);
}
}
*/
OUTPUT:
value of a:20
value of b:10


//Q5. Write a Java program to print the area of a circle//
/* class AreaOfCircle{
public static void main(String args[])
{
int r=6;
double pi=3.14;
double area;
area =pi*r*r;
System.out.println("area of circle: "+area);
}
}
*/
OUTPUT:
area of circle: 113.03999999999999

//Q6.Write a Java program to print the ASCII value of a given character.
//
/* class AsciiVal{
public static void main(String args[])
{
char ch1 = 'a';  
char ch2 = 'b';    
int asciivalue1 = ch1;  
int asciivalue2 = ch2;  
System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);  
System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);  
}
}*/
OUTPUT:
The ASCII value of a is: 97
The ASCII value of b is: 98
