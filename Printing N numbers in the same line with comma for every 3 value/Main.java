#include <stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    if(i%3==0)
      printf("%d,",i);
    else
      printf("%d",i);
  }
	//Type your code
	return 0;
}