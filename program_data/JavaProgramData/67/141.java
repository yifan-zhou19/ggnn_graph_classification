package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[N];
		int[] b = new int[N];
		double[] c = new double[N];
		int n;
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = (((1.0 * b[i] / a[i])) * 100);
		}
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
			   if (c[i] - c[0] > 5)
			   {
					System.out.print("better\n");
			   }
			   else if (c[0] - c[i] > 5)
			   {
					System.out.print("worse\n");
			   }
			   else
			   {
					System.out.print("same\n");
			   }
			}
		}
		return 0;
	}
}

