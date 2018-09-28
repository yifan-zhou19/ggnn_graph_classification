package <missing>;

public class GlobalMembers
{
	public static int search(int[][] a, int m, int n)
	{
		int i;
		int j;
		int k;
		int x = 0;
		int y = 0;
		int max;
		int sign;
		for (i = 0;i <= m - 1;i++)
		{

			for (j = 0;j <= n - 1;j++)
			{
				max = a[i][0];

				if (max < a[i][j])
				{
					max = a[i][j];
					y = j;
				}
			}
			for (k = 0;k <= m - 1;k++)
			{
				if (max > a[k][y])
				{
					x = -1;
					break;
				}
				else
				{
					x = i;
				}
			}
			sign = 10 * x + y;
			if (sign >= 0)
			{
				return (sign);
			}
		}
			return (-1);

	}
	public static int Main()
	{
		int i;
		int j;
		int x;
		int y;
		int[][] a = new int[8][8];
		int sign;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= x - 1;i++)
		{
			for (j = 0;j <= y - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		sign = search(a, x, y);
		if (sign < 0)
		{
			System.out.print("No");
		}
		else
		{
		i = sign % 10;
		j = (sign - i) / 10;
		System.out.printf("%d+%d",j,i);
		}

	}



}

