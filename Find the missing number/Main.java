#include<stdio.h>
int main()
{
 int n;
 scanf("%d",&n);
 int a[n],i,flag=0;
 for(i=0;i<=n-1;i++)
 {
  scanf("%d",&a[i]);
 }
 int j;
 for(j=1;j<=n;j++)
 {
  flag = 0;
  for(i=0;i<=n-1;i++)
  {
   if(j == a[i])
   {
    flag = 1;
    break;
   }
  }
   if(flag == 0)
   printf("%d",j);
 }
 return 0;
}
 
 