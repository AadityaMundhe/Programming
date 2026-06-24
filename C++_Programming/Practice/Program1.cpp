/*
  Write A program to Add two numbers 
*/

#include<iostream>
using namespace std;

int Addition(int iNo1, int iNo2)
{
  int iAns = 0;

  iAns = iNo1 + iNo2;

  return iAns;
}

int main()
{
  int iValue1 = 20;
  int iValue2 = 4;
  int iRet = 0;

  iRet = Addition(iValue1, iValue2);

  cout<<"Addition is : %d\n"<<iRet;
  
  return 0;
}
