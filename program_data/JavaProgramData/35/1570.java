package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int[] hang = new int[8];
		int judge;
		int max;
		int y;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
				if (j == 0)
				{
					hang[i] = 0;
				}
				else
				{
					if (a[i][j] > a[i][j - 1])
					{
						hang[i] = j;
					}
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			judge = 1;
			max = a[i][hang[i]];
			for (j = 0;j < m;j++)
			{
				judge = judge != 0 && (max <= a[j][hang[i]]);
			}
			if (judge != 0)
			{
				y = i;
				x = hang[i];
				break;
			}
			else
			{
				continue;
			}
		}
			if (judge != 0)
			{
				System.out.printf("%d+%d",y,x);
			}
			else
			{
				System.out.print("No");
			}

		return 0;
	}


}

