package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int k;
		int m;
		i = 3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (i <= a / 2)
		{
			k = 3;
			while (k < i)
			{
				if (i % k == 0)
				{
					break;
				}
				k = k + 2;
			}
			if (k == i)
			{
				j = a - i;
				m = 3;
				while (m < j)
				{
					if (j % m == 0)
					{
						break;
					}
					m = m + 2;
				}
				if (m == j)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
			i = i + 2;
		}
		return 0;
	}
}

