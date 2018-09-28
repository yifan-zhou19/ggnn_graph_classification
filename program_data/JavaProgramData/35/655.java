package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int max;
		int k;
		int x;
		int y;
		int flag1;
		int flag2 = 1;
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
			max = a[i][0];
			x = i;
			y = 0;
			flag1 = 1;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					x = i;
					y = j;
				}
			}
			for (k = 0;k < m;k++)
			{
				if (a[k][y] < max)
				{
					flag1 = 0;
					break;
				}
			}
			if (flag1 != 0)
			{
				System.out.printf("%d+%d",x,y);
				flag2 = 0;
			}
		}
		if (flag2 != 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

