package <missing>;

public class GlobalMembers
{
	public static int ifprime(int n)
	{
		int i;
		int k = (int)Math.sqrt(n);
		for (i = 2;i <= k;i++)
		{
			if ((n % i) == 0)
			{
				return 0;
			}
		}
		return 1;
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
		for (i = 3;i <= n;i++)
		{
			if (i == 5)
			{
				flag = 1;
				System.out.printf("%d %d\n",3,5);
				i = 6;
			}
			else if (i > 5)
			{
				if (ifprime(i) != 0 && ifprime(i - 2) != 0)
				{
					System.out.printf("%d %d\n",i - 2,i);
				}
				i += 5;
				//printf("%d,",i);
			}
		}
		if (flag == 0)
		{
			System.out.print("empty");
		}
	}

}

