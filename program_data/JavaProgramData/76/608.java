package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[n];
		int[] y = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (x[i] > x[i + 1])
				{
					e = x[i];
					x[i] = x[i + 1];
					x[i + 1] = e;
				}
				if (y[i] > y[i + 1])
				{
					e = y[i];
					y[i] = y[i + 1];
					y[i + 1] = e;
				}
			}
		}
		a = 0;
		for (i = 0;i < n - 1;i++)
		{
			if (x[n - i - 1] > y[n - i - 2] || y[i] < x[i + 1])
			{
				  a++;
			}
		}
		if (a != 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",x[0],y[n - 1]);
		}
		return 0;
	}

}

