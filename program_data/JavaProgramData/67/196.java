package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] s = new int[1000];
	int[] z = new int[1000];
	int i;
	int j;
	double[] a = new double[1000];
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
		s[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		z[i] = Integer.parseInt(tempVar3);
	}
	a[i] = 100.0 * z[i] / s[i];
	}
	for (j = 1;j < n;j++)
	{
	if (a[j] - a[0] + 5 > 10)
	{
	System.out.print("better\n");
	}
	 else if (a[j] - a[0] + 5 < 0)
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

