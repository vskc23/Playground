




#include<stdio.h>
int main()
{
	int n,m;
    scanf("%d",&n);
    scanf("%d",&m);
    int a[n][m],b[n][m],i,j,flag = 0;
    for(i=0;i<=n-1;i++)
    {
      for(j=0;j<=m-1;j++)
      {
        scanf("%d",&a[i][j]);
      }
    }
    for(i=0;i<=n-1;i++)
    {
      for(j=0;j<=m-1;j++)
      {
        scanf("%d",&b[i][j]);
      }
    }
    for(i=0;i<=n-1;i++)
    {
      for(j=0;j<=m-1;j++)
      {
        if(a[i][j]!=b[i][j])
        {
          flag = 1;
          break;
        }
      }
    }
  if(flag == 1)
   printf("No");
  else
    printf("Yes");
	return 0;
}