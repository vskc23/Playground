#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d",&n);
  scanf("%d",&m);
  int a[n][m],i,j;
  for(i=0;i<=n-1;i++)
  {
    for(j=0;j<=m-1;j++)
    {
      scanf("%d",&a[i][j]);
    }
  }
  for(j=0;j<=m-1;j++)
  {
    for(i=0;i<=n-1;i++)
    {
      printf("%d ",a[i][j]);
    }
    printf("\n");
  }
  return 0;
}