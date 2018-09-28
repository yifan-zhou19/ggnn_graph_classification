package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double[][] a = new double[100][2];
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		p = Math.pow((a[0][0] - a[1][0]),2) + Math.pow((a[0][1] - a[1][1]),2);
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (p > Math.pow((a[i][0] - a[j][0]),2) + Math.pow((a[i][1] - a[j][1]),2))
				{
					p = p;
				}
				else
				{
					p = Math.pow((a[i][0] - a[j][0]),2) + Math.pow((a[i][1] - a[j][1]),2);
				}
			}
		}

		System.out.printf("%.4f\n",Math.sqrt(p));
	}
}

