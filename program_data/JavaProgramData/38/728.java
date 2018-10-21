package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		double[] b = new double[100];
		double s;
		double c;
		i = 0,j = 0;
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
			for (j = 0;j < a[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[j] = Double.parseDouble(tempVar3);
				}
			}
			s = 0,c = 0;
			for (j = 0;j < a[i];j++)
			{
				c += b[j];
			}
			c = c * 1.0 / a[i];
			for (j = 0;j < a[i];j++)
			{
				s += (b[j] - c) * (b[j] - c);
			}
			s = Math.sqrt(s * 1.0 / a[i]);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}




}

