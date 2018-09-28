package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int f1 = 0;
	   int f2 = 0;
	   int f3 = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n % 3 == 0)
	   {
		   System.out.print("3");
		   f1 = 1;
	   }
	   if (n % 5 == 0 && f1 == 0)
	   {
		   System.out.print("5");
		   f2 = 1;
	   }
	   if (n % 5 == 0 && f1 == 1)
	   {
		   System.out.print(" 5");
		   f2 = 1;
	   }
	   if (n % 7 == 0 && f1 + f2 >= 1)
	   {
		   System.out.print(" 7");
		   f3 = 1;
	   }
	   if (n % 7 == 0 && f1 + f2 == 0)
	   {
		   System.out.print("7");
		   f3 = 1;
	   }
	   if (f1 + f2 + f3 == 0)
	   {
		   System.out.print("n");
	   }
	}
}

