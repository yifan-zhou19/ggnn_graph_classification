package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int h;
		int l;
		int i;
		int j;
		int[][] x = new int[10][10];
		int[] H = new int[10];
		int[] L = new int[10];
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Integer.parseInt(tempVar3);
				}
				if (j == 0)
				{
					H[i] = x[i][0];
				}
				else if (j >= 1)
				{
					if (x[i][j] > x[i][j - 1])
					{
					H[i] = x[i][j];
					}
				}
			}

		}
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < h - 1;j++)
			{
				if (j == 0)
				{
				   L[i] = x[0][i];
				}
				else
				{
					if (x[j][i] > x[j + 1][i])
					{
					L[i] = x[j + 1][i];
					}
				}
			}
		}

		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (H[i] == L[j])
				{
					System.out.printf("%d+%d",i,j);
					t = 1;
					break;
				}
			}
			if (t == 1)
			{
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}
	}



}

