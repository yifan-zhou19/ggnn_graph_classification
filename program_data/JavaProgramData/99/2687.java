package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int i;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		double f;
		double g;
		double h;
		double k;
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
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
		   if (a[i] <= 18)
		   {
		   b = b + 1;
		   }
		   else if (a[i] >= 19 && a[i] <= 35)
		   {
		   c = c + 1;
		   }
		   else if (a[i] >= 36 && a[i] <= 60)
		   {
		   d = d + 1;
		   }
		   else
		   {
			   e = e+1;
		   }
		}
		f = (double)b / n * 100;
		g = (double)c / n * 100;
		h = (double)d / n * 100;
		k = (double)e / n * 100;
		System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%",f,g,h,k);
	}
}

