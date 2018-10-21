package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int m;
		int n;
		int i;
		int j;
		int max;
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
		for (i = 0;i <= m - 1;i++)
		{
			max = 0;
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				if (a[i][j] > max)
				{
					b[i] = j;
					max = a[i][j];
				}
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
				if (a[j][b[i]] < a[i][b[i]])
				{
					break;
				}
			}
			if (j == m)
			{
				System.out.printf("%d+%d",i,b[i]);
				break;
			}
		}
		if (i == m)
		{
			System.out.print("No");
		}
	}
}

