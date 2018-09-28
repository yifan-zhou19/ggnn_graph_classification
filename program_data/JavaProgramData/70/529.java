package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		float[][] a = new float[100][2];
		double dis;
		double d;
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
				a[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Float.parseFloat(tempVar3);
			}
		}
		dis = Math.sqrt((a[0][0] - a[1][0]) * (a[0][0] - a[1][0]) + (a[0][1] - a[1][1]) * (a[0][1] - a[1][1]));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				d = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				if (d > dis)
				{
					dis = d;
				}
			}
		}
		System.out.printf("%.4f\n",dis);
	}

}

