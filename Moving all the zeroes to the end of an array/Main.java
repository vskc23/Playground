#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<=n-1;i++)
  {
    if(a[i]!=0)
    printf("%d ",a[i]);
  }
  for(i=0;i<=n-1;i++)
  {
    if(a[i]==0)
    printf("%d ",a[i]);
  }
    return 0;
}