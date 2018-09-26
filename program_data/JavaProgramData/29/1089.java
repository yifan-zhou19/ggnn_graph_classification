package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int k;
		int j;
		int[] g = new int[100];
		double[] z = new double[100];
		double sum;
		double[] s = new double[102];
		s[0] = 1;
		s[1] = 2;
		k = 0;
		for (i = 0;i < 21;i++)
		{
		  s[i + 2] = s[i] + s[i + 1];
		  z[k] = s[i + 1] / s[i];
		  k++;
		}
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (n = 0;n < m;n++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  g[n] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (n = 0;n < m;n++)
		  {
			  sum = 0;
			 k = 0;
			 for (j = 0;j < g[n];j++)
			 {
			 sum += z[k];
			 k++;
			 }
		  System.out.printf("%.3lf\n",sum);
		  }
		return 0;
	}
}

