#include<stdio.h>
int main()
{
 int n;
 scanf("%d",&n);
 int mid = n/2;
 int a[n],i,j,temp;
 for(i=0;i<=n-1;i++)
 {
  scanf("%d",&a[i]);
 }
 for(i=1;i<=mid-1;i++)
 {
  for(j=0;j<i;j++)
  {
   if(a[i]<a[j])
   {
    temp = a[j];
    a[j] = a[i];
    a[i] = temp;
   }
  }
 }
 
 
 for(i=0;i<=n-1;i++)
 {
  printf("%d ",a[i]);
 }
 return 0;
}

