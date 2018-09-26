package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] ZS = new int[NUMBER];
	int[] YX = new int[NUMBER];
	double x;
	double y;
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
		ZS[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		YX[i] = Integer.parseInt(tempVar3);
	}
	}
	x = (1.000 * YX[0]) / ZS[0];
	for (i = 1;i < n;i++)
	{
	y = (1.000 * YX[i]) / ZS[i];
	if (y - x > 0.05)
	{
	System.out.print("better\n");
	}
	else if (x - y > 0.05)
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

