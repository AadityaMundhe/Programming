/*
  Program For Subtracting Two numbers  
*/
class Subtraction
{  
  public int Display(int iNo1, int iNo2)
  {
    int Ans = 0;
    
    Ans = iNo1 - iNo2;

    return Ans
  }
}
    
class Program1
{
  public static void main(String A[])
  {
    int iValue1 = 30;
    int iValue2 = 10;
    int iRet = 0;
    
    Subtraction sobj = new Subtraction;

    iRet = sobj.Display(iValue1, iValue2);

    System.out.println("Subtraction is : ",+iRet);
  }
}
