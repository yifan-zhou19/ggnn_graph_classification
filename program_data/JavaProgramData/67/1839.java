package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		double x;
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
	x = 1.0 * b[0] / a[0];
	for (i = 1;i < n;i++)
	{
		if (x > 1.0 * b[i] / a[i] && (x - 1.0 * b[i] / a[i] > 0.05))
		{
			System.out.print("worse\n");
		}
		else if (x < 1.0 * b[i] / a[i] && (1.0 * b[i] / a[i] - x>0.05))
		{
			System.out.print("better\n");
		}
		else
		{
			System.out.print("same\n");
		}
	}
	return 0;
	}
}

