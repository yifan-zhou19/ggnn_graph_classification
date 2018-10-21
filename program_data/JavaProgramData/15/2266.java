package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int S;
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					x1 = i;
					y1 = j;
					break;
				}
			}
			if ((a[i][j] == 0) && (j < n)) //PG????????????????????????0??j++??9??a[0][9]=0,??????
			{
				break;
			}
		}
		for (i = x1;i < n;i++)
		{
			if (a[i][y1] != 0)
			{
				x2 = i - 1;
				break;
			}
			else
			{
				continue;
			}
		}
		for (j = y1;j < n;j++)
		{
			if (a[x2][j] != 0)
			{
				y2 = j - 1;
				break;
			}
			else
			{
				continue;
			}
		}
		S = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d\n",S);
	}



}

