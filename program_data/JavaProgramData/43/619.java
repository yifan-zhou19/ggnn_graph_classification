package <missing>;

public class GlobalMembers
{
	public static int number(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
		if (n % i == 0)
		{
		return 0;
		}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i < m;i = i + 2)
		{
		if (number(i) != 0 && number(m - i) != 0)
		{
								  if (i <= m - i)
								  {
								  System.out.printf("%d %d\n", i, m - i);
								  }

		}
		}

		return 0;
	}

}

