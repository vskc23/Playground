#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,j;
  for(i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  int count = 0;
  int max = 0;
  int index = 0;
  for(i=0;i<=n-1;i++)
  {
   for(j=i+1;j<=n-1;j++)
   {
     if(a[i]==a[j])
      count++;
     else
       count = 0;
      
      }
      if(count>max)
       {
        max = count;
        index = i;
      }
   }
  printf("%d",a[index]);
    return 0;
}