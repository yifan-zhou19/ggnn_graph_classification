package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int m1;
		int m2;
		int flag = 0;
		m1 = n;
		m2 = n / 10;
		while (m1 != 0)
		{
			if ((m1 - 10 * m2) == 7)
			{
				flag = 1;
			}
			m1 = m1 / 10;
			m2 = m2 / 10;
		}
		if (n % 7 == 0)
		{
			flag = 1;
		}
		return flag;
	}
	public static int Main()
	{
		int i;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (f(i) == 0)
			{
				sum += i * i;

			}
		}
		System.out.printf("%d\n",sum);
	}

}

