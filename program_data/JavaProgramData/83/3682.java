package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int e = 0;
		double b;
		double c;
		double d;
		double gpa = 0;
		int[] xf = new int[n];
		int[] cj = new int[n];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(xf[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < a;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(cj[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < a;i++)
		{
			if (cj[i] <= 100 && cj[i]>89)
			{
				b = 4.0;
			}
			if (cj[i] > 84 && cj[i] < 90)
			{
				b = 3.7;
			}
			if (cj[i] > 81 && cj[i] < 85)
			{
				b = 3.3;
			}
			if (cj[i] > 77 && cj[i] < 82)
			{
				b = 3.0;
			}
			if (cj[i] > 74 && cj[i] < 78)
			{
				b = 2.7;
			}
			if (cj[i] > 71 && cj[i] < 75)
			{
				b = 2.3;
			}
			if (cj[i] > 67 && cj[i] < 72)
			{
				b = 2.0;
			}
			if (cj[i] > 63 && cj[i] < 68)
			{
				b = 1.5;
			}
			if (cj[i] > 59 && cj[i] < 64)
			{
				b = 1.0;
			}
			if (cj[i] < 60)
			{
				b = 0;
			}
			c = xf[i] * b;
			e = e + xf[i];
			d = d + c;


		}
		gpa = d / e;
	System.out.printf("%.2f",gpa);
	return 0;
	}
}

