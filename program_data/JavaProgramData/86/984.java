package <missing>;

public class GlobalMembers
{
	// PG 1049
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int m;
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int[] stop = new int[20];
			int skip;
			if (m == 0)
			{
				skip = 60;
			}
			for (j = 0; j < m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					stop[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = m - 1; j >= 0; j--)
			{
				if (stop[j] + 3 * (j + 1) <= 60)
				{
					skip = 60 - 3 * (j + 1);
					break;
				}
				else if (stop[j] + 3 * j <= 60)
				{
					skip = stop[j];
					break;
				}
			}
			System.out.printf("%d\n",skip);
		}

		return 0;
	}
}

