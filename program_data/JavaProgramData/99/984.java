package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int k;
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
				k = Integer.parseInt(tempVar2);
			}
			if (k < 19)
			{
			a++;
			}
			else if (k < 36)
			{
				b++;
			}
			else if (k < 61)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf",100.0 * a / n);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",100.0 * b / n);
			System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",100.0 * c / n);
			System.out.print("%%\n");
		System.out.printf("60??: %.2lf",100.0 * d / n);
			System.out.print("%%");
		return 0;
	}
}

