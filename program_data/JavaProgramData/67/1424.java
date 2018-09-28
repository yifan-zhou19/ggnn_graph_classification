package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double tm;
	double tmt;
	double c;
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
		tm = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		tmt = Double.parseDouble(tempVar3);
	}
	a[i] = tmt / tm;
	}
	for (i = 1;i < n;i++)
	{
	c = a[i] - a[0];
	if (c > 0.05)
	{
		System.out.print("better\n");
	}
	if (c < -0.05)
	{
		System.out.print("worse\n");
	}
	if (c >= -0.05 && c <= 0.05)
	{
		System.out.print("same\n");
	}
	}
	return 0;
	}
}

