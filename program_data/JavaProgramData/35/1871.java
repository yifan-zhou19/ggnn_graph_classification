package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[10][10];
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
		int x;
		int l;
		int flag1 = 0;
		int flag2 = 0;
		for (i = 0;i < m;i++)
		{
			x = a[i][0];
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > x)
				{
					x = a[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == x)
				{
					l = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (a[j][l] < x)
				{
					flag1 = 1;
					break;
				}
			}
			if (flag1 == 0)
			{
				flag2 = 1;
				System.out.printf("%d+%d",i,l);
					break;
			}
		}
		if (flag2 == 0)
		{
			System.out.print("No");
		}
	}
}

