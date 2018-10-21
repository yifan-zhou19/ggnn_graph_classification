package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int primeNo = int;
	int m;
	int k;
	int i;
	int t;
	int q;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	if (m < 8)
	{
	System.out.print("6=3+3");
	}
	else
	{
		System.out.print("6=3+3");
		for (n = 8;n <= m;n += 2)
		{
			for (i = 3;i <= (n / 2);i += 2)
			{
					q = n - i;
					if (primeNo(i) != 0 && primeNo(n - i) != 0)
					{
						System.out.printf("\n%d=%d+%d",n,i,q);
						break;
					}
			}
		}

	}
	}
	public static int primeNo(int n)
	{
	int k;
	int i;
	k = Math.sqrt(n);
	for (i = 3;i <= k;i += 2)
	{
			if (n % i == 0)
			{
			break;
			}
	}
		if (i <= k)
		{
		return 0;
		}
		else
		{
		return 1;
		}
	}
}

