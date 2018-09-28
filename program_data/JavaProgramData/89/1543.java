package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[][] a = new int[100001][2];
		int[] b = new int[10001];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[0][1] = Integer.parseInt(tempVar3);
		}
		for (m = 1;!(a[m - 1][0] == 0 && a[m - 1][1] == 0);m++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[m][0] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a[m][1] = Integer.parseInt(tempVar5);
			}
		}
		m -= 1;
		for (i = 0;i < n;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			b[a[i][0]] -= 1;
			b[a[i][1]] += 1;
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] == n - 1)
			{
				if (j == 0)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(" %d",i);
				}
				j++;
			}
		}
		if (j == 0)
		{
		System.out.print("NOT FOUND");
		}
	}

}

