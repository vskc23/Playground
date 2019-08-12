#include<stdio.h>
#include<math.h>
int power(a,b)
{
  return pow(a,b);
}
int main()
{
 int x,y;
 scanf("%d%d",&x,&y);
 printf("%d",power(x,y));
 return 0;
}