package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] z = new int[1000][1000];
		int i;
		int j;
		int k;
		int l;
		int s;
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
					z[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (z[i][j] == 0)
				{
					break;
				}

			}
			if (j < n)
			{
					break;
			}
		}
		k = i;
		l = j;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (z[i][j] == 0)
				{
					break;
				}

			}
			if (j >= 0)
			{
					break;
			}

		}
		k = i - k - 1;
		l = j - l - 1;
		s = k * l;
		System.out.printf("%d",s);
		return 0;
	}

}

