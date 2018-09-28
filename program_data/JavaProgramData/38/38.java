package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int j;
		double[] a = new double[1000];
		double total = 0;
		double pf = 0;
		double jz;
		double s;
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
				total = 0;
				pf = 0;
				jz = 0;
				s = 0;
				for (j = 0;j < n;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j] = Double.parseDouble(tempVar3);
					}
				}
				for (j = 0;j < n;j++)
				{
					total += a[j];
				}
				jz = total / n;
				for (j = 0;j < n;j++)
				{
					pf += (a[j] - jz) * (a[j] - jz);
				}
				s = Math.sqrt(pf / n);
				System.out.printf("%.5f\n",s);
		}
	}
}

