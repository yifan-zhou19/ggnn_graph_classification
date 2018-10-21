package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		double s = 0;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] sx = new int[n];
		double[] sy = new double[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sx[i]) = Integer.parseInt(tempVar3);
			}
		}
		if (n < 10)
		{
			for (i = 0;i < n;i++)
			{
			m = m + sz[i];
			if (90 <= sx[i] != 0 && sx[i] <= 100)
			{
			   sy[i] = 4.0;
			}
			else if (85 <= sx[i] != 0 && sx[i] <= 89)
			{
				sy[i] = 3.7;
			}
			else if (82 <= sx[i] != 0 && sx[i] <= 84)
			{
			   sy[i] = 3.3;
			}
			else if (78 <= sx[i] != 0 && sx[i] <= 81)
			{
				sy[i] = 3.0;
			}
			else if (75 <= sx[i] != 0 && sx[i] <= 77)
			{
				sy[i] = 2.7;
			}
			else if (72 <= sx[i] != 0 && sx[i] <= 74)
			{
				sy[i] = 2.3;
			}
			else if (68 <= sx[i] != 0 && sx[i] <= 71)
			{
				sy[i] = 2.0;
			}
			else if (64 <= sx[i] != 0 && sx[i] <= 67)
			{
				sy[i] = 1.5;
			}
			else if (60 <= sx[i] != 0 && sx[i] <= 63)
			{
				sy[i] = 1.0;
			}
			else
			{
				sy[i] = 0;
			}
			s = s + sy[i] * sz[i];
			}
		}
		x = s / m;

		System.out.printf("%.2lf",x);
		return 0;
	}


}

