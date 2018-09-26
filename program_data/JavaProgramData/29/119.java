package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int i;
	  int j;
	  int n;
	  int w;
	  double[] sum = new double[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < m;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		n = j;
	if (n == 1)
	{
		sum[i] = 2.0 / 1;
	}
	else if (n >= 2)
	{
		sum[i] = 2.0 / 1 + 3.0 / 2;
	}
		double[] sz1 = new double[100];
		double[] sz2 = new double[100];
		sz1[0] = 2;
		sz1[1] = 3;
		sz2[0] = 1;
		sz2[1] = 2;
		for (w = 2;w < n;w++)
		{
		  sz1[w] = sz1[w - 1] + sz1[w - 2];
		  sz2[w] = sz2[w - 1] + sz2[w - 2];
		  sum[i] = sum[i] + sz1[w] / sz2[w];
		}
		System.out.printf("%.3lf\n",sum[i]);
	  }
		return 0;
	}
}

