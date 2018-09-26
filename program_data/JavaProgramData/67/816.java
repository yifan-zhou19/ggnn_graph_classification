package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	float x;
	float y;
	float[] a = new float[2];
	float[] b = new float[2];
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Float.parseFloat(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[1] = Float.parseFloat(tempVar3);
	}
	x = a[1] / a[0];
	int i;
	for (i = 0;i < n - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[0] = Float.parseFloat(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		b[1] = Float.parseFloat(tempVar5);
	}
	y = b[1] / b[0];
	if (y - x > 0.05F)
	{
	System.out.print("better\n");
	}
	else if (x - y > 0.05F)
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

