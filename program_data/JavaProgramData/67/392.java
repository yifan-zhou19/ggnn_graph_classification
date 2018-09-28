package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double jsum;
		double juse;
		double a;
		int i;
		int j;
		double[] xsum = new double[100];
		double[] xuse = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jsum = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			juse = Double.parseDouble(tempVar3);
		}
		a = juse / jsum;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				xsum[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				xuse[i] = Double.parseDouble(tempVar5);
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			if (((xuse[j] / xsum[j]) - a) > 0.05)
			{
				System.out.print("better\n");
			}
			else if (((a - xuse[j] / xsum[j])) > 0.05)
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

