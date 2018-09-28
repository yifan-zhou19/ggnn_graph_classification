package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		a = 3;

		while (a <= n / 2)
		{
			i = 3;
			while (i * i <= a)
			{
			if (a % i == 0)
			{
				break;
			}
			else
			{
				i = i + 2;
			}
			}

			if (i * i > a)
			{
				b = n - a;
			 j = 3;
			while (j * j <= b)
			{
				if (b % j == 0)
				{
					break;
				}
			else
			{
				j = j + 2;
			}
			}

			if (j * j > b)
			{
			  System.out.printf("%d %d\n",a,b);
			}
			}

			a = a + 2;
		}
	}
}

