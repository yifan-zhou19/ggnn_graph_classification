package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[][] a = new double[100][3];
		int i;
		int j;
		int k;
		double d;
		double max = 0;
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
				a[i][1] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][2] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 0;j < (n - 1);j++)
		{
			 for (k = j + 1;k < n;k++)
			 {
				  d = (double)Math.pow(a[j][1] - a[k][1],2) + Math.pow(a[j][2] - a[k][2],2);
				  if (d > max)
				  {
					  max = d;
				  }
			 }
		}
		max = Math.pow(max,0.5);
		System.out.printf("%.4lf",max);
		return 0;
	}
}

