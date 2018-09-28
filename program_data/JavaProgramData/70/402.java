package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		double[][] a = new double[10000][2];
		double m;
		double b;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		m = (a[1][0] - a[0][0]) * (a[1][0] - a[0][0]) + (a[1][0] - a[0][0]) * (a[1][0] - a[0][0]);
		 for (i = 0;i < n;i++)
		 {
			 for (j = i;j < n;j++)
			 {
				b = (a[j][0] - a[i][0]) * (a[j][0] - a[i][0]) + (a[j][1] - a[i][1]) * (a[j][1] - a[i][1]);
				if (b > m)
				{
				m = b;
				}
			 }
		 }
				System.out.printf("%.4lf",Math.sqrt(m));
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					i = Integer.parseInt(tempVar4);
				}
	}
}

