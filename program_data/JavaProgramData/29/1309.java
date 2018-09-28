package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int m;
		int t;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			a = 2;
			b = 1;
			sum = 0;
			while (m-- != 0)
			{
				sum += a * 1.0 / b;
				t = a;
				a = a + b;
				b = t;
			}
			System.out.printf("%.3lf\n", sum);
		}
		return 0;
	}


}

