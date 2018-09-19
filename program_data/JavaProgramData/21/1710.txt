package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int sum = 0;
		int[] k = new int[300];
		int m = 0;
		int j;
		double ave;
		double[] c = new double[300];
		double d;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		ave = 1.0 * sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] * 1.0 - ave >= 0)
			{
				c[i] = a[i] * 1.0 - ave;
			}
			else
			{
				c[i] = ave - a[i] * 1.0;
			}
		}
		d = c[0];
		for (i = 1;i < n;i++)
		{
			if (d < c[i])
			{
				d = c[i];
			}
		}
		for (i = 0;i < n;i++)
		{

			if (c[i] == d)
			{
				k[m] = a[i];
				m++;
			}

	/*		if(a[i]*1.0-ave>=0){
				if(d==a[i]*1.0-ave)
				{
					k[m]=a[i];m=m+1;
				}
			}
			else {
				if(d==ave-a[i]*1.0)
				{
					k[m]=a[i];m=m+1;
				}
			}*/
		}


		if (m == 1)
		{
			System.out.printf("%d",k[0]);
		}
		else if (m > 1)
		{
			for (j = 0;j < m - 1;j++)
			{
				System.out.printf("%d,",k[j]);
			}
			System.out.printf("%d",k[m - 1]);
		}






	}


}

