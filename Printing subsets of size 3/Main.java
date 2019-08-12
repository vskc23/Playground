#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<=n-2;i++)
  {
    for(int j=i+1;j<=n-1;j++)
    {
      for(int k=j+1;k<=n-1;k++)
      {
      printf("(%d, %d, %d) ",a[i],a[j],a[k]);
      }
      
    }
    printf("\n");
    
   }
  return 0;
}