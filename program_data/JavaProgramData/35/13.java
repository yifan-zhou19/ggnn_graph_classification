package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[8][8];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int a;
		int b;
		int c = 0;
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
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a = 0;
				b = 0;
				for (k = 0;k < m;k++)
				{
					if (s[i][j] < s[k][j] && i != k)
					{
						a++;
					}
				}
				for (l = 0;l < n;l++)
				{
					if (s[i][j] > s[i][l] && j != l)
					{
						b++;
					}
				}
				if ((a == m - 1) && (b == n - 1))
				{
					System.out.printf("%d+%d",i,j);
					c++;
				}
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
	}
}

