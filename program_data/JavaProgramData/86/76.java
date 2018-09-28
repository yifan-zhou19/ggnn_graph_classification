package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int[] a = new int[60];
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			count = 0;
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			j = m - 1;
			while ((a[j] + 3 * j) > 60)
			{
				m--;
				j = m - 1;
			}
			if ((a[m - 1] + 3 * m) < 60)
			{
				count = 60 - 3 * m;
			}
			else
			{
				count = a[m - 1];
			}
			System.out.printf("%d\n",count);
		}
		return 0;
	}

}

