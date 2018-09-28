package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[101];
		double counta;
		double countb;
		double countc;
		double countd;
		double one = 0;
		double two = 0;
		double three = 0;
		double four = 0;
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
				one++;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				two++;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				three++;
			}
			else if (a[i] >= 61)
			{
				four++;
			}
		}
	counta = one / n * 100;
	countb = two / n * 100;
	countc = three / n * 100;
	countd = four / n * 100;
		System.out.printf("1-18: %.2lf",counta);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",countb);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",countc);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",countd);
		System.out.print("%%");

	}

}

