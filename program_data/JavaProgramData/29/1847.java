package <missing>;

public class GlobalMembers
{
	public static double[] arr = new double[101];


	public static int Main()
	{
		double a = 2;
		double prea = 1;
		double b = 1;
		double preb = 1;
		double tmp;
		int n;
		int m;
		for (int i = 1; i < 101; ++i)
		{
			arr[i] = arr[i - 1] + a / b;
			tmp = a;
			a += prea;
			prea = tmp;
			tmp = b;
			b += preb;
			preb = tmp;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%.3lf\n", arr[n]);
		}
	}
}

