package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (; k > 0;k--)
		{
			int m = 0;
			int n = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			int i = 0;
			int j = 0;
			int x = 0;
			int sum = 0;
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						x = Integer.parseInt(tempVar4);
					}
					if (i == 0 || j == 0 || i == m - 1 || j == n - 1)
					{
						sum += x;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

