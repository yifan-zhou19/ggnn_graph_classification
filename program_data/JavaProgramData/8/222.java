package <missing>;

public class GlobalMembers
{
	public static int pai1(int[] x, int y)
	{
		int i;
		int j;
		int min;
		int stmp;
		int flag = 0;

		for (i = 0;i < y;i++)
		{
			min = x[i];
			for (j = i + 1;j < y;j++)
			{
				if (min > x[j])
				{
					min = x[j];
					stmp = x[i];
					x[i] = x[j];
					x[j] = stmp;
				}
			}
		}
		for (i = 0;i < y;i++)
		{
			if (flag == 0)
			{
				System.out.printf("%d", x[i]);
				flag = 1;
				continue;
			}
			if (flag == 1)
			{
				System.out.printf(" %d", x[i]);
			}
		}
		return 0;
	}
	public static int pai2(int[] x, int y)
	{
		int i;
		int j;
		int min;
		int stmp;

		for (i = 0;i < y;i++)
		{
			min = x[i];
			for (j = i + 1;j < y;j++)
			{
				if (min > x[j])
				{
					min = x[j];
					stmp = x[i];
					x[i] = x[j];
					x[j] = stmp;
				}
			}
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf(" %d", x[i]);
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (j = 0;j < m;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
		pai1(a, n);
		pai2(b, m);
	}


}

