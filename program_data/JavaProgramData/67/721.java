package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int n;
		double[] d = new double[100];
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			d[i] = (double)b[i] / (double)a[i] - (double)b[0] / (double)a[0];
		}

		for (i = 1;i < n;i++)
		{
			if (d[i] > 0.05)
			{
				System.out.print("better\n");
			}
			if (d[i] < -0.05)
			{
				System.out.print("worse\n");
			}
			if (d[i] <= 0.05 && d[i] >= -0.05)
			{
				System.out.print("same\n");
			}
		}

		return 0;
	}
}

