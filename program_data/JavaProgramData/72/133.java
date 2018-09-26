package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[][] s = new int[20][20];
		int t = 0;
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
			s[i][j] = Integer.parseInt(tempVar3);
		}
		}
		}
		if ((s[0][0] >= s[0][1]) && (s[0][0] >= s[1][0]))
		{
		System.out.printf("%d %d\n",t,t);
		}
		for (i = 1;i < n - 1;i++)
		{
			if ((s[0][i] >= s[0][i + 1]) && (s[0][i] >= s[1][i]) && (s[0][i]) >= s[0][i - 1])
			{
			System.out.printf("%d %d\n",t,i);
			}
		}
		if ((s[0][n - 1] >= s[0][n - 2]) && (s[0][n - 1] >= s[1][n - 1]))
		{
		System.out.printf("%d %d\n",t,n - 1);
		}
		for (i = 1;i < m - 1;i++)
		{
			if ((s[i][0] >= s[i - 1][0]) && (s[i][0] >= s[i][1]) && (s[i][0] >= s[i + 1][0]))
			{
			System.out.printf("%d %d\n",i,t);
			}
			for (j = 1;j < n - 1;j++)
			{
			if ((s[i][j] >= s[i][j - 1]) && (s[i][j] >= s[i][j + 1]) && (s[i][j] >= s[i - 1][j]) && (s[i][j] >= s[i + 1][j]))
			{
			System.out.printf("%d %d\n",i,j);
			}
			}
			if ((s[i][n - 1] >= s[i][n - 2]) && (s[i][n - 1] >= s[i - 1][n - 1]) && (s[i][n - 1] >= s[i + 1][n - 1]))
			{
			System.out.printf("%d %d\n",i,n - 1);
			}
		}
		if ((s[m - 1][0] >= s[m - 2][0]) && (s[m - 1][0] >= s[m - 1][1]))
		{
		System.out.printf("%d %d\n",m - 1,t);
		}
		for (i = 1;i < n - 1;i++)
		{
			if ((s[m - 1][i] >= s[m - 1][i + 1]) && (s[m - 1][i] >= s[m - 2][i]) && (s[m - 1][i]) >= s[m - 1][i - 1])
			{
			System.out.printf("%d %d\n",m - 1,i);
			}
		}
		if ((s[m - 1][n - 1] >= s[m - 1][n - 2]) && (s[m - 1][n - 1] >= s[m - 2][n - 1]))
		{
		System.out.printf("%d %d",m - 1,n - 1);
		}

	}
}

