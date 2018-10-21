package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int j;
		int i_limit_a;
		int j_limit_b;
		int bool_a;
		int bool_b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= (m / 2);a = a + 2)
		{
			i_limit_a = Math.sqrt(a);
			bool_a = 1;
			for (i = 3;i <= i_limit_a;i = i + 2)
			{
				if (a % i == 0)
				{
				bool_a = 0;
				break;
				}
			}
			if (bool_a != 0)
			{
				b = m - a;
				bool_b = 1;
				j_limit_b = Math.sqrt(b);
				for (j = 3;j <= j_limit_b;j = j + 2)
				{
					if (b % j == 0)
					{
					bool_b = 0;
					break;
					}
				}
				if (bool_b != 0)
				{
					System.out.printf("%d %d\n",a,b);
				}
			}
		}
		return 0;
	}
}

