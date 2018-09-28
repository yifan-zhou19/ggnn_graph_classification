package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] s = new int[8][8];
		int[] p = new int[8];
		int[] q = new int[8];
		int i;
		int j;
		int m;
		int n;
		int k = 0;
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
			p[i] = s[i][0];
			for (j = 0;j < n;j++)
			{
				if (p[i] < s[i][j])
				{
					p[i] = s[i][j];
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			q[j] = s[0][j];
			for (i = 1;i < m;i++)
			{
				if (q[j] > s[i][j])
				{
					q[j] = s[i][j];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (p[i] == q[j])
				{
					System.out.printf("%d+%d",i,j);
					k = 1;
				}
					else
					{
						continue;
					}
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
	}
}

