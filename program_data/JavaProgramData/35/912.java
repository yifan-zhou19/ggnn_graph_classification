package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[8][8];
	public static int n;
	public static int m;
	public static int l1;
	public static int l2;
	public static int andian(int k)
	{
		int i;
		int j;
		int flag = 0;
		int p;
		for (i = 0;i < m;i++)
		{
			p = 0;
			for (j = 0;j < m;j++)
			{
				if (a[k][i] >= a[k][j])
				{
					p++;
				}
			}
			if (p == m)
			{
				l1 = i;
				p = 0;
				for (i = 0;i < n;i++)
				{
					if (a[k][l1] <= a[i][l1])
					{
						p++;
					}
				}
				if (p == n)
				{
					flag = 1;
				}
			}
		}
		return (flag);
	}

	public static void Main()
	{
		int i;
		int j;
		int p;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			p = 0;
			p = andian(i);
			if (p == 1)
			{
				System.out.printf("%d+%d\n",i,l1);
				break;
			}
		}
		if (i == n)
		{
			System.out.print("No\n");
		}

	}
}

