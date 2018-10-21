package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		for (n = 1;n <= d;n++)
		{
			a = (int)n / 100;
			b = (int)(n - a * 100) / 10;
			c = n - 100 * a - 10 * b;
			if (n % 7 != 0 && a != 7 && b != 7 && c != 7)
			{
				sum = sum + n * n;
			}
		}
				System.out.printf("%d\n",sum);

	return 0;
	}
}

