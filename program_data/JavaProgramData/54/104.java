package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n; //n??????k?????
		int k;
		int p;
		int last_apple;
		int real = 0;
		int now_apple;
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
		for (last_apple = 1;real == 0;last_apple++)
		{
			if (last_apple % (n - 1) == 0)
			{
				now_apple = last_apple / (n - 1) * n + k;
				for (p = 1;p < n;p++)
				{
					if (now_apple % (n - 1) == 0)
					{
						now_apple = now_apple / (n - 1) * n + k;
					}
					else
					{
						p = n;
					}
				}
			}
			if (p == n)
			{
				System.out.printf("%d",now_apple);
				real = 1;
			}
		}
	}
}

