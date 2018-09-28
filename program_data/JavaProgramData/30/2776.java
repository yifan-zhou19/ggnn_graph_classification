package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			if (n % 7 == 0)
			{
				n--;
				continue;
			}
			if (n % 10 == 7)
			{
				n--;
				continue;
			}
			else
			{
				m = n / 10;
			}
			if (m % 10 == 7)
			{
				n--;
				continue;
			}
			else
			{
				a = n * n + a;
				n--;
			}
		}
		System.out.printf("%d\n",a);
		return 0;
	}

}

