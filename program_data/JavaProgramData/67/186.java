package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] s = new double[100][2];
		double[] z = new double[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i][1] = Double.parseDouble(tempVar3);
			}
			z[i] = s[i][1] / s[i][0];
		}
		for (i = 1;i < n;i++)
		{
			if (z[i] - z[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else if (z[0] - z[i] > 0.05)
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

