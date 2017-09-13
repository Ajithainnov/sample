#include<stdio.h>
#include<conio.h>
void main()
{
int no1,no2,temp,temp1,temp2;
clrscr();
printf("\n enter the two no");
scanf("%d%d",&no1,&no2);
temp1=no1;
temp2=no2;
while(no2!=0)
{
temp=no1%no2;
no1=no2;
no2=temp;
}
if(no1==1)
printf("\n co-prime";
else
printf("\n not co-prime";
getch();
}
