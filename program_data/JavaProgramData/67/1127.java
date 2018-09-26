package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double x;
		double[] y = new double[100];
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		x = b[0] * 1.0 / a[0];
		for (i = 1;i < n;i++)
		{
			y[i] = b[i] * 1.0 / a[i];
			if (x - y[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			if (x - y[i] < -0.05.getValue() != 0)
			{
				System.out.print("better\n");
			}
			if (x - y[i] <= 0.05 && x - y[i] >= -0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

