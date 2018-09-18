package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int k;
		int line = 0;
		int row = 0;
		int mianji;
		int[][] p = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i][k] = Integer.parseInt(tempVar2);
				}
			}

		}

		for (i = 1;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (p[i][k] == 0 && p[i - 1][k] == 0)
				{
				   row = row + 1;
				}
			}
		}

		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				if (p[i][k] == 0 && p[i][k - 1] == 0)
				{
					line = line+1;
				}
			}
		}
		mianji = (line / 2 - 1) * (row / 2 - 1);
		System.out.printf("%d",mianji);
	}



}

