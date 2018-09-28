package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int[] a = new int[100];
		double[] b = new double[100];
		double s = 0;
		double c;
		double S = 0;
		double x;
		double j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				k = Integer.parseInt(tempVar);
			}
		for (n = 0;n < k;n++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < a[n];i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Double.parseDouble(tempVar3);
				}
				s += b[i];
			}
			c = s / a[n];
			s = 0;
			for (i = 0;i < a[n];i++)
			{
			S += (b[i] - c) * (b[i] - c);
			}
			x = S / a[n];
			S = 0;
			j = Math.sqrt(x);
			System.out.printf("%.5f\n",j);
		}
		return 0;
	}





}

