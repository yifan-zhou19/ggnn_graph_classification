package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] f = new int[10];
		int x = 0;
		double[] sf = new double[10];
		double y = 0;
		double GPA;
		int i;
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
				(f[i]) = Integer.parseInt(tempVar2);
			}
			x += f[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sf[i]) = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sf[i] >= 90 && sf[i] <= 100)
			{
				sf[i] = 4.0;
			}
			else if (sf[i] >= 85 && sf[i] <= 89)
			{
				sf[i] = 3.7;
			}
			else if (sf[i] >= 82 && sf[i] <= 84)
			{
				sf[i] = 3.3;
			}
			else if (sf[i] >= 78 && sf[i] <= 81)
			{
				sf[i] = 3.0;
			}
			else if (sf[i] >= 75 && sf[i] <= 77)
			{
				sf[i] = 2.7;
			}
			else if (sf[i] >= 72 && sf[i] <= 74)
			{
				sf[i] = 2.3;
			}
			else if (sf[i] >= 68 && sf[i] <= 71)
			{
				sf[i] = 2.0;
			}
			else if (sf[i] >= 64 && sf[i] <= 67)
			{
				sf[i] = 1.5;
			}
			else if (sf[i] >= 60 && sf[i] <= 63)
			{
				sf[i] = 1.0;
			}
			else if (sf[i] < 60)
			{
				sf[i] = 0;
			}
			sf[i] = f[i] * sf[i];
			y += sf[i];
		}
		GPA = y / x;
		System.out.printf("%.2lf",GPA);

		return 0;
	}



}

