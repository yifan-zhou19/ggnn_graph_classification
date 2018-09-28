package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int min = new int(int a,int b);
		int max = new int(int a,int b);
		int[][] a = new int[100][100];
		int i;
		int j;
		int m;
		int n;
		int begin;
		int end;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		for (i = 0;i <= m + n - 2;i++)
		{
			for (j = max(0, i - n + 1);j <= min(m - 1, i);j++)
			{
				System.out.printf("%d\n",a[j][i - j]);
			}
		}
		return 0;
	}
	public static int min(int a,int b)
	{
		return a < b != 0? a:b;
	}
	public static int max(int a,int b)
	{
		return a > b != 0? a:b;
	}

}

