package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] a = new double[100][2];
		double temp;
		double result = 0;
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
		for (i = 0;i < n - 1;i++)
		{
						for (j = i + 1;j < n;j++)
						{
						temp = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
						if (result < temp)
						{
							result = temp;
						}
						}
		}
		System.out.printf("%.4lf",Math.sqrt(result));
	}
}

