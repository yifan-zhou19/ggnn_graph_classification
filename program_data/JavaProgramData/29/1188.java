package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int[] a = new int[500];
		int[] b = new int[500];
		int m;
		double sum = 0;
		int[] n = new int[500];
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
				(n[i]) = Integer.parseInt(tempVar2);
			}
		}
		i = 0;
		for (i = 0;i < m;i++)
		{
			  a[0] = 2;
			  b[0] = 1;
			  a[1] = 3;
			  b[1] = 2;
			  sum = 0;
		  for (j = 0;j < n[i];j++)
		  {

				  if (j > 1)
				  {
					  a[j] = a[j - 1] + a[j - 2];
					  b[j] = b[j - 1] + b[j - 2];

				  }
				  sum += a[j] * 1.0 / b[j];
		  }
		  System.out.printf("%.3lf\n",sum);
		}


		return 0;

	}

}

