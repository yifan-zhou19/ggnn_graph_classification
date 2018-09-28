package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int age;
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		int m4 = 0;
		int q;
		double x1;
		double x2;
		double x3;
		double x4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		q = n;

		while (q > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
			if (age <= 18)
			{
				m1++;
			}
			else if (age >= 19 && age <= 35)
			{
				m2++;
			}
			else if (age >= 36 && age <= 60)
			{
				m3++;
			}
			else if (age >= 61)
			{
				m4++;
			}
			else
			{
				System.out.print("data error\n");
			}
			q--;
		}
		x1 = (double)m1 / (double)n * 100;
		x2 = (double)m2 / (double)n * 100;
		x3 = (double)m3 / (double)n * 100;
		x4 = (double)m4 / (double)n * 100;

		System.out.printf("1-18: %.2lf%%\n",x1);
		System.out.printf("19-35: %.2lf%%\n",x2);
		System.out.printf("36-60: %.2lf%%\n",x3);
		System.out.printf("60??: %.2lf%%\n",x4);
	}



}

