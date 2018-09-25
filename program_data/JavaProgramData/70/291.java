package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[][] a = new double[20][2];
		double t;
		double s = 0;
		int i;
		int j;
		int n;
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
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;i + j < n;j++)
			{
				t = Math.sqrt((a[i][0] - a[i + j][0]) * (a[i][0] - a[i + j][0]) + (a[i][1] - a[i + j][1]) * (a[i][1] - a[i + j][1]));
				if (t > s)
				{
					s = t;
				}
			}
		}
		System.out.printf("%.4lf",s);
		System.out.print("\n");
	}
}

