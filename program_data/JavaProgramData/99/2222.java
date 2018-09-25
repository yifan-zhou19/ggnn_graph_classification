package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int b;
		int c;
		int d;
		int e;
		int j;
		double f;
		double g;
		double h;
		double i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0,b = 0,c = 0,d = 0,e = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
			if (a[j] < 19)
			{
				b++;
			}
			else if (a[j] < 36)
			{
				c++;
			}
			else if (a[j] < 61)
			{
				d++;
			}
			else
			{
				e++;
			}
		}
		f = (double)b / (double)n * 100;
		g = (double)c / (double)n * 100;
		h = (double)d / (double)n * 100;
		i = (double)e / (double)n * 100;
		System.out.printf("1-18: %.2f%%\n",f);
		System.out.printf("19-35: %.2f%%\n",g);
		System.out.printf("36-60: %.2f%%\n",h);
		System.out.printf("60??: %.2f%%\n",i);
		return 0;
	}

}

