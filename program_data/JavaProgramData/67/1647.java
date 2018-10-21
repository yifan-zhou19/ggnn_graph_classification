package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int s;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	double[] c = new double[n];
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
		c[i] = 1.0 * b[i] / a[i];
	}
	for (i = 1;i < n;i++)
	{
		if (c[i] - c[0] > 0.05)
		{
			System.out.print("better");
			System.out.print("\n");
		}
		else if (c[0] - c[i] > 0.05)
		{
	System.out.print("worse");
			System.out.print("\n");
		}
		else
		{
	System.out.print("same");
			System.out.print("\n");
		}
	}
	return 0;
	}
}

