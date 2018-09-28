package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int n;
		double[] cao = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double[] s = new double[100];
		double[] ji = new double[1000];
		for (i = 0;i < k;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  a[i] = 0;
		  for (j = 0;j < n;j++)
		  {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   ji[j] = Double.parseDouble(tempVar3);
		   }
		   a[i] = a[i] + ji[j];
		  }

		  a[i] = (double)a[i] / n;
		  s[i] = 0;
		  for (j = 0;j < n;j++)
		  {
			 b[i] = ji[j] - a[i];
			 b[i] = b[i] * b[i];
			 s[i] = s[i] + b[i];
		  }
		  s[i] = (double)s[i] / n;
		  cao[i] = Math.sqrt(s[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",cao[i]);
		}
		return 0;
	}
}

