package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int u;
		int[][] a = new int[101][101];
		int r;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		j = 0;
		u = 0;
			for (i = 0;(i < r) && (u != c);i++)
			{
			if ((i == 0) && (j == 0))
			{
					System.out.printf("%d",a[i][j]);
			}
				else
				{
					System.out.printf("\n%d",a[i][j]);
				}
				if ((i != r - 1) && (j != 0))
				{
					j--;
				}
				else
				{
					u++;
					j = u;
					i = -1;
				}
			}
			i = 1;
			u = 1;
			for (j = c - 1;(j >= 0) && (u < r);j--)
			{

					System.out.printf("\n%d",a[i][j]);

				if ((j != 0) && (i != r - 1))
				{
					i++;
				}
				else
				{
					u++;
					i = u;
					j = c;
				}
			}

		return 0;
	}

}

