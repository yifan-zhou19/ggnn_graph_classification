package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m;
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int[] sz = new int[m];
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j] = Integer.parseInt(tempVar3);
				}
			}
			int sum;
			for (j = 0;j < m;j++)
			{
				sum = sz[j] + 3 * (j + 1);
				if ((63 - sum) <= 3 && (63 - sum) >= 0)
				{
					System.out.printf("%d\n",sz[j]);
				break;
				}
				if (sum > 63)
				{
					System.out.printf("%d\n",60 - 3 * j);
					break;
				}
			}
			if ((sz[m - 1] + 3 * m) < 60)
			{
				System.out.printf("%d\n",60 - 3 * m);
			}
		}
		return 0;
	}

}

