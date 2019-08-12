#include<stdio.h>
int main()
{ 
 int n,m;
 scanf("%d",&n);
  int a[n],i,j,k;
 for(i=0;i<=n-1;i++)
 {
  scanf("%d",&a[i]);
 }
 scanf("%d",&m);
 for(i=0;i<=n-1;i++)
 {
  for(j=i+1;j<=n-1;j++)
  {
   if(a[i]>a[j])
   {
    k = a[j];
    a[j] = a[i];
    a[i] = k;
   }
  }
 }
 
  printf("%d ",a[n-m]);
 
 return 0;
}