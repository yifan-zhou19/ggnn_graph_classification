package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double m;
		int[] a = new int[1000];
		int[] b = new int[1000];
		double[] xl = new double[100];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		xl[0] = (1.0 * b[0] / a[0]) * 100;
		for (i = 1;i < n;i++)
		{
			xl[i] = (1.0 * b[i] / a[i]) * 100;
			m = xl[0] - xl[i];
			if (m > 5)
			{
				System.out.print("worse\n");
			}
			else if (m < (-5))
			{
				System.out.print("better\n");
			}
			else if (m <= 5 && m >= (-5))
			{
				System.out.print("same\n");
			}
		}

		return 0;
	}
}

