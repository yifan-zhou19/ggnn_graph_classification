package <missing>;

public class GlobalMembers
{
	public static int hanshu(int x,int y)
	{
		if (x >= 0 && x < 5)
		{
			if (y >= 0 && y < 5)
			{
				return 1;
			}
		}
		if (x < 0 || x>4)
		{
			return 0;
		}
		return 0;
	}

	public static int Main()
	{
		int[][] num = new int[5][5];
		int[] jum = new int[5];
		int i;
		int j;
		int m;
		int n;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i][j] = Integer.parseInt(tempVar);
				}
			}
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		int h = hanshu(n, m);

		if (h == 1)
		{
			for (i = 0;i < 5;i++)
			{
				jum[i] = num[n][i];
				num[n][i] = num[m][i];
				num[m][i] = jum[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",num[i][j]);
				}
				System.out.printf("%d\n",num[i][4]);
			}
			return 0;
		}
		if (h == 0)
		{
			System.out.print("error");
			return 0;
		}
		return 0;
	}
}

