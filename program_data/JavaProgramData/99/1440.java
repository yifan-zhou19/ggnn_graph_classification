package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] age = new int[101];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double af;
		double bf;
		double cf;
		double df;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0; i < n; i++)
		{
			if (age[i] <= 18)
			{
			  a++;
			}
			else if (age[i] >= 19 && age[i] <= 35)
			{
				b++;
			}
			else if (age[i] >= 36 && age[i] <= 60)
			{
				c++;
			}
			else if (age[i] >= 61)
			{
				d++;
			}
		}
		af = (double)100 * a / n;
		bf = (double)100 * b / n;
		cf = (double)100 * c / n;
		df = (double)100 * d / n;
		System.out.printf("1-18: %.2lf%%", af);
		System.out.printf("\n19-35: %.2lf%%", bf);
		System.out.printf("\n36-60: %.2lf%%", cf);
		System.out.printf("\n60??: %.2lf%%", df);
	}


}

