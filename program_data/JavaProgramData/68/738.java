package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (a = 3,b = i - 3;a <= b;a = a + 2,b = b - 2)
			{
				for (j = 3;j < a / 2;j = j + 2)
				{
					if (a % j == 0)
					{
						break;
					}
				}
				for (k = 3;k < b / 2;k = k + 2)
				{
					if (b % k == 0)
					{
						break;
					}
				}
				if (j >= a / 2 && k >= b / 2)
				{
					break;
				}
			}
			if (a <= b)
			{
				System.out.printf("%ld=%ld+%ld\n",i,a,b);
			}
		}
	}
}

