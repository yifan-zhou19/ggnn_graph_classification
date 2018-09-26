package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int x = 0;
		double sum = 0;
		double s = 0;
		double[] z = new double[100];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < x;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(z[j]) = Double.parseDouble(tempVar3);
				}
				sum = sum + z[j];
			}
			for (int f = 0;f < x;f++)
			{
				s = s + (z[f] - sum / x) * (z[f] - sum / x);
			}
			s = s / x;
			s = Math.pow(s,0.5);
			System.out.printf("%0.5lf\n",s);
			sum = 0;
			s = 0;
		}
		return 0;
	}

}

