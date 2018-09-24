package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int m = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			   System.out.print("empty\n");
		}
		else
		{
			for (i = 3;i < n - 1;i++)
			{
							   m = 0;
							   for (j = 2;j < i;j++)
							   {
												  if (i % j == 0)
												  {
													  m = 1;
												  break;
												  }
							   }
							   if (m == 0)
							   {
									   q = 0;
										for (t = 2;t < i + 2;t++)
										{
												  if ((i + 2) % t == 0)
												  {
													  q = 1;
												  break;
												  }
										}
										if (q == 0)
										{
											 System.out.printf("%d %d\n",i,i + 2);
										}
							   }
			}
		}
		System.in.read();
		System.in.read();
	}
}

