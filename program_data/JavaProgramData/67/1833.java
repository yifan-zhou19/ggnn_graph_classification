package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int z;
		int e;
		int i;
		int k = 0;
		double[] y = new double[100];
		char[][] x = new char[100][10];
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
				z = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				e = Integer.parseInt(tempVar3);
			}
			y[i] = 1.0 * e / z;
			if (i != 0)
			{
				if (y[i] - y[0] > 0.05)
				{
					x[k] = "better";
				}
				else if (y[0] - y[i] > 0.05)
				{
					x[k] = "worse";
				}
				else
				{
					x[k] = "same";
				}
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",x[i]);
		}
		return 0;
	}
}

