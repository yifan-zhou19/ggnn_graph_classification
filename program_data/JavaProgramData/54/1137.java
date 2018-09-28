package <missing>;

public class GlobalMembers
{
	// 2.cpp : Defines the entry point for the console application.
	//



	public static void Main(String[] args)
	{
		int n;
		int k;
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
		int i;
		int m;
		int apple = 1;
		int count;
		while (true)
		{
			count = 0;
			m = apple;
			for (i = 0;i < n;i++)
			{
				if (m % n == k && (m - k) / n >= 1)
				{
					count++;
					m = (m - k) * (n - 1) / n;
				}
				else
				{
					break;
				}
			}
			if (count == n)
			{
				System.out.printf("%d\n",apple);
				break;
			}
			else
			{
				apple++;
			}
		}
	}

}

