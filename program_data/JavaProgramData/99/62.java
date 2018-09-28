package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int a;
		int n;
		int ag1 = 0;
		int ag2 = 0;
		int ag3 = 0;
		int ag4 = 0;
		double p1;
		double p2;
		double p3;
		double p4;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a <= 18)
			{
				ag1++;
			}
			else if (a <= 35)
			{
				ag2++;
			}
			else if (a <= 60)
			{
				ag3++;
			}
			else
			{
				ag4++;
			}

		}
		p1 = (double)ag1 / (double)n * 100;
		p2 = (double)ag2 / (double)n * 100;
		p3 = (double)ag3 / (double)n * 100;
		p4 = (double)ag4 / (double)n * 100;
		System.out.printf("1-18: %.2lf",p1);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",p2);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",p3);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",p4);
		System.out.print("%%\n");
	}
}

