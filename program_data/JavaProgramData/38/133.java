package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double s = 0;
		double[] a = new double[100];
		double aver = 0;
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
			{
				aver = 0;
				s = 0;
				for (j = 0;j < n;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j] = Double.parseDouble(tempVar3);
					}
					aver += a[j];
				}
				aver /= n;
				for (j = 0;j < n;j++)
				{
					s += ((a[j] - aver) * (a[j] - aver));
				}
				s /= n;
				s = Math.sqrt(s);
				System.out.printf("%.5lf\n",s);
		}
		}
		return 0;
	}
}

