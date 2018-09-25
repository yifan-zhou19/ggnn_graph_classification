package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		for (i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int ishuiwen(int n)
	{
		int i;
		int len;
		String a = new String(new char[11]);
		a = String.format("%d", n);
		len = a.length();
		for (i = 0; i < len / 2; i++)
		{
			if (a.charAt(i) != a.charAt(len - i - 1))
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int ishuiwen = int;
		int isprime = int;
		int count = 0;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m; i <= n; i++)
		{
			if (isprime(i) != 0 && ishuiwen(i) != 0)
			{
				count++;
				if (count == 1)
				{
					System.out.printf("%d", i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (count == 0)
		{
			System.out.print("no");
		}
		return 0;
	}


}

