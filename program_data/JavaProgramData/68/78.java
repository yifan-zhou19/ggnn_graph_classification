package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int i;
		int p = 1;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				p = 0;
				break;
			}
		}
		return p;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 6;
		while (i <= n)
		{
			int j = 3;
			while (j <= i / 2)
			{
				if (prime(j) != 0)
				{
				if (prime(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
				}
				j++;
			}
			i += 2;
		}
		return 0;
	}
}

