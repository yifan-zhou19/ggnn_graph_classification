package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
		if (b <= 18)
		{
			c++;
		}
		else if (b <= 35)
		{
			d++;
		}
		else if (b <= 60)
		{
			e++;
		}
		else
		{
			f++;
		}
		}
	System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%\n", 1.0 * c / a * 100, 1.0 * d / a * 100, 1.0 * e / a * 100, 1.0 * f / a * 100);
	return 0;
	}

}

