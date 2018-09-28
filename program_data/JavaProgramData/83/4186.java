package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int n;
		int i;
		int m = 0;
		double s = 0;
		double GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			m += a[i];
		}
		for (i = 1;i < n + 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n + 1;i++)
		{
			if (b[i] > 89)
			{
				s = s + a[i] * 4.0;
			}
			else if (b[i] > 84)
			{
				s = s + a[i] * 3.7;
			}
			else if (b[i] > 81)
			{
				s = s + a[i] * 3.3;
			}
			else if (b[i] > 77)
			{
				s = s + a[i] * 3.0;
			}
			else if (b[i] > 74)
			{
				s = s + a[i] * 2.7;
			}
			else if (b[i] > 71)
			{
				s = s + a[i] * 2.3;
			}
			else if (b[i] > 67)
			{
				s = s + a[i] * 2.0;
			}
			else if (b[i] > 63)
			{
				s = s + a[i] * 1.5;
			}
			else if (b[i] > 59)
			{
				s = s + a[i] * 1.0;
			}
			else
			{
				s = s;
			}
		}
		GPA = 1.0 * s / m;
		System.out.printf("%.2lf",GPA);




	return 0;
	}
}

