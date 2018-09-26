package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int x;
		int y;
		int i;
		int k;
		int n;
		i = 0;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (k = 0;k <= x - 1;k++)
		{
			for (i = 0;i <= y - 1;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(array[k][i]) = Integer.parseInt(tempVar3);
				}
			}
		}
		if (x >= y)
		{
			n = (y - 1) / 2;
		}
		else
		{
			n = (x - 1) / 2;
		}
		for (i = 0;i <= n;i++)
		{
			for (k = i;k <= y - i - 1;k++)
			{
				System.out.printf("%d\n",array[i][k]);
			}
			for (k = i + 1;k <= x - i - 1;k++)
			{
				System.out.printf("%d\n",array[k][y - i - 1]);
			}
			if (n > 0 && i <= (x - 2) / 2)
			{
				for (k = y - i - 2;k >= i;k--)
				{
					System.out.printf("%d\n",array[x - i - 1][k]);
				}
			}
			else
			{
				break;
			}
			if (n > 0 && i <= (y - 2) / 2)
			{
				for (k = x - i - 2;k >= i + 1;k--)
				{
					System.out.printf("%d\n",array[k][i]);
				}
			}
			else
			{
				break;
			}
		}
		return 0;
	}
}

