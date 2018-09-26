package <missing>;

public class GlobalMembers
{
	public static int max(int[] x, int h)
	{
		int i;
		int da = x[0];
		int k = 0;
		for (i = 1;i < h;i++)
		{
			if (x[i] > da)
			{
				da = x[i];
				k = i;
			}
		}
		return (k);
	}

	public static int min(int[][] x, int l, int d)
	{
		int i;
		int xiao = x[0][d];
		int k = 0;
		for (i = 1;i < l;i++)
		{
			if (x[i][d] < xiao)
			{
				xiao = x[i][d];
				k = i;
			}
		}
		return (k);
	}

	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int row;
		int clone;
		int[][] x = new int[10][10];
		char y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			clone = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < clone;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					x[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}

		for (j = 0;j < row;j++)
		{
			k = max(x[j], clone);
			l = min(x, row, k);
			if (l == j)
			{
				System.out.printf("%d+%d",j,k);
				break;
			}
			else if (j == row - 1)
			{
				System.out.print("No");
			}
		}
	}
}

