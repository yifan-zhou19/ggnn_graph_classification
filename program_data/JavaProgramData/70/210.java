package <missing>;

public class GlobalMembers
{
	public static void Main(void argc, String[] args)
	{
		int n;
		int i;
		int j;
	float[] x = new float[100];
	float[] y = new float[100];
	double dis;
	double temp = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[i] = Float.parseFloat(tempVar3);
		}
	}
	for (i = 0;i < n - 1;i++)
	{
		for (j = i;j < n - 2;j++)
		{
			dis = (2 * Math.sqrt((x[i] - x[j + 1]) * (x[i] - x[j + 1]) + (y[i] - y[j + 1]) * (y[i] - y[j + 1]))) / 2;

			if (temp < dis)
			{
				temp = dis;
			}
		}
	}
	System.out.printf("%.4f\n",temp);
	}

}

