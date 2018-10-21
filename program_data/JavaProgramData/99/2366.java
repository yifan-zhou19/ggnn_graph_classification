package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		double n;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double b1;
		double c1;
		double d1;
		double e1;
		char m = '%';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] >= 1 && a[i] <= 18)
			{
				b++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				c++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				d++;
			}
			if (a[i] > 60)
			{
				e++;
			}
		}
			b1 = (b / n) * 100;
			 c1 = (c / n) * 100;
		   d1 = (d / n) * 100;
	   e1 = (e / n) * 100;
	   System.out.printf("1-18: %.2lf%c\n",b1,m);

	 System.out.printf("19-35: %.2lf%c\n",c1,m);
	 System.out.printf("36-60: %.2lf%c\n",d1,m);
	 System.out.printf("60??: %.2lf%c\n",e1,m);
	 return 0;
	}
}

