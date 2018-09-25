package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int rev = int a;
		int p = int a;
		int m;
		int n;
		int i;
		int ok = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (rev(i) != 0 && p(i) != 0)
			{
				if (ok != 0)
				{
					ok = 0;
					System.out.printf("%d", i);
				}
				else
				{
					System.out.printf(",%d", i);
				}
			}
		}

		if (ok != 0)
		{
			System.out.print("no");
		}

		return 0;

	}

	public static int rev(int a)
	{
		int b = 0;
		int a1 = a;
		while (a != 0)
		{
			b *= 10;
			b += a % 10;
			a /= 10;
		}
		if (a1 == b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}




	public static int p(int a)
	{
		int i;
		for (i = 2;i * i <= a;i++)
		{
			if ((a % i) == 0)
			{
				return 0;
			}
		}
		return 1;
	}


}

