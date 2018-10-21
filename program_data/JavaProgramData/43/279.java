package <missing>;

public class GlobalMembers
{
	public static int szs(int a)
	{
		int i;
		for (i = 2;i <= a / 2;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i > a / 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int s;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i += 2)
		{
			if (szs(i) != 0 && szs(m - i) != 0)
			{
				if (s != 0)
				{
					System.out.print("\n");
				}
				System.out.printf("%d %d",i,m - i);
				s = 1;
			}
		}

		return 0;
	}

}

