package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int a;
		int b;
		int i;
		int k;
		int leap;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m = m + 2)
		{
			a = 3;

			for (;;a = a + 2)
			{
				for (;a <= m;a = a + 2)
				{
			for (i = 3,leap = 1;i <= Math.sqrt(a);i = i + 2)
			{

				if (a % i == 0 || a % 2 == 0)
				{
					leap = 0;
					break;
				}
			}
				if (leap == 1)
				{
					break;
				}
				}
			b = m - a;
			for (k = 3;k <= Math.sqrt(b);k = k + 2)
			{
			if (b % k == 0 || b % 2 == 0)
			{
			leap = 0;
			break;
			}
			}

			if (leap == 1)
			{
				System.out.printf("%d=%d+%d\n",m,a,b);
				break;
			}


			}

		}
	}

}

