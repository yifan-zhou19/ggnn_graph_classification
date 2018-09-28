package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		double[] c = new double[100];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = (double)b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] - c[0] > 0.05)
			{
				System.out.print("better");
			}
			else if (c[0] - c[i] > 0.05)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

