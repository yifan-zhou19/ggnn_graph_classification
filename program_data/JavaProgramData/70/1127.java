package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//


	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int l;
		double[][] a = new double[LEN][2];
		double[] b = new double[LEN];
		double c;
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
		l = n * (n - 1) / 2;
		m = 0;
		for (i = 0;i < n - 1;i++)
		{
		  for (j = i + 1;j < n;j++)
		  {
			b[m] = (a[j][0] - a[i][0]) * (a[j][0] - a[i][0]) + (a[j][1] - a[i][1]) * (a[j][1] - a[i][1]);
			b[m] = Math.sqrt(b[m]);
			m++;
		  }
		}
		c = b[0];
		for (i = 1;i < l;i++)
		{
		  if (b[i] > c)
		  {
			c = b[i];
		  }
		}
		System.out.printf("%.4lf",c);
		return 0;
	}


}

