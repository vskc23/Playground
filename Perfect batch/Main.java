#include<stdio.h>
int main()
{
 int a[10],i,n,sum=0,sum1=0;
 scanf("%d",&n);
 for(i=1;i<=n;i++)
 {
  scanf("%d",&a[i]);
 } 
 for(i=1;i<=n/2;i++)
 {
  sum = sum + a[i];
 } 
 for((i=(n/2)+1);i<=n;i++)
 {
  sum1 = sum1 + a[i];
 } 
 if (sum == sum1)
 printf("Perfect Batch");
 else
 printf("Not a Perfect Batch");
 return 0;
}
 
 