package <missing>;

public class GlobalMembers
{
	public static void paixu(int n, int[] y)
	{
		int i;
		int j;
		int t;
		int k;
		for (i = 0;i < n;i++)
		{
			t = y[i];
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (y[j] < t)
				{
					t = y[j];
					k = j;
				}
			}
			y[k] = y[i];
			y[i] = t;
		}
	}
	public static int Main()
	{
		int i = 1;
		int j;
		int k;
		int l;
		int max = 0;
		int[] x = new int[1001];
		int[] y = new int[1001];
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		while (scanf("%c", b), b == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = 1;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[0] = Integer.parseInt(tempVar3);
		}
		while (scanf("%c", b), b == ',')
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y[i] = Integer.parseInt(tempVar4);
			}
			i++;
		}
		System.out.printf("%d ",i);
		for (j = 0;j <= 1000;j++)
		{
			l = 0;
			for (k = 0;k < i;k++)
			{
				if (j >= x[k] != 0 && j < y[k])
				{
					l++;
				}
			}
			if (l > max)
			{
				max = l;
			}
		}
		System.out.printf("%d",max);
	}

}

