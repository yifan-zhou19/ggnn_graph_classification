package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int k;
		int num;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1 ; ; i++)
		{
			sum = i;
			num = 0;
			while (num < n)
			{
				if (sum - sum / n * n == k)
				{
					sum = sum / n * (n - 1);
					num++;
				}
				else
				{
					break;
				}
			}
			if (sum >= 1 && num == n)
			{
				System.out.printf("%d", i);
				break;
			}
		}
	}

}

