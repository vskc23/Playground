#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,j,key;
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=1;i<=n-1;i++)
  {
    j = i-1;
    key = a[i];
    while(j>=0 && a[j]>key)
    {
      a[j+1] = a[j];
      j = j-1;
    }
    a[j+1] = key;
  }
  for(i=0;i<=n-1;i++)
  {
   printf("%d\n",a[i]);
  }
  return 0;
}