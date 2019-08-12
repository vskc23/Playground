#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,j;
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  int sum = a[0];
  int max = a[0];
  for(i=1;i<=n-1;i++)
  {
   if(a[i]>a[i-1])
   {
     sum = sum + a[i];
   }
    else
    {
      sum = a[i];
    }
    if(sum>max)
      max = sum;
  }
 printf("%d",max);
  return 0;
}