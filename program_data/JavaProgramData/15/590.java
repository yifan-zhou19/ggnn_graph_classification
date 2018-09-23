package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sum = new int[1000][1000];
		int n;
		int i;
		int j;
		int s = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sum[i][j] = Integer.parseInt(tempVar2);
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sum[i][j] == 0)
				{
					s++;

				}

			}
			if (s > 2)
			{
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (sum[i][j] == 0)
				{
					t++;

				}

			}
			if (t > 2)
			{
				break;
			}
		}
		System.out.printf("%d",s * t - (2 * s + 2 * t - 4));


	return 0;
	}

}

