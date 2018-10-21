package <missing>;

public class GlobalMembers
{
	public static int is_relativeto_7(int n)
	{
		int sh = n;
		if ((n % 7) == 0)
		{
			return 1;
		}
		do
		{
			if ((sh % 10) == 7)
			{
				return 1;
			}
			sh = sh / 10;
		} while (sh > 0);

		return 0;
	}

	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1; i <= n; i++)
		{
			if (is_relativeto_7(i) == 0)
			{
				sum += i * i;
			}
		}

		System.out.printf("%d", sum);
		return 0;
	}
}

