#include<stdio.h>
int main()
{
 int n,m,x;
 scanf("%d",&n);
 scanf("%d",&m);
 int a[n][m],i,j,flag=0;
 for(i=0;i<=n-1;i++)
 {
   for(j=0;j<=m-1;j++)
   {
     scanf("%d",&a[i][j]);
   }
 }
  scanf("%d",&x);
  for(i=0;i<=n-1;i++)
 {
   for(j=0;j<=m-1;j++)
   {
     if(a[i][j] == x)
     {
       printf("(%d, %d)",i,j);
       flag=1;
      }
    }
 }
  
  if(flag==0)
  {
    printf("(-1, -1)");
  }
  return 0;
}
  