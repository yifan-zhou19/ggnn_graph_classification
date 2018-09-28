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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = (double)b[i] / a[i];
		}
		if (c[1] - c[0] > 0.05)
		{
			System.out.print("better");
		}
		else if (c[0] - c[1] > 0.05)
		{
			System.out.print("worse");
		}
		else
		{
			System.out.print("same");
		}
		for (i = 2;i < n;i++)
		{
			System.out.print("\n");
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
		}
		return 0;
	}
}

