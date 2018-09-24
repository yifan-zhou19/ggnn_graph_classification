package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[200];
		double[] b = new double[200];
		double[] c = new double[200];
		int[] d = new int[200];
		double m;
		double n;
		double sum = 3.500;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(d[j]) = Integer.parseInt(tempVar2);
			}
			if (d[j] == 1)
			{
			   System.out.print("2.000\n");
			}
		   else if (d[j] == 2)
		   {
			   System.out.print("3.500\n");
		   }
			else
			{
			for (i = 3;i <= d[j];i++)
			{
			a[1] = 1.0;
			a[2] = 2.0;
			a[i] = a[i - 1] + a[i - 2];
			b[1] = 2.0;
			b[2] = 3.0;
			b[i] = b[i - 1] + b[i - 2];
			c[i] = b[i] / a[i];

			sum += c[i];

			}

			System.out.printf("%.3lf\n",sum);
			sum = 3.500;
			}
		}
		 return 0;
	}



}

