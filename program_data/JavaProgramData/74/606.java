package <missing>;

public class GlobalMembers
{
	public static char isPrime(int n)
	{
		char flag = 1;
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				flag = 0;
				break;
			}
		}
		return flag;
	}

	public static int nDigits(int n)
	{
		int i;
		for (i = 0;n != 0;i++)
		{
			n /= 10;
		}
		return i;
	}

	public static char isPalindrome(int n)
	{
		char flag = 1;
		int d;
		int i;
		for (i = 0,d = nDigits(n) - 1;d > i;i++,d--)
		{
			if ((int)(n / Math.pow(10,i)) % 10 - (int)(n / Math.pow(10,d)) % 10 != 0)
			{
				flag = 0;
			}
		}
		return flag;
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		char flag = 1;
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
		for (i = m;i <= n;i++)
		{
			if (isPrime(i) != null)
			{
				if (isPalindrome(i) != null)
				{
					if (flag != null)
					{
						System.out.printf("%d",i);
						flag = 0;
					}
					else
					{
						System.out.printf(",%d",i);
					}
				}
			}
		}
		if (flag != null)
		{
			System.out.print("no");
		}
		System.out.print("\n");
		return 0;
	}
}

