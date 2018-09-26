package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[7];
		int i;
		int sum = 0;
		int j = 0;
		for (i = 0;;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(sz[j]) = Integer.parseInt(tempVar);
				}
			}
			if (sz[0] == 0)
			{
				break;
			}
			sz[3] = sz[3] + 12;
			sum = (sz[3] - sz[0]) * 3600 + (sz[4] - sz[1]) * 60 + (sz[5] - sz[2]);
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

