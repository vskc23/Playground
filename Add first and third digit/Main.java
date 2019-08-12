#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d",&a);
  b = a;
  a = a%10;
  b = b/100;
  printf("%d",a+b);
  return 0;
}