package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  c = Integer.parseInt(tempVar2);
						  }
						  if (i == 1)
						  {
								   a = c;
						  }
						  if (i == 2)
						  {
								   if (a > c)
								   {
										   b = c;
								   }
										   else
										   {
												 b = a;
												 a = c;
										   }
						  }
						  if (i > 2)
						  {
								   if (c > a)
								   {
										   b = a;
										   a = c;
								   }
								   if ((a > c) && (c > b))
								   {
													b = c;
								   }
						  }
		}
		System.out.printf("%d\n%d\n",a,b);
		return 0;
	}
}

