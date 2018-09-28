package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = 0;
		int n;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % u != 0)
			{
			  a = i;
			  while (a > 0)
			  {
				if (a % g == u)
				{
				  break;
				}
				a = a / g;
			  }
			  if (a == 0)
			  {
				s += i * i;
			  }
			}
		}
			System.out.printf("%d",s);
		return 0;
	}
}

