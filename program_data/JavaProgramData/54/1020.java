package <missing>;

public class GlobalMembers
{
	public static int monkeyApple(int n, int k)
	{
		int i;
		int left;
		int flag;
		int sum;
		for (left = 1; ;left++)
		{
			flag = 1;
			sum = left;
			for (i = 1; i < n; i++)
			{
				if ((n * sum + k) % (n - 1) != 0)
				{
					flag = 0;
					break;
				}
				sum = (n * sum + k) / (n - 1);
			}

			if (i == n && flag == 1)
			{
				sum = n * sum + k;
				break;
			}
		}

		return sum;

	}



	public static int Main()
	{
		int n;
		int k;
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


		System.out.printf("%d\n", monkeyApple(n, k));

		return 0;

	}
}

