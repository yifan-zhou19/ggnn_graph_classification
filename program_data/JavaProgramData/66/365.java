package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a = 0;
	 int b = 0;
	 int c = 0;
	 int y = 0;
	 int n = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 c = Integer.parseInt(tempVar3);
	 }
	 a = a - 1;
	 b = b - 1;
	 y = a * 1 + a / 4 - a / 100 + a / 400;
	 a = a + 1;
	 if ((a % 100 == 0 && a % 400 != 0) || (a % 4 != 0))
	 {
	 if (b == 0)
	 {
	  b = 0;
	 }
	 if (b == 1)
	 {
	  b = 31;
	 }
	 if (b == 2)
	 {
	  b = 31 + 28;
	 }
	 if (b == 3)
	 {
	  b = 31 + 28 + 31;
	 }
	 if (b == 4)
	 {
	  b = 31 + 28 + 31 + 30;
	 }
	 if (b == 5)
	 {
	  b = 31 + 28 + 31 + 30 + 31;
	 }
	 if (b == 6)
	 {
	  b = 31 + 28 + 31 + 30 + 31 + 30;
	 }
	 if (b == 7)
	 {
	  b = 31 + 28 + 31 + 30 + 31 + 30 + 31;
	 }
	 if (b == 8)
	 {
	  b = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
	 }
	 if (b == 9)
	 {
		 b = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
	 }
	 if (b == 10)
	 {
		 b = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
	 }
	 if (b == 11)
	 {
		   b = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
	 }
	 }
	 if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0))
	 {
	  if (b == 0)
	  {
	  b = 0;
	  }
	  if (b == 1)
	  {
	  b = 31;
	  }
	 if (b == 2)
	 {
	  b = 31 + 29;
	 }
	 if (b == 3)
	 {
	  b = 31 + 29 + 31;
	 }
	 if (b == 4)
	 {
	  b = 31 + 29 + 31 + 30;
	 }
	 if (b == 5)
	 {
	  b = 31 + 29 + 31 + 30 + 31;
	 }
	 if (b == 6)
	 {
	  b = 31 + 29 + 31 + 30 + 31 + 30;
	 }
	 if (b == 7)
	 {
	  b = 31 + 29 + 31 + 30 + 31 + 30 + 31;
	 }
	 if (b == 8)
	 {
		 b = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
	 }
	 if (b == 9)
	 {
		 b = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
	 }
	 if (b == 10)
	 {
		 b = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
	 }
	 if (b == 11)
	 {
		   b = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
	 }
	 }
	 n = y + b + c;
		if (n % 7 == 0)
		{
	 System.out.print("Sun.");
		}
	 if (n % 7 == 1)
	 {
	  System.out.print("Mon.");
	 }
	 if (n % 7 == 2)
	 {
	  System.out.print("Tue.");
	 }
	 if (n % 7 == 3)
	 {
	  System.out.print("Wed.");
	 }
	 if (n % 7 == 4)
	 {
	  System.out.print("Thr.");
	 }
	 if (n % 7 == 5)
	 {
	  System.out.print("Fri.");
	 }
	 if (n % 7 == 6)
	 {
	  System.out.print("Sat.");
	 }
	 return 0;
	}


}

