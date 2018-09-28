package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m = 0;
		int sushu = int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			if (i + 2 <= n)
			{
				if (sushu(i) + sushu(i + 2) == 2)
				{
					m = 1;
					System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
		if (m == 0)
		{
			System.out.print("empty\n");
		}
	}

	public static int sushu(int n)
	{
		int c = 1;
		int i;
		if (n % 2 == 0)
		{
			c = 0;
			return (c);
		}
		else
		{
			for (i = 3;i <= Math.sqrt(n) + 1;i += 2)
			{
				if (n % i == 0)
				{
					c = 0;
				}
			}
		}
		return (c);
	}

}

