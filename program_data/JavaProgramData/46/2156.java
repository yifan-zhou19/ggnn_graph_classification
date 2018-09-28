package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int s = 0;
		int[] p = new int[100];
		p = a;
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
		for (i = 0;(i < (m + 1) / 2) && (i < (n + 1) / 2);i++)
		{
			for (j = i;j < n - i;j++)
			{
				if (s < n * m)
				{
				System.out.printf("%d",*(p[i] + j));
				}
				if (s < n * m - 1)
				{
				System.out.print("\n");
				}
				s++;
			}
			for (j = i + 1;j < m - i;j++)
			{
				if (s < n * m)
				{
				System.out.printf("%d",*(p[j] + n - 1 - i));
				}
				if (s < n * m - 1)
				{
				System.out.print("\n");
				}
				s++;
			}
			for (j = n - i - 2;j >= i;j--)
			{
				if (s < n * m)
				{
				System.out.printf("%d",*(p[m - 1 - i] + j));
				}
				if (s < n * m - 1)
				{
				System.out.print("\n");
				}
				s++;
			}
			for (j = m - i - 2;j > i;j--)
			{
				if (s < n * m)
				{
				System.out.printf("%d",*(p[j] + i));
				}
				if (s < n * m - 1)
				{
				System.out.print("\n");
				}
				s++;
			}
		}
		 return 0;
	}

}

