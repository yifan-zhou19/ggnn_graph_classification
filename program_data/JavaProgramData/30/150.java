package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int Sum = 0;

	public static int Main()
	{
		int i;
		int f;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= N; i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			x = i;
			f = 1;
			while (x > 0 && f != 0)
			{
				if (x % 10 == 7)
				{
					f = 0;
				}
				x /= 10;
			}
			if (f == 0)
			{
				continue;
			}
			Sum += i * i;
		}
		System.out.printf("%d\n", Sum);

		return 0;
	}


}

