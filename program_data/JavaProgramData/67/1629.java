package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
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
		c[0] = 1.0 * b[0] / a[0];
		for (j = 1;j < n;j++)
		{
			c[j] = 1.0 * b[j] / a[j] - c[0];
			if (c[j] >= 0)
			{
				if (c[j] > 0.05)
				{
					System.out.print("better\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
			else if (c[j] < 0)
			{
				c[j] = (-1) * c[j];
				if (c[j] > 0.05)
				{
					System.out.print("worse\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
		}
		return 0;
	}
}

