package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double p;
		double q;
		double ww;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = Double.parseDouble(tempVar3);
		}
		ww = q / p;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(a[i]) = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				(b[i]) = Double.parseDouble(tempVar5);
			}
			c[i] = b[i] / a[i];
			if (c[i] - ww > 0.05)
			{
				System.out.print("better\n");
			}


			else if (ww - c[i] > 0.05)
			{

					System.out.print("worse\n");
			}
				else if (ww - c[i] <= 0.05 || c[i] - ww <= 0.05)
				{
						System.out.print("same\n");
				}


		}


		return 0;
	}

}

