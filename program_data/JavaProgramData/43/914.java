package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int k;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		if (m == 6)
		{
			System.out.print("3 3\n");
		}
		else
		{
			for (k = 1;4 * k + 2 <= m;k++)
			{
				a = 2 * k + 1;
				b = m - a;

				int i = 2;
				while (i * i <= a)
				{
					if (a % i == 0)
					{
						break;
					}
					i++;
				}

				int j = 2;
				while (j * j <= b)
				{
					if (b % j == 0)
					{
						break;
					}
					j++;
				}

				if (i * i > a && j * j > b)
				{
					System.out.printf("%d %d\n",a,b);
				}
			}
		}

		return 0;
	}
}

