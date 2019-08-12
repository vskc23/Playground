#include<stdio.h>
int main()
{
 int n,a[10],i,n1,n2;
 scanf("%d",&n);
 for(i=0;i<=n-1;i++)
 {
  scanf("%d",&a[i]);
 }
 scanf("%d",&n1);
 scanf("%d",&n2);
 int a1=-1;
 int a2=-1;
 for(i=0;i<=n-1;i++)
 {
  if(a[i]==n1)
  {
  a1 = i;
  }
  if(a[i]==n2)
  {
  a2 = i;
  }
 }
 printf("%d\n",a1);
 printf("%d\n",a2);
 return 0;
}
  