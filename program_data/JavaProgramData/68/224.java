package <missing>;

public class GlobalMembers
{
	public static int check(int n)
	{
		int j;
		for (j = 3;j <= Math.sqrt(n);j += 2)
		{
			if (n % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k < n + 1;k += 2)
		{


				for (i = 3;i <= k / 2;i += 2)
				{
					if (check(i) != 0)
					{
						a = k - i;
						if (check(a) != 0)
						{
								System.out.printf("%d=%d+%d\n", k, i, a);
								break;
						}
					}
				}

		}
	}
}

