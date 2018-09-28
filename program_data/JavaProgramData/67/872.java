package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double jiwei1;
		double jiwei2;
		double jiweiyx;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jiwei1 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			jiwei2 = Double.parseDouble(tempVar3);
		}
		jiweiyx = (jiwei2 / jiwei1) * 100;

		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b[i] = Double.parseDouble(tempVar5);
			}
			c[i] = (b[i] / a[i]) * 100;
			if (c[i] - jiweiyx >= 5)
			{
				System.out.print("better\n");
			}
			if (jiweiyx - c[i] >= 5)
			{
				System.out.print("worse\n");
			}
			if (jiweiyx - c[i] <= 5 && c[i] - jiweiyx <= 5)
			{
				System.out.print("same\n");
			}
		}

		return 0;
	}

}

