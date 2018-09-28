package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		double[] input = new double[100];
		int m = 0;
		int i;
		int u = 0;
		double[] s = new double[100];
		for (i = 0;i < 100;i++)
		{
			s[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (m < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			double a = 0;
			for (i = 0;i < k;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					input[i] = Double.parseDouble(tempVar3);
				}
			}
			for (i = 0;i < k;i++)
			{
				a += input[i];
			}
			a = a / k;
			for (i = 0;i < k;i++)
			{
				s[m] += (input[i] - a) * (input[i] - a);
			}
			s[m] = Math.sqrt(s[m] / k);
			m++;
		}
		m = 0;
		while (m < n)
		{
			System.out.printf("%.5lf\n",s[m]);
			m++;
		}
		return 0;
	}
}

