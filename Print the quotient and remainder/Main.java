#include<stdio.h>
int main()
{
  int a = 365;
  int b = 4;
  int  c ;
  a = a/b;
  c= a%10;
  printf("Quotient: %d\n",a);
  printf("Remainder: %d",c);
  
  return 0;
}