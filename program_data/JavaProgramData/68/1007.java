package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
			if (i > Math.sqrt(x))
			{
				return 1;
			}
			return 0;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				if (f(j) != 0 && f(i - j) != 0)
				{
					System.out.printf("%ld=%ld+%ld\n",i,j,i - j);

					break;
				}
			}


		}
		return 0;
	}

}

