package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int a;
		int b;
		int j;
		int[] x = new int[100];
		int[] y = new int[100];
		double result;
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
				n = Integer.parseInt(tempVar2);
			}
		  for (k = 0;k < n;k++)
		  {
					result = 0;
				 for (j = 0;j < n;j++)
				 {

				x[0] = 2;
				x[1] = 3;
				y[0] = 1;
				y[1] = 2;
				for (a = 2;a < n;a++)
				{
					x[a] = x[a - 1] + x[a - 2];
					y[a] = y[a - 1] + y[a - 2];
				}
				result = result + 1.0 * x[j] / y[j];
				 }



		  }

		 System.out.printf("%.3lf\n",result);
		}
		return 0;
	}
}

