package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int flag = 0;
		int t = Math.sqrt(n);
		for (i = 2;i <= t;i++)
		{
			if (n % i == 0)
			{
				flag = 1;
				break;
			}

		}
		if (flag == 1)
		{
		return 0;
		}
		else
		{
		return 1;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i++)
		{
			if ((prime(i) == 1) && (prime(i + 2) == 1))
			{
				System.out.printf("%d %d\n",i,i + 2);
				flag = 1;
			}
		}
		if (flag == 0)
		{
		System.out.print("empty");
		}
		return 0;
	}

}

