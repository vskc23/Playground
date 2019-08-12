#include<stdio.h>
int main()
{
  int a[10],n,i;
  scanf("%d",&n);
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<=n-1;i++)
  {
    if(a[i]>a[i+1])
    {
    printf("%d",a[i]);
    break;
    }
  }
  
  return 0;
}