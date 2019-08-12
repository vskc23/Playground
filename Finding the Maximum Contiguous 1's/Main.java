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
  int count = 0,max=0,sum=0;
  for(i=0;i<=n-1;i++)
  {
    if(a[i]==0)
      count = 0;
    else if(a[i]==1)
    count++;
    if(count>max)
      max = count;
  }
  printf("%d",max);
  return 0;
}