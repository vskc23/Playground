#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,j,k;
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<=n-1;i++)
  {
    for(j=i+1;j<=n-1;)
    {
      if(a[j]==a[i])
      {
        for(k=j;k<=n-1;k++)
        {
          a[k] = a[k+1];
        }
        n--;
      }
      else
      {
        j++;
      }
    }
  }
  for(i=0;i<=n-1;i++)
  {
    printf("%d ",a[i]);
  }
  return 0;
}
      
  