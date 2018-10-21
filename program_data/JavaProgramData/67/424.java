package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] sz1 = new double[100];
		double[] sz2 = new double[100];
		double[] k = new double[100];
		double j;
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
				sz1[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz2[i] = Double.parseDouble(tempVar3);
			}
			k[i] = (sz2[i]) / (sz1[i]);
		}
		j = k[0];
		for (i = 1;i < n;i++)
		{

			if (k[i] - j - 0.05 > 0)
			{
				System.out.print("better\n");
			}
			if (j - k[i] - 0.05 > 0)
			{
				System.out.print("worse\n");
			}
			if ((j - k[i] - 0.05 <= 0) && (k[i] - j - 0.05 <= 0))
			{
				System.out.print("same\n");
			}

		}
		return 0;
	}
}

