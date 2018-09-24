package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n = 0;
		int k = 0;
		int i = 0;
		int j = 0;
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
				k = Integer.parseInt(tempVar2);
			}
			double a = 0;
			double s = 0;
			double[] sz = new double[1000];
			for (j = 0;j < k;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j] = Double.parseDouble(tempVar3);
				}
				a += sz[j];
			}
			a = a / k;
			for (j = 0;j < k;j++)
			{
				s += (sz[j] - a) * (sz[j] - a);
			}
			s = s / k;
			s = Math.sqrt(s);
			System.out.printf("%.5f\n",s);
		}

	}

}

