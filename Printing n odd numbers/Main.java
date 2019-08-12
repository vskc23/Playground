#include <stdio.h>
int main()
{
	int i,n,a;
    scanf("%d",&n);
    a = 2*n;
    for(i=1;i<=a;i++)
    {
      if(i%2==1)
      printf("%d\n",i);
    }
	return 0;
}