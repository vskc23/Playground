#include<stdio.h>
int main()
{
  int a[10],i,n;
  scanf("%d",&n);
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  int max,max1;
    max = a[0];
   for(i=0;i<=n-1;i++)
  {
   if(max>a[i])
   max1 = i;
   else
   max1 = i;
  }
  printf("%d",max1);
  return 0;
}