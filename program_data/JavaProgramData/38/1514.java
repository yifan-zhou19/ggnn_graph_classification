package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		 for (i = 0;i < k;i++)
		 {
		  int n;
		  int j;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  double[] sz = new double[100];
		  double[] s = new double[100];
		  double a = 0;
		  double sum1 = 0;
		  double sum2 = 0;

		  for (j = 0;j < n;j++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[j] = Double.parseDouble(tempVar3);
			}
			sum1 += sz[j];
		  }
			 a = sum1 / n;
			 for (j = 0;j < n;j++)
			 {
			   sum2 += (sz[j] - a) * (sz[j] - a);
			 }
			 s[i] = Math.sqrt(sum2 / n);
			 System.out.printf("%.5f\n",s[i]);
		 }

		 return 0;
	}
}

