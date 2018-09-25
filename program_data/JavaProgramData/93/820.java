package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int x;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   x = Integer.parseInt(tempVar);
	   }
		   if (x % 105 == 0)
		   {
			 System.out.printf("3 5 7",x);
		   }
		   else if (x % 15 == 0)
		   {
			 System.out.printf("3 5",x);
		   }
		   else if (x % 21 == 0)
		   {
			 System.out.printf("3 7",x);
		   }
		   else if (x % 35 == 0)
		   {
			 System.out.printf("5 7",x);
		   }
		   else if (x % 3 == 0)
		   {
			 System.out.printf("3",x);
		   }
		   else if (x % 5 == 0)
		   {
			 System.out.printf("5",x);
		   }
		   else if (x % 7 == 0)
		   {
			 System.out.printf("7",x);
		   }
		   else
		   {
			 System.out.printf("n",x);
		   }
		   return 0;
	}
}

