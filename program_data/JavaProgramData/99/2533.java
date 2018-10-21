package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 1;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a >= 1 && a <= 18)
			{
				b++;
			}
			else if (a >= 19 && a <= 35)
			{
				c++;
			}
			else if (a >= 36 && a <= 60)
			{
				d++;
			}
			else if (a >= 61)
			{
				e++;
			}
			i++;
		}
		double N;
		double B;
		double C;
		double D;
		double E;
		N = n;
		B = b;
		C = c;
		D = d;
		E = e;
		double F;
		double G;
		double H;
		double I;
		F = B / N * 100;
		G = C / N * 100;
		H = D / N * 100;
		I = E / N * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",F,G,H,I);
		return 0;
	}

}

