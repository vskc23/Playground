#include<stdio.h>
int main()
{
  int n;
   scanf("%d",&n);
  int a[n],j,k,temp,min;
  for(j=0;j<=n-1;j++)
  {
    scanf("%d",&a[j]);
  }
  for(j=0;j<n-1;j++)
  {
    min = j;
    for(k=j+1;k<=n-1;k++)
    {
      if(a[k]<a[min])
      {
        min = k;
      }
    }
    temp = a[min];
    a[min] = a[j];
    a[j] = temp;
  }
  for(j=0;j<=n-1;j++)
  {
    printf("%d\n",a[j]);
  }
  return 0;
}