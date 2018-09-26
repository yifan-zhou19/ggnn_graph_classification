package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		i = 3;
		while (i <= m / 2)
		{
			a = 0;
			b = 0;
			j = 2;
			while (j < i)
			{
				if (i % j == 0)
				{
					break;
				}
				j = j + 1;
			}
			if (j == i)
			{
				a = i;
			}
			j = 2;
			while (j < m - i)
			{
				if ((m - i) % j == 0)
				{
					break;
				}
				j = j + 1;
			}
			if (j == m - i)
			{
				b = m - i;
			}
			if (a > 0 && b > 0)
			{
				System.out.printf("%d %d\n",a,b);
			}
			i = i + 2;
		}
		return 0;
	}
}

