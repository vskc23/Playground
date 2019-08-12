#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],j,k;
  for(j=0;j<=n-1;j++)
  {
    scanf("%d",&a[j]);
  }
  int temp;
  for(j=n-1;j>=0;j--)
  {
    for(k=0;k<j;k++)
    {
      if(a[k]>a[k+1])
      {
        temp = a[k+1];
        a[k+1] = a[k];
        a[k] = temp;
      }
    }
  }
  for(j=0;j<=n-1;j++)
  {
    printf("%d\n",a[j]);
  }
  return 0;
}