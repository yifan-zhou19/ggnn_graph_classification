package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int sum;
		int getsum = new int(int n1,int k1);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		sum = getsum(n, k);
		System.out.printf("%d",sum);
	}
	public static int getsum(int n1,int k1)
	{
		int i;
		int j = 1;
		int a;
		int sum1;
		while (true)
		{
			sum1 = n1 * j + k1;
			if (n1 == 1)
			{
				return sum1;
			}
			if (n1 > 1)
			{
			for (i = 0;i < n1 - 1;i++)
			{
				if (sum1 % (n1 - 1) == 0)
				{
					sum1 = sum1 * n1 / (n1 - 1) + k1;
					if (i == n1 - 2)
					{
						return sum1;
					}
				}
				else
				{
					break;
				}
			}
			j++;
			}
		}
	}

}

