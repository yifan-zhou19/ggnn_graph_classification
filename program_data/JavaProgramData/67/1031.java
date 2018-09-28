package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double j;
		double k;
		double l;
		double n;
		double[] a = new double[1000];
		double[] b = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k = Double.parseDouble(tempVar3);
			}
			b[i] = k / j;
		}
		for (i = 1;i <= n - 1;i++)
		{
			if (b[i] - b[0] > 0.05)
			{
				System.out.print("better\n");
			}
			if (b[i] - b[0] < -0.05.getValue() != 0)
			{
				System.out.print("worse\n");
			}
			if (b[i] - b[0] <= 0.05 && b[i] - b[0] >= -0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

