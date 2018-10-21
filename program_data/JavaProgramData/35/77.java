package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int max(int[] a)
	{
		int max;
		int i;
		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		return (max);
	}
	public static int min(int[] a)
	{
		int min;
		int i;
		min = a[0];
		for (i = 1;i < m;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		return (min);
	}
	public static void Main()
	{
		int i;
		int j;
		int[][] a = new int[8][8];
		int[] b = new int[8];
		int k;
		int s = 0;
		int q;
		int r;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < 8;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < m;i++)
		{
			b[i] = max(a[i]);
		}
		k = min(b);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == k)
				{
					q = i;
					r = j;
					break;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (a[i][r] > k)
			{
				s = s + 1;
			}
		}
		if (s == m - 1)
		{
			System.out.printf("%d+%d\n",q,r);
		}
		else if (s != m - 1)
		{
			System.out.print("No\n");
		}
	}
}

