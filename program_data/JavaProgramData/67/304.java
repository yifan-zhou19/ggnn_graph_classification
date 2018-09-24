package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double a1;
		double a2;
		double[] b1 = new double[100];
		double[] b2 = new double[100];
		double[] d = new double[100];
		double c;
		char[][] jieguo = new char[100][7];
		final String jieguo1 = "better";
		final String jieguo2 = "worse";
		final String jieguo3 = "same";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a1 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a2 = Double.parseDouble(tempVar3);
		}
		c = a2 / a1;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b1[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b2[i] = Double.parseDouble(tempVar5);
			}
			d[i] = b2[i] / b1[i];
			if (d[i] - c > 0.05)
			{
				jieguo[i] = jieguo1;
			}
			else if (c - d[i] > 0.05)
			{
				jieguo[i] = jieguo2;
			}
			else
			{
				jieguo[i] = jieguo3;
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			System.out.printf("%s\n",jieguo[i]);
		}
		System.out.printf("%s",jieguo[n - 2]);
		return 0;
	}
}

