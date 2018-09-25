package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] y = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double aa;
		double bb;
		double cc;
		double dd;
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
				y[i] = Integer.parseInt(tempVar2);
			}
			if (y[i] <= 18)
			{
				a = a + 1;
			}
			else if (y[i] <= 35)
			{
				b = b + 1;
			}
			else if (y[i] <= 60)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1;
			}
		}
		aa = (double)a / (double)n * 100;
		bb = (double)b / (double)n * 100;
		cc = (double)c / (double)n * 100;
		dd = (double)d / (double)n * 100;
		System.out.printf("1-18: %.2f%%\n19-35: %.2f%%\n36-60: %.2f%%\n60??: %.2f%%\n",aa,bb,cc,dd);
	}
}

