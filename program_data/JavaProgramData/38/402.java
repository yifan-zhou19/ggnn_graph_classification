package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num;
		double av = 0.0;
		double sum = 0.0;
		double cha = 0.0;
		double s = 0.0;
		double f;
		double[] a = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			av = 0.0;
			sum = 0.0;
			cha = 0.0;
			s = 0.0;
			f = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < num;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + a[j];
			}
			av = sum / num;
			for (j = 0;j < num;j++)
			{
				cha = cha + (a[j] - av) * (a[j] - av);
			}
			s = cha / num;
			f = Math.sqrt(s);
			System.out.printf("%.5f\n",f);
		}
		return 0;
	}
}

