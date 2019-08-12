#include <stdio.h>
int main() 
{
  int n,a,sum=0;
  scanf("%d",&n);
  while(n)
  {
   a=n%10;
   n=n/10;
   sum=sum+a;
  }
  printf("%d",sum);
  return 0;
}