#include<stdio.h>
int main()
{ 
 int n,m;
 scanf("%d",&n);
 scanf("%d",&m);
 int a[n],i,j,k,count=0,flag=0;
 for(i=0;i<=n-1;i++)
 {
  scanf("%d",&a[i]);
 }
  for(j=1;j<=m;j++)
  {
   count = 0;
   for(i=0;i<=n-1;i++)
   {
     if(j==a[i])
     { 
      count++; 
      
     }
     
    }
     
  printf("%d %d\n",j,count);
  
}
  return 0;
}