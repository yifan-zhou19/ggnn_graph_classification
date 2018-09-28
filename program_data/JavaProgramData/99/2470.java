package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[100];
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e;
		double A;
		double B;
		double C;
		double D;
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
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] >= 1 && age[i] <= 18)
			{
				a++;
			}
			else if (age[i] >= 19 && age[i] <= 35)
			{
				b++;
			}
			if (age[i] >= 36 && age[i] <= 60)
			{
				c++;
			}
			if (age[i] >= 61)
			{
				d++;
			}
		}
		e = a + b + c + d;
		A = a / e * 100;
		B = b / e * 100;
		C = c / e * 100;
		D = d / e * 100;
		System.out.printf("1-18: %.2lf%\n",A);
		System.out.printf("19-35: %.2lf%\n",B);
		System.out.printf("36-60: %.2lf%\n",C);
		System.out.printf("60??: %.2lf%\n",D);
		return 0;
	}
}

