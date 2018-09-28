package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		double[] c = new double[100];
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
		c[0] = (double)b[0] / a[0];
		for (i = 1;i < n;i++)
		{
			c[i] = (double)b[i] / a[i];
			if ((double)(c[i] - c[0]) > 0.05)
			{
				System.out.print("better\n");
			}
			if ((double)(c[i] - c[0]) < -0.05)
			{
				System.out.print("worse\n");
			}
			if ((double)(c[i] - c[0] <= 0.05) && (double)(c[i] - c[0]) >= -0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

