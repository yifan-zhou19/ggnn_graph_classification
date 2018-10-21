package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int A;
		int B;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = 3;

		for (a = 3;a <= m / 2;a = a + 2)
		{
			b = a;
			for (b = a;b <= m;b = b + 2)
			{
				if (a + b == m)
				{
					A = 1;
					B = 1;
					i = 2;
					for (i = 2;i < a;i++)
					{
						if (a % i == 0)
						{
							A = -1;
						}
					}
					i = 2;
					for (i = 2;i < b;i++)
					{
						if (b % i == 0)
						{
							B = -1;
						}
					}
					if (A == 1 && B == 1)
					{
						System.out.printf("%d %d\n",a,b);
					}
				}
			}
		}
		return 0;
	}

}

