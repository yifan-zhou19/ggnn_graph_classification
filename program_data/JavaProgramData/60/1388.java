package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int b;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		if (n >= 5)
		{
			 for (a = 3;a <= n;a++)
			 {
				   for (i = 2;i < a;i++)
				   {
						if (a % i == 0)
						{
								   break;
						}
					   if (i == (a - 1) && a % i != 0)
					   {
								   for (b = a + 2, j = 2;j < b && b <= n;j++)
								   {
										  if (b % j == 0)
										  {
											  break;
										  }
									   if (j == (b - 1) && b % j != 0)
									   {
											  System.out.printf("%d %d\n",a,b);
									   }
								   }
					   }
				   }
			 }
		}
	}

}

