package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[10000];
	int[] b = new int[10000];
	int i;
	double[] c = new double[10000];
	double m;
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
	c[i] = 1.0 * b[i] / a[i];
	}
	for (i = 1;i < n;i++)
	{
	m = c[i] - c[0];
	if (m > 0.05)
	{
		System.out.print("better\n");
	}
	if (m + 0.05 < 0)
	{
		System.out.print("worse\n");
	}
	if (m <= 0.05 && m + 0.05 >= 0)
	{
		System.out.print("same\n");
	}
	}
	return 0;
	}
}

