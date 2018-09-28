package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[1000];
		double[] b = new double[1000];
		double c;
		double d;
		int n;
		int i;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			c = b[0] / a[0];
			d = b[i] / a[i];
			if ((d - c) > 0.05)
			{
			System.out.print("better\n");
			}
			else if ((c - d) > 0.05)
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

