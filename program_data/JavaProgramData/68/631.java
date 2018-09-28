package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int k;
		for (k = 3;k <= Math.sqrt(x);k++)
		{
			if (x % k == 0)
			{
				break;
			}
		}
		if (k > Math.sqrt(x))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j < i;j += 2)
			{
				if (prime(j) != 0 && prime(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	}

}

