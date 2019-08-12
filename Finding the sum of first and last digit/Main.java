#include <stdio.h>
int main()
{
	int n,n1,a,b,sum=0;
    scanf("%d",&n);
    n1=n;
    b=n1%10;
    while(n)
    {
      a=n%10;
      n=n/10;
    }
    sum=a+b;
    printf("%d",sum);
	return 0;
}