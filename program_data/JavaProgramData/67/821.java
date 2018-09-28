package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] a = new double[100];
		double c;
		double b;
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
				c = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			a[i] = b / c;
		}
		for (i = 1;i < n - 1;i++)
		{
			if (a[i] - a[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else if (a[0] - a[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		if (a[n - 1] - a[0] > 0.05)
		{
			System.out.print("better");
		}
		else if (a[0] - a[n - 1] > 0.05)
		{
			System.out.print("worse");
		}
		else
		{
			System.out.print("same");
		}
		return 0;
	}
}

