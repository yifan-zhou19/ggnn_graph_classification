package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double m;
		int[] a = new int[NUM];
		int[] b = new int[NUM];
		double[] c = new double[NUM];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		m = (double)(b[0]) / (a[0]);
		for (i = 1;i < n;i++)
		{
			c[i] = (double)(b[i]) / (a[i]);
			if ((c[i] - m) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((m - c[i]) > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

