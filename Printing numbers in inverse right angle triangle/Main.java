#include <stdio.h>
int main() 
{
   int n;
   scanf("%d",&n);
   int n1 = n;
   for(int i=1;i<=n;i++)
   {
     for(int j=n1;1<=j;j--)
     {
       printf("%d",j);
       
     }
     printf("\n");
     n1--;
    
   }
	return 0;
}