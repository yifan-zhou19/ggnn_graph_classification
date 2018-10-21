package <missing>;

public class GlobalMembers
{
	public static int read()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= 4;i++)
		{
			a[i] = 0;
		}
		return 0;
	}
	public static void tongji()
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			if (b[i] <= 18)
			{
				a[1]++;
			}
			else
			{
				if (b[i] <= 35)
				{
					a[2]++;
				}
				else
				{
					if (b[i] <= 60)
					{
						a[3]++;
					}
					else
					{
						a[4]++;
					}
				}
			}
		}
		return;
	}
	public static void print()
	{
		double[] c = new double[4];
		int i;
		for (i = 1;i <= 4;i++)
		{
			c[i] = 100.00 * a[i] / n;
		}
		System.out.printf("1-18: %.2lf%%\n",c[1]);
		System.out.printf("19-35: %.2lf%%\n",c[2]);
		System.out.printf("36-60: %.2lf%%\n",c[3]);
		System.out.printf("Over60: %.2lf%%",c[4]);
		return;
	}
	public static int n;
	public static int[] a = new int[4];
	public static int[] b = new int[100];
	public static int Main()
	{
		read();
		tongji();
		print();
		return 0;
	}




}

