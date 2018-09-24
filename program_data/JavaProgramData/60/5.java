package <missing>;

public class GlobalMembers
{
	public static int prime(int k)
	{
		int i;
		for (i = 3;i <= Math.sqrt(k);i += 2)
		{
			if (k % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 3;i <= n - 2;i += 2)
			{
			if (prime(i) == 1 && prime(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
			}
			}
		}
	}
}

