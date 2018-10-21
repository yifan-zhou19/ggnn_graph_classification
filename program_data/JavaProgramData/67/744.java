package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		double[] c = new double[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			c[i] = (double)b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] - c[0] > 0.05)
			{
				System.out.print("better\n");
				continue;
			}
			if (c[0] - c[i] > 0.05)
			{
				System.out.print("worse\n");
				continue;
			}
			else
			{
				System.out.print("same\n");
				continue;
			}

		}
	}


}

