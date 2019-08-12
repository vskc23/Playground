#include<stdio.h>
int main()
{
 int n,m,x;
 scanf("%d",&n);
 scanf("%d",&m);
 x = n+m;
 int a[n],b[m],c[x],i,j,k,temp;
 for(i=0;i<=n-1;i++)
 {
  scanf("%d",&a[i]);
 }
 for(j=0;j<=m-1;j++)
 {
  scanf("%d",&b[j]);
 }
 for(i=0;i<=n-1;i++)
 {
  c[i] = a[i];
 }
 for(j=n,k=0;j<=x-1 && k<=m-1;j++,k++)
 {
  c[j] = b[k];
 }
 for(i=0;i<=x-1;i++)
 {
  for(j=i+1;j<=x-1;j++)
  {
   if(c[i]>c[j])
   {
    temp = c[j];
    c[j] = c[i];
    c[i] = temp;
   }
  }
 }
 for(i=0;i<=x-1;i++)
 {
  printf("%d ",c[i]);
 }
 return 0;
}
    