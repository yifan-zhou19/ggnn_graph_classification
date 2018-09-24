package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
		int m = 1;
		int t;
		int[] s = new int[10000];
		int[][] g = new int[10000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			t = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
				s[k] = i;
				k++;
			}
		}
		for (i = 1;i < k - 1;i++)
		{
			if (s[i + 1] - s[i] == 2)
			{
				g[m][1] = s[i];
				g[m][2] = s[i + 1];
				m++;
			}
		}
		if (m == 1)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 1;i < m;i++)
			{
				System.out.printf("%d %d\n",g[i][1],g[i][2]);
			}
		}
		return 0;
	}

}

