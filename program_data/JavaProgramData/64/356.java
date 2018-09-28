package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int b;
		int c;
		int n;
		double[][] s = new double[100][100];
		double max;
		double[][] a = new double[100][3];
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
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i][2] = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s[i][j] = Math.sqrt(((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2])));
			}
		}
		for (k = 0;k < (n * (n - 1) / 2);k++)
		{
			max = 0;
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (s[i][j] > max)
					{
						max = s[i][j];
						b = i;
						c = j;
					}
				}
			}
			System.out.printf("(%.0lf,%.0lf,%.0lf)-(%.0lf,%.0lf,%.0lf)=%.2lf\n",a[b][0],a[b][1],a[b][2],a[c][0],a[c][1],a[c][2],max);
			s[b][c] = 0;
		}
	}
}

