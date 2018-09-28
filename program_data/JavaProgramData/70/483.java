package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		float[][] a = new float[100][2];
		float max = 0.0F;
		float d;
	double tmp;
	int i;
	int n;
	int j;
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
			a[i][1] = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][2] = Float.parseFloat(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{
			tmp = Math.sqrt((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
			d = (float)tmp;
			if (d > max)
			{
				max = d;
			}
		}
	}

	System.out.printf("%.4f\n",max);
	}


}

