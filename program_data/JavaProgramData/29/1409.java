package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int j;
		int i;
		double a;
		double b;
		double k;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = 1,a = 2,b = 1.0;i <= n;i++)
		  {
			s[j] += a / b;
			k = b;
			b = a;
			a += k;
		  }


			System.out.printf("%.3lf\n",s[j]);
		}
		return 0;
	}



}

