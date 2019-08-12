#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int k=1;
  for(int i=1;i<=n;i++)
  {
   // int k =1;
    for(int j=1;j<=n;j++)
    {
      printf("%d",k);
    }
    printf("\n");
    k++;
  }
  return 0;
}
      
    