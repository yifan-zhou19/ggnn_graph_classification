package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[100][1000];
		int n;
		int k;
		int i;
		int j;
		double s1;
		double num;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < k;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[j][i]) = Double.parseDouble(tempVar3);
				}
			}
			num = 0.0;
			for (i = 0;i < k;i++)
			{
				num = num + a[j][i];
			}

			s = 0.0;
			for (i = 0;i < k;i++)
			{
				s = s + (a[j][i] - num / k) * (a[j][i] - num / k);
			}
			s1 = Math.sqrt(s / k);
			System.out.printf("%.5lf\n",s1);
		}
		return 0;
	}
}

