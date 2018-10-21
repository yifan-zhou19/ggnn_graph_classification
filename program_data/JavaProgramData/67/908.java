package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		double[] k = new double[100];
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
			k[i] = (double)b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			if ((k[i] - k[0]) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if ((k[0] - k[i]) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if ((k[i] - k[0]) <= 0.05 && (k[0] - k[i]) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}

		return 0;
	}
}

