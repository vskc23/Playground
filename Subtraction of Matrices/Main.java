#include<stdio.h>
int main()
{
	 int n,m;
     scanf("%d",&n);
     scanf("%d",&m);
     int a[n][m],b[n][m],c[n][m],i,j;
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
         c[i][j] = a[i][j] - b[i][j];
       }
     }
     for(i=0;i<=n-1;i++)
     {
       for(j=0;j<=m-1;j++)
       {
         printf("%d ",c[i][j]);
       }
       printf("\n");
     }
	return 0;
}