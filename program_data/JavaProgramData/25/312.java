package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double y;
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 0)
		{
				a = 1.0;
				for (i = 0;i < n;i++)
				{
								 y = a * 2;
								 a = y;
				}
		}
							  if (n == 0)
							  {
									   y = 1.0;
							  }
									   System.out.printf("%.0lf",y);
																		  return 0;
	}
}

