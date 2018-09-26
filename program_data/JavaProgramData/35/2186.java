package <missing>;

public class GlobalMembers
{
	public static int f(int[] a, int n)
	{
		int i = 0;
		int j;
		for (j = 1;j < n;j++)
		{
			if (a[j] > a[i])
			{
				i = j;
			}
		}
		return i;
	}
	public static int Main()
	{
		int[][] a = new int[10][10];
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int b;
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
		b = 0;
		for (i = 0;i < m;i++)
		{
			k = 0;
			l = f(a[i], n);
			for (j = 0;j < m;j++)
			{
				if (a[j][l] < a[i][l])
				{
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				b = 1;
				System.out.printf("%d+%d",i,l);
				break;
			}
		}
		if (b == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

