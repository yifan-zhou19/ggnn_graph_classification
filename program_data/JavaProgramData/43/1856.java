package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int j;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i < m;i += 2)
		{
			if ((i + 1) % 2 != 0)
			{
				a[i] = 1;
				for (j = 3;j <= i;j += 2)
				{
					if ((i + 1) % j == 0)
					{
						a[i] = 0;
						break;
					}
				}
			}
		}
		for (i = 0;i < m / 2;i++)
		{
			if (a[i] != 0 && a[m - 2 - i] != 0)
			{
				System.out.printf("%d %d\n",i + 1,m - 1 - i);
			}
		}
	}

}

