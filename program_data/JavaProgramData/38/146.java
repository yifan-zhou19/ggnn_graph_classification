package <missing>;

public class GlobalMembers
{
	public static double[] x = new double[1001];
	public static double a;
	public static double S;
	public static int f(int k)
	{
		int i;
		a = 0;
		S = 0;
		for (i = 0;i < k;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x + i = tempVar;
			}
			a += x[i];
		}
		for (i = 0;i < k;i++)
		{
			S += Math.pow((x[i] - a / k),2);
		}
		S = S / k;
		S = Math.sqrt(S);
	}
	public static int Main()
	{
		int i;
		int k;
		int n;
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
						f(n);
						System.out.printf("%.5f\n",S);
		}
		return 0;
	}

}

