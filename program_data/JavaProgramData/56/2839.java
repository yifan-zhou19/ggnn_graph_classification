package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != a)
		{
			a = n % 10;
			if (a == n)
			{
				break;
			}
			else
			{
				m = m * 10 + a * 10;
			}
			n = n / 10;
		}
		m = m + a;
		System.out.printf("%d",m);
		return 0;
	}

}

