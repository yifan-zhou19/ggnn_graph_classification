package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int s = 0;
		int i;
		int j;
		double x;
		double t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			s += a[i];
		}
		x = (double)s / n;
		for (i = 0; i < n; i++)
		{
			for (j = n - 1; j > i; j--)
			{
				if (a[j] < a[j - 1])
				{
					int tem = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tem;
				}
			}
		}
		if ((a[n - 1] - x) == (x - a[0]))
		{
			System.out.printf("%d,%d",a[0],a[n - 1]);
		}
		else if ((a[n - 1] - x) < (x - a[0]))
		{
			System.out.printf("%d",a[0]);
		}
		else if ((a[n - 1] - x) > (x - a[0]))
		{
			System.out.printf("%d",a[n - 1]);
		}
		else
		{
			System.out.print("ghjk");
		}
		return 0;
	}





}

