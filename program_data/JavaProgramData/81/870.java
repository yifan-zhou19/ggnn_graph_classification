package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int p;
	public static int Main()
	{
		int q;
		int i;
		int j;
		int[][] matrix = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					matrix[i][j] = Integer.parseInt(tempVar);
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
		int a = n;
		int b = m;
		int[] t = new int[5];
		int c;
		if (a < 5 && a >= 0 && b < 5 && b >= 0)
		{
			for (c = 0;c < 5;c++)
			{
				t[c] = matrix[b][c];
				matrix[b][c] = matrix[a][c];
				matrix[a][c] = t[c];
				p = 1;
			}
		}
		else
		{
			p = 0;
		}
		q = p;
		if (q == 0)
		{
			System.out.print("error");
		}
		else if (q == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 4)
					{
						System.out.printf("%d\n",matrix[i][j]);
					}
					else
					{
						System.out.printf("%d ",matrix[i][j]);
					}
				}
			}
		}
		return 0;
	}
}

