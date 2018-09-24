package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] b = new int[100];
		int[] c = new int[100];
		double m;
		double[] a = new double[100];
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
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			a[i] = (double)c[i] / b[i];
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] - a[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else if (a[0] - a[i] > 0.05)
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

