#include<stdio.h>
#include<string.h>
int main()
{
 char as[200];
 int leng,i,flag=0;
 scanf("%s",as);
 leng = strlen(as);
 for(i=0;i<=leng;i++)
 {
  if(as[i]!=as[leng-i-1])
  {
   flag = 1;
    break;
  }
 }
 if(flag == 1)
 printf("%s is not a palindrome",as);
 else
 printf("%s is a palindrome",as);
 return 0;
}
 