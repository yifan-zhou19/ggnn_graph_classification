package <missing>;

public class GlobalMembers
{
	public static int Pe(int n)
	{
		int H;
		if (n == 1)
		{
			H = 1;
		}
		else if (n == 2)
		{
			H = 2;
		}
		else
		{
		   H = Pe(n - 1) + Pe(n - 2);
		}
		return H;
	}
	public static double he(int n)
	{
		double Q;
		if (n == 1)
		{
			Q = 2 / 1;
		}
		else
		{
			Q = he(n - 1) + G(n);
		}
		return Q;
	}
	public static double G(int n)
	{
		double Y;
		if (n == 1)
		{
			Y = 2 / 1;
		}
		else
		{
			Y = (double)Pe(n + 1) / Pe(n);
		}
		return Y;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] X = new int[100];

		int i;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				X[i] = Integer.parseInt(tempVar2);
			}

		}
		double j;
		for (i = 0;i < n;i++)
		{
			j = he(X[i]);
			System.out.printf("%.3lf\n",j);
		}


		return 0;
	}




}

