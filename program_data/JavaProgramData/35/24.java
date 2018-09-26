package <missing>;

public class GlobalMembers
{
	public static int max(tangible.RefObject<Integer> p, int n)
	{
		int i = 0;
		int j;
		for (j = 1;j < n;j++)
		{
			if (*(p.argValue + j) > *(p.argValue + i))
			{
				i = j;
			}
		}
		return (i);
	}
	public static int min(tangible.RefObject<Integer> p, int n, int m)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			if (*(p.argValue + i * n) < p.argValue)
			{
				break;
			}
		}
		if (i == m)
		{
			return (1);
		}
		else
		{
			return (-1);
		}
	}
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int t;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			t = max(*(a + i), n);
			if (min(*(a + i) + t, 8, m) == 1)
			{
				System.out.printf("%d+%d\n",i,t);
				k = 1;
			}
			else
			{
				;
			}
			if (k == 1)
			{
				break;
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
	}

}

