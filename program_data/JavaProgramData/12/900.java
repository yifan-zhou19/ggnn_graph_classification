package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[17];
	int i = 0;
	int m = 0;
	int k = 0;
	int j = 0;
	do
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[i] != 0 && a[0] != -1)
		{
			i = i + 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (a[0] != -1)
		{
			for (j = 0;j < i;j++)
			{
				for (k = i - 1;k > j;k--)
				{
					if (a[k] == 2 * a[j] || a[j] == 2 * a[k])
					{
						m = m + 1;
					}
				}
			}
			System.out.printf("%d\n",m);
		}
		for (j = 0;j < i;j++)
		{
			a[j] = 0;
		}
		m = 0;
		i = 0;
	} while (a[0] != -1);
	}
}

