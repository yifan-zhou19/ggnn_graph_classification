package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	float a;
	float b;
	float p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Float.parseFloat(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Float.parseFloat(tempVar3);
	}
	p = b / a;
	for (i = 0;i < n - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a = Float.parseFloat(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		b = Float.parseFloat(tempVar5);
	}
	if (b / a - p > 0.05F)
	{
		System.out.print("better\n");
	}
	if (p - b / a > 0.05F)
	{
		System.out.print("worse\n");
	}
	if (p - b / a <= 0.05F && b / a - p <= 0.05F)
	{
		System.out.print("same\n");
	}
	}
	return 0;
	}


}

