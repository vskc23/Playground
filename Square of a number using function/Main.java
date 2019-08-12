#include<stdio.h>
int fun(int a)
{
  return a*a;
}
int main() 
{
   int x;
   scanf("%d",&x);
   printf("%d",fun(x));
   return 0;
}