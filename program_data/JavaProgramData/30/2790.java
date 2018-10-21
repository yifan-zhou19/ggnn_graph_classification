package <missing>;

public class GlobalMembers
{
	/*?7???????*/

	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int sum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		sum = 0;

		for (a = 0;a <= 9;a++)
		{
			for (b = 0;b <= 9;b++)
			{
				m = a * 10 + b;
				if (m <= n != 0 && a != 7 && b != 7 && (m % 7) != 0)
				{
					sum = sum + m * m;
				}
			}
		}

		System.out.printf("%d",sum);

		return 0;
	}
}

