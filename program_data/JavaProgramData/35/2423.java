package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int maxn = 8;
		int n;
		int m;
		int[][] a = new int[maxn][maxn];
		int i;
		int j;
		int k;
		int flag;
		int flagg;
		int tmp;

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
		flagg = 0;
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
			tmp = 0;
			flag = 0;
			for (j = 0;j < m;j++)
			{
				if (tmp < a[i][j])
				{
					tmp = a[i][j];
					k = j;
				}
			}
			for (j = 0;j < n;j++)
			{
				if (tmp > a[j][k])
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.printf("%d+%d",i,k);
				flagg = 1;
				break;
			}
		}
		if (flagg == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

