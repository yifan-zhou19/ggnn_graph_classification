package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] c = new double[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			c[i] = ((double)b) / ((double)a);
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] - c[0] > 0.05)
			{
				System.out.print("better\n");
			}
			if (c[i] - c[0] < -0.05.getValue() != 0)
			{
				System.out.print("worse\n");
			}
			if ((c[i] - c[0] > -0.05) && (c[i] - c[0] < 0.05))
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

