package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 3;
		int b;
		int m = 6;
		int i;
		int j;
		int n;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		while (m <= n)
		{
			while (a <= m / 2)
			{

			for (i = 2;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(a))
			{
				b = m - a;

				for (j = 2;j <= Math.sqrt(b);j++)
				{
					if (b % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(b))
				{
					System.out.printf("%d=%d+%d\n",m,a,b);
					a = 3;
					break;
				}
				else
				{
					a += 2;
				}
			}
			else
			{
				a += 2;
			}
			}
			m += 2;
		}
	}
}

