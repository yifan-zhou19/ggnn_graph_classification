package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (k % 3 == 0)
		{
			x1 = 3;
		}
		if (k % 5 == 0)
		{
			x2 = 5;
		}
		if (k % 7 == 0)
		{
			x3 = 7;
		}
		sum = x1 + x2 + x3;
		  if (sum == 0)
		  {
			  System.out.print("n");
		  }
		   if (sum == 3)
		   {
			   System.out.print(3);
		   }
		  if (sum == 5)
		  {
			  System.out.print(5);
		  }
		  if (sum == 7)
		  {
			  System.out.print(7);
		  }
		   if (sum == 8)
		   {
			   System.out.print(3);
			   System.out.print(" ");
			   System.out.print(5);
		   }
		   if (sum == 10)
		   {
			   System.out.print(3);
			   System.out.print(" ");
			   System.out.print(7);
		   }
		  if (sum == 12)
		  {
			  System.out.print(5);
			  System.out.print(" ");
			  System.out.print(7);
		  }
		   if (sum == 15)
		   {
			   System.out.print(3);
			   System.out.print(" ");
			   System.out.print(5);
			   System.out.print(" ");
			   System.out.print(7);
		   }
		   return 0;
	}
}

