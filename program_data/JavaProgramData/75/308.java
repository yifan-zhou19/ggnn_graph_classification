package <missing>;

public class GlobalMembers
{
	public static int min(int[] a, int i)
	{
		int m = a[0];
		int j;
		for (j = 0;j < i;j++)
		{
			if (a[j] < m)
			{
				m = a[j];
			}
		}
		return m;
	}
	public static int max(int[] a, int i)
	{
		int m = a[0];
		int j;
		for (j = 0;j < i;j++)
		{
			if (a[j] > m)
			{
				m = a[j];
			}
		}
		return m;
	}

	public static int Main()
	{
		int[][] a = new int[2][1001];
		int i;
		int j;
		int start;
		int end;
		int k;
		int m;
		int p = 0;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0][i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
		}
		i = i + 1;
		for (j = 0;j < i;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][j] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		start = min(a[0], i);
		end = max(a[1], i);
		for (k = start;k <= end;k++)
		{
			m = 0;
			for (j = 0;j < i;j++)
			{
				if (k < a[1][j] && k >= a[0][j])
				{
					m = m + 1;
				}
			}
			if (m > p)
			{
				p = m;
			}
		}
		System.out.printf("%d %d",i,p);
		return 0;
	}
}

