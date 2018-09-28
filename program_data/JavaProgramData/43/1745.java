package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int q;
		int s;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = Math.sqrt(n - 3);
		for (i = 2;i <= k;i++)
		{
			if ((n - 3) % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			System.out.printf("3 %d\n",n - 3);
		}
		for (q = 5;q <= (n / 2);q++)
		{
			k = Math.sqrt(q);
			for (i = 2;i <= k;i++)
			{
				if (q % i == 0)
				{
					break;
				}
			}
			if (i > k)
			{
				s = Math.sqrt(n - q);
				for (i = 2;i <= s;i++)
				{
					if ((n - q) % i == 0)
					{
						break;
					}
				}
				if (i > s)
				{
					System.out.printf("%d %d\n",q,n - q);
				}
			}
		}
	}






}

