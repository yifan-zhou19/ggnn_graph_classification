package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int m;
		int n;
		int point = -1;
		int k;
		int l;
		int flag = 1;
		int f = 1;
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
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < m;k++)
				{
					if (a[i][j] > a[k][j])
					{
						flag = 0;
						break;
					}
				}
				for (l = 0;l < n;l++)
				{
					if (a[i][j] < a[i][l])
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					point = a[i][j];
					f = 0;
					break;
				}
				flag = 1;
			}
			if (f == 0)
			{
				break;
			}
		}
		if (point != -1)
		{
			System.out.printf("%d+%d",i,j);
		}
		else
		{
			System.out.print("No");
		}
	}

}

