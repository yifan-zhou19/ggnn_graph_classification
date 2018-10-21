package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double[] a = new double[100];
		double[] b = new double[100];
		int i;
		int j;
		int k;
		int n;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = (b[i] / a[i]) * 100;
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] - c[0] > 5)
			{
				System.out.print("better\n");
			}
			if (c[0] - c[i] > 5)
			{
				System.out.print("worse\n");
			}
			if (c[i] - c[0] <= 5 && c[0] - c[i] <= 5)
			{
				System.out.print("same\n");
			}
		}
	}

}

