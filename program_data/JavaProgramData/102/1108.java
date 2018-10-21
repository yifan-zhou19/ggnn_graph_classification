package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		double[] sz = new double[40];
		double[] men = new double[40];
		double[] wo = new double[40];
		double x;
		double y;
		char[][] sx = new char[40][7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sx[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(sx[i],"male") == 0)
			{
				men[a] = sz[i];
				a++;
			}
			else
			{
				wo[b] = sz[i];
				b++;
			}
		}
		for (int c = 1;c <= a;c++)
		{
			for (int d = 0;d < a - c;d++)
			{
				if (men[d] > men[d + 1])
				{
					x = men[d + 1];
					men[d + 1] = men[d];
					men[d] = x;
				}
			}
		}
		for (int v = 1;v <= b;v++)
		{
			for (int q = 0;q < b - v;q++)
			{
				if (wo[q] > wo[q + 1])
				{
					y = wo[q + 1];
					wo[q + 1] = wo[q];
					wo[q] = y;
				}
			}
		}
		for (int df = 0;df < a;df++)
		{
			System.out.printf("%.2lf ",men[df]);
		}
		for (int se = b - 1;se > 0;se--)
		{
			System.out.printf("%.2lf ",wo[se]);
		}
		System.out.printf("%.2lf",wo[0]);
		return 0;
	}
}

