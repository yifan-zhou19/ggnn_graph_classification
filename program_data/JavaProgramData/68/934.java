package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int zhi = int n;
		int n;
		int k = 6;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (k <= n)
		{
			for (i = 2;i < k;i++)
			{
				if (zhi(i) != 0)
				{
					if (zhi(k - i) != 0)
					{
					System.out.printf("%ld=%ld+%ld\n",k,i,k - i);
				break;
					}
				}
			}
			k = k + 2;
		}
	}
	public static int zhi(int n)
	{
		int i;
		if (n % 2 == 0)
		{
			return 0;
		}
		for (i = 3;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return 0;
			break;
			}
		}
		return 1;
	}




}

