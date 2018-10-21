package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] h = new int[20][20];
		int i;
		int j;
		int sign;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				sign = 1;
				if (i > 0 && h[i][j] < h[i - 1][j])
				{
					sign = 0;
				}
				else if (i < m - 1 && h[i][j] < h[i + 1][j])
				{
					sign = 0;
				}
				else if (j > 0 && h[i][j] < h[i][j - 1])
				{
					sign = 0;
				}
				else if (j < n - 1 && h[i][j] < h[i][j + 1])
				{
					sign = 0;
				}

				if (sign == 1)
				{
					System.out.printf("%d %d\n",i,j);
				}
				else
				{
					continue;
				}
			}
		}
	}
}

