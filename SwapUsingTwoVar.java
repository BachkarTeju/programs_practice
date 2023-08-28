//Q4. Write a Java program to swap two numbers without using the third variable//
class SwapUsingTwoVar{
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
/*
OUTPUT:
value of a:20
value of b:10
*/