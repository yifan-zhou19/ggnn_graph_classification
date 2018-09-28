package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] sz = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		int i;
		int n;
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
				sz[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			a[i] = b[i] / sz[i] * 100;
		}
		for (i = 1;i < n;i++)
		{

			if (a[i] - a[0] < -5.getValue() != 0)
			{
				System.out.print("worse\n");
			}
			if (a[i] - a[0] > 5)
			{
				System.out.print("better\n");
			}
			if (a[i] - a[0] > -5 && a[i] - a[0] < 5)
			{
				System.out.print("same\n");
			}
		}
		return 0;



	}
}

