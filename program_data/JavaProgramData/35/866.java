package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		int l;
		int flag = 0;
		int a = 0;
		int f = 0;
		int[][] ju = new int[8][8];
		int[][] andian =
		{
			{-1, 0}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					ju[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			a = ju[i][0];
			for (j = 1;j < m;j++)
			{
				if (ju[i][j] > a)
				{
					a = ju[i][j];
					k = j;
				}
				else
				{
					continue;
				}
			}
				for (l = 0;l < n;l++)
				{
					if (a <= ju[l][k])
					{
						continue;
					}
					else
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					andian[i][0] = i;
					andian[i][1] = k;
				}
				else
				{
					break;
				}
		}
		if (andian[0][0] >= 0 && andian[0][1] >= 0)
		{
			System.out.printf("%d+%d\n", andian[0][0], andian[0][1]);
			f++;
		}
		for (i = 1;i < n;i++)
		{
			if (andian[i][0] > 0 || andian[i][1] > 0)
			{
				System.out.printf("%d+%d\n", andian[i][0], andian[i][1]);
				f++;
			}
			else
			{
				continue;
			}
		}
		if (f == 0)
		{
			System.out.print("No");
		}
	}
}

