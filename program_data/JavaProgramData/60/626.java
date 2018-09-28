package <missing>;

public class GlobalMembers
{
	public static int ss(int x)
	{
		int i;
		for (i = 2;i <= x;i++)
		{
			   if (x % i == 0)
			   {
				  if (i != x)
				  {
					return (0);
				  }
			   }

		}
		   return (1);
	}
	public static int Main()
	{
		int a;
		int b;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			   System.out.print("empty");
			   return 0;
		}
		for (a = 2,b = 0;a <= (n - 2);a++)
		{
			   if (ss(a) != 0)
			   {

				   b = a + 2;
				   if (ss(b) != 0)
				   {
						 System.out.printf("%d %d\n",a,b);
				   }

			   }
		}
	}


}

