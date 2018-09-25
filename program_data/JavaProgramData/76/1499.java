package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[10000];
		int[] y = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
		}
		int a = x[0];
		int b = y[0];
		int p;
		int q;
		for (i = 1;i < n;i++)
		{
			if (a > x[i])
			{
				a = x[i];
			}
			if (b < y[i])
			{
				b = y[i];
			}
		}
		double w;
		int k;
		int l = 0;
		for (w = 1.0 * a + 0.5;w < b;w++)
		{
			for (k = 0;k < n;k++)
			{
				if (w > x[k] && w < y[k])
				{
					break;
				}
				l++;
			}
			if (l == n)
			{
				System.out.print("no");
				return 0;
			}
			l = 0;
		}
		System.out.printf("%d %d",a,b);
		return 0;
	}



}

