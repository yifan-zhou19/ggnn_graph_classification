package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		double A;
		double b;
		double c;
		double d;
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
			if (a[i] < 19)
			{
				n1++;
			}
			else if (a[i] > 18 && a[i] < 36)
			{
				n2++;
			}
			else if (a[i] > 35 && a[i] < 61)
			{
				n3++;
			}
			else
			{
				n4++;
			}
		}
		A = (double)n1 / n * 100;
		b = (double)n2 / n * 100;
		c = (double)n3 / n * 100;
		d = (double)n4 / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",A,b,c,d);
	 return 0;
	}
}

