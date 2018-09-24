package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	float[] a = new float[n];
	float[] e = new float[n];
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Float.parseFloat(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		e[i] = Float.parseFloat(tempVar3);
	}
	if (i > 1)
	{
	if (e[i] / a[i] > 0.05 + e[1] / a[1])
	{
	System.out.print("better");
	System.out.print("\n");
	}
	else if (e[i] / a[i] < e[1] / a[1] - 0.05)
	{
	System.out.print("worse");
	System.out.print("\n");
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

