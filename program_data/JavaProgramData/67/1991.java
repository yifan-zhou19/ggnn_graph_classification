package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[][] sy = new double[100][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] sz = new double[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sy[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sy[i][1] = Double.parseDouble(tempVar3);
			}
			sz[i] = sy[i][1] / sy[i][0];
		}
		for (int k = 1;k < n;k++)
		{
			if ((sz[k] - sz[0]) < 0.05 && (sz[k] - sz[0])>-0.05)
			{
				System.out.print("same\n");
			}
			else if ((sz[0] - sz[k]) >= 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((sz[k] - sz[0]) >= 0.05)
			{
				System.out.print("better\n");
			}
		}
		return 0;
	}

}

