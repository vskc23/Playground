#include<stdio.h>
#include<math.h>
int main()
{
  int n,n1,n2,sum=0,count=0;
  scanf("%d",&n);
  n1 = n;
  n2 = n;
  while(n1>0)
  {
    n1 = n1/10;
    count++;
  }
   while(n2>0)
  {
    int rem;
    rem = n2%10;
    sum = sum + pow(rem,count);
    n2 = n2/10;
  }
    if(sum == n)
    printf("Armstrong Number");
    else
    printf("Not an Armstrong Number");
  	return 0;
}