package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int num;
		int[] a = new int[500];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while ((n > 0) && (m > 0))
		{
			for (i = 1; i <= n; i++)
			{
				a[i] = 0;
			}
			num = 0;
			for (i = 1; i < n; i++)
			{
				for (j = 1; j <= m; j++)
				{
					num = num % n + 1;
					while (a[num] == 1)
					{
						num = num % n + 1;
					}
				}
				a[num] = 1;
			}
			for (i = 1; i <= n; i++)
			{
				if (a[i] == 0)
				{
					System.out.printf("%d\n", i);
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
	}
}

