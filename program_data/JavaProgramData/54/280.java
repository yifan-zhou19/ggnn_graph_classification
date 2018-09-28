package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 1;
		int n;
		int k;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (n == 2)
		{
			m = 7;
		System.out.printf("%d",m);
		}
		else
		{
		for (i = 1;i <= n - 1;)
		{
			if ((m * n + k) % (n - 1) == 0)
			{
				m = (m * n + k) / (n - 1);
				i++;
			}
			else
			{
				a = a + 1;
				m = a;
				i = 1;
			}

		}
		m = n * m + k;
		System.out.printf("%d",m);
		}

	}
}

