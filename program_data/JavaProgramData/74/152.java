package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		if (n % 2 == 0)
		{
			return 0;
		}
		for (i = 3;i <= (int)Math.sqrt(n);i += 2)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int isturn(int n)
	{
		String num = new String(new char[10]);
		int k = 0;
		int i;
		while (n / 10 != 0)
		{
			num = tangible.StringFunctions.changeCharacter(num, k++, n % 10 + '0');
			n = n / 10;
		}
		num = tangible.StringFunctions.changeCharacter(num, k++, n % 10 + '0');
		for (i = 0;i <= k / 2;i++)
		{
			if (num.charAt(i) != num.charAt(k - 1 - i))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t = 1;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (isprime(i) != 0 && isturn(i) != 0)
			{
				if (t == 1)
				{
				System.out.printf("%d",i);
				t = 0;
				flag = 1;
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		System.out.print("\n");
		if (flag == 0)
		{
			System.out.print("no\n");
		}
		return 0;

	}
}

