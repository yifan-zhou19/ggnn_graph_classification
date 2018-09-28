package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int n)
	{
		int i;
		int z = 0;
		for (i = 1;i < n;i++)
		{
			if (a[i] > a[z])
			{
				z = i;
			}
		}
			return (z);
	}
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int m;
		int n;
		int p;
		int flag = 0;
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
				p = max(a[i], n);
				for (j = 0;j < m;j++)
				{
					if (a[i][p] <= a[j][p])
					{
						flag = 1;
					}
					else
					{
						flag = 0;
						break;
					}
				}
					if (flag != 0)
					{
						System.out.printf("%d+%d\n",i,p);
						break;
					}
			}
			if (flag == 0)
			{
				System.out.print("No\n");
			}
	}
}

