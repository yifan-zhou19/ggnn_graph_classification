package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int max1 = 0;
		int max2 = 0;
		int min1 = n;
		int min2 = n;
		int[][] a = new int[100][100];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					if (max1 < i)
					{
						max1 = i;
					}
					if (max2 < j)
					{
						max2 = j;
					}
					if (min1 > i)
					{
						min1 = i;
					}
					if (min2 > j)
					{
							min2 = j;
					}
				}
			}
		}
		s = (max1 - min1 - 1) * (max2 - min2 - 1);
		System.out.print(s);
		return 0;
	}
}

