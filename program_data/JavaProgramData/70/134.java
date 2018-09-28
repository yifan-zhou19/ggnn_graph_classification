package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int num;
	public static int p;
	public static float[] x = new float[10];
	public static float[] y = new float[10];
	public static double dis;
	public static double temp;
	public static int Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		num = Integer.parseInt(tempVar);
	}
	dis = 0;
	for (i = 1;i <= num;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[i] = Float.parseFloat(tempVar3);
		}
	}
	for (p = 1;p <= num;p++)
	{
		for (i = num;i > 0;i--)
		{
			temp = Math.pow((x[p] - x[i]) * (x[p] - x[i]) + (y[p] - y[i]) * (y[p] - y[i]),0.5);
			if (temp >= dis)
			{
			dis = temp;
			}
		}
	}
	System.out.printf("%.4f\n", dis);
	return 0;
	}

}

