package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		double[] x = new double[100];
		double[] s = new double[100];
		double a;
		double[] S = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a = 0;
			for (j = 0;j < n;j++)
			{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  x[j] = Double.parseDouble(tempVar3);
			  }
			  a += x[j];
			}
			for (j = 0;j < n;j++)
			{
			s[i] += Math.pow((x[j] - a / n),2);
			}

			S[i] = Math.sqrt(s[i] / n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",S[i]);
		}



	return 0;
	}
}

