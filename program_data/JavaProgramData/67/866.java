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
	int i;
	int j;
	int l;
	int m;
	int[] a = new int[99];
	int[] z = new int[99];
	float q;
	float w;
	n = n - 1;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		l = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	q = 1.0 * m / l;
	for (i = 0;i < n;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		l = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		m = Integer.parseInt(tempVar5);
	}
	w = 1.0 * m / l;
	if (w >= q + 0.05)
	{
	System.out.print("better\n");
	}
	else if (w <= q - 0.05)
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

