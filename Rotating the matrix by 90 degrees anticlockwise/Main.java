#include <stdio.h>
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
     for(i=n-1;i>=0;i--)
     {
       for(j=0;j<=m-1;j++)
       {
        printf("%d ",a[j][i]);
       }
       printf("\n");
     }
      return 0;
}